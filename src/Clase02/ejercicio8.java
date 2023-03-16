package Clase02;

/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
/*
Utilizar el método equals() de la clase String para comparar la frase ingresada 
por el usuario con la palabra "eureka". Si la frase es igual a "eureka",
mostrar un mensaje de "Correcto", de lo contrario mostrar un mensaje de "Incorrecto":
*/


 import java.util.Scanner;
public class ejercicio8 {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             System.out.println("Ingrese una frase:");
             String frase = sc.nextLine();
             
             if (frase.equals("eureka")) {
                 System.out.println("Correcto");
             } else {
                 System.out.println("Incorrecto");
             }}
    }
}
  

