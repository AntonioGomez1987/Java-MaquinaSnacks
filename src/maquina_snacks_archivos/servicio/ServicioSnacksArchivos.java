package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";

    // Crear lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    // creamos el archivo si no existe
    public ServicioSnacksArchivos(){
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if (existe) {
                this.snacks = obtenerSnacks();
            }
            else { // creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); //Guarda el archiovo en disco
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        // Si no existe, cargamos algunos snacks iniciales
        if (!existe) {
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales() {
        this.agregarSnack(new Snack("Papas", 70));
        this.agregarSnack(new Snack("Refresco", 50));
        this.agregarSnack(new Snack("Sandwich", 120));
    }

    private List<Snack> obtenerSnacks() {
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea: lineas) {
                String[] lineaSnack = linea.split(","); // Parseo separdo por una coma
                var idSnack = lineaSnack[0]; // No se va a usar
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack = new Snack(nombre, precio);
                snacks.add(snack); // Agregamos el snack leido a la lista
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo de snacks: " + e.getMessage());
            e.printStackTrace();
        }
        return  snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // 1. Agregamos el nuevo snack
        this.snacks.add(snack);

        //2. Guardamos el snack en el archivo
        this.agregarSnackArchivo(snack);

    }

    private void agregarSnackArchivo(Snack snack) {
         boolean anexar = false;
         var archivo = new File(NOMBRE_ARCHIVO);
         try {
             anexar = archivo.exists();
             var salida = new PrintWriter(new FileWriter(archivo, anexar));
             salida.println(snack.escribirSnack());
             salida.close(); // Se escribe informacion en el archivo
             System.out.println("Se agrego snack al archivo!");
         } catch (Exception e) {
             System.out.println("Error al agregar snack al archivo: " + e.getMessage());
         }
    }


    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el Inventario ---");
        // Mostramos la lista de snacks en el inventario
        var inventarioSnacks = "";
        for(var snack: this.snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
