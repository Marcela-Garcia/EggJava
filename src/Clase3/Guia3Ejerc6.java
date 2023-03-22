 package Clase3;

/* Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
import java.util.Scanner;

public class Guia3Ejerc6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");

            opcion = leer.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = leer.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = leer.nextInt();
            } else {
                num1 = 0;
                num2 = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("La división es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println();

        } while (opcion != 5);
       
    }

}

    /*
se inicia un bucle do-while que se ejecutará hasta que el usuario 
seleccione la opción 5 para salir del programa.
El if que sigue verifica que la opción seleccionada sea válida (>=1 y <=4) 
Si la opción seleccionada no es válida, las variables num1 y num2 se 
establecen en 0.
switch para ejecutar la operación segun opcion
     */
