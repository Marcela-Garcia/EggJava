/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre
0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Clase04;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
Declarar una variable nota de tipo double 
para almacenar la nota ingresada por el usuario y 
asignarle un valor inicial de -1:
         */
        double nota = -1;
        /*
 Utilizar un bucle while para pedir la nota al usuario hasta que la nota 
esté dentro del rango válido de 0 a 10:       
         */
        while (nota < 0 || nota > 10) {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = sc.nextDouble();
            /*
Verificar si la nota ingresada por el usuario está dentro del rango válido 
de 0 a 10 utilizando una estructura de control if. 
Si la nota no está dentro del rango, volver al paso 7 y pedir al 
usuario que ingrese una nota válida.         
             */
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Intente de nuevo.");
            }
        }

        System.out.println("La nota ingresada es: " + nota);
    }
}

/*
Dentro del método main se declaran las variables Scanner sc, int num1, int num2 
y int opcion.
La línea Scanner sc = new Scanner(System.in); crea una instancia de la clase 
Scanner que se utilizará para leer la entrada del usuario por teclado.
La línea int num1, num2, opcion; declara las variables num1, num2 y opcion.
Luego, se inicia un bucle do-while que se ejecutará hasta que el usuario 
seleccione la opción 5 para salir del programa.
Dentro del bucle, se muestra el menú mediante las líneas System.out.println() 
que imprimen las opciones del menú.
La línea opcion = sc.nextInt(); lee la opción seleccionada por el usuario.
El if que sigue verifica que la opción seleccionada sea válida (>=1 y <=4) 
y si lo es, solicita al usuario que ingrese los dos números a operar.
Si la opción seleccionada no es válida, las variables num1 y num2 se establecen 
en 0.
Luego, se utiliza un switch para ejecutar la operación correspondiente 
dependiendo de la opción
 */
