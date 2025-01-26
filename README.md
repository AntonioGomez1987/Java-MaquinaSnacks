# **Proyecto: Máquina de Snacks**

Este proyecto es una aplicación de consola en Java que simula una máquina de venta de snacks. Permite realizar operaciones como comprar snacks, generar tickets de compra, y agregar nuevos snacks al inventario.

## Características principales

* Compra de Snacks: Los usuarios pueden seleccionar snacks por su identificador.

* Generación de Ticket: Se genera un resumen de la compra con el total a pagar.

* Agregado de Nuevos Snacks: Posibilidad de ampliar el inventario agregando nuevos productos.

* Menú Interactivo: Navegación mediante un menú de opciones.

## Tecnologías

* **Lenguaje: Java**

## Estructura del proyecto

**El código principal está dividido en varias clases:**

* MaquinaSnacks: Clase principal que gestiona el flujo del programa.

* Snack: Clase que representa un producto con atributos como id, nombre y precio.

* Snacks: Clase utilitaria que gestiona el inventario de snacks.

## Cómo ejecutar el proyecto

Clona este repositorio en tu equipo.

git clone ``` https://github.com/usuario/maquina-snacks.git ```

Abre el proyecto en tu IDE favorito (como IntelliJ IDEA o Eclipse).

Compila y ejecuta la clase MaquinaSnacks.

Sigue las instrucciones del menú interactivo en la consola.

## Instrucciones de uso

Al iniciar la aplicación, se muestra un menú con las siguientes opciones:

* Comprar Snack: Introduce el ID del snack que deseas comprar.

* Mostrar Ticket: Visualiza el ticket con los productos comprados y el total a pagar.

* Agregar Nuevo Snack: Ingresa el nombre y precio de un nuevo snack para agregarlo al inventario.

* Salir: Finaliza la aplicación.

## Ejemplo de salida

### Inicio del programa:
```
*** Máquina de Snacks ***
Lista de snacks disponibles:
1. Papas - $1.50
2. Galletas - $1.00
3. Refresco - $2.00

Menú:
1. Comprar snack
2. Mostrar ticket
3. Agregar nuevo snack
4. Salir
   Elige una opción: 1
   Que snack quieres comprar (id)? 1
   Ok, Snack agregado: Papas - $1.50

Menú:
...

Ticket de venta:

*** Ticket de Venta ***
- Papas - $1.50
Total -> $1.50
```

## Próximas mejoras

Validación más robusta de entradas del usuario.

Persistencia de datos utilizando un archivo o base de datos.

Sistema de inventario más avanzado con control de stock.

### Contribuciones

Es un ejercicio realizando un curso de Java en la plataforma Udemy, impartido por el Instructor Ubaldo Acosta.

## Autor

### Jose Antonio Gomez

### GitHub: 
``` https://github.com/AntonioGomez1987 ```



