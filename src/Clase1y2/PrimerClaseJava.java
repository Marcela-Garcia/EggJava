/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1y2;
import java.util.Scanner;
public class PrimerClaseJava {

       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Hola " + nombre + "!");
    }
}
