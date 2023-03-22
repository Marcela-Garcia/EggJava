package Clase3;


import java.util.Scanner;

//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
//las personas ingresadas por teclado e indique si son mayores o menores de edad.
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
public class Guia3aMayorEdad {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        String respuesta;
        int edad;
        do {
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.next();
            System.out.println("Ingresa la edad de " + nombre);
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor");
            } else {
                System.out.println(nombre + " es menor");
            }
            System.out.println("Desea continuar?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("SI"));
    }
}

/*
do while (respuesta.equalsIgnoreCase("SI"));: Este es un bucle do-while
que se ejecutará al menos una vez y se repetirá mientras el valor de respuesta 
sea igual a "SI" (ignorando las mayúsculas y minúsculas). Este bucle tiene 
todo el código que solicita el nombre y la edad de cada persona, 
imprime los datos de la persona y le pregunta al usuario si desea continuar.
 */
