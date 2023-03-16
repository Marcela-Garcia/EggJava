package Clase02;

/*
 * Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba”
Bucles y sentencias de salto break y continue
 */

/**
 *Utilizar la sentencia switch para comparar el valor ingresado con cada uno de los 
 * valores posibles de tipoMotor.
 * La sentencia break permite salir del switch una vez se ha encontrado la opción correspondiente, 
 * y la sentencia default se ejecuta en caso de que ninguna 
 * de las opciones anteriores se cumpla.
 * 
 */
 import java.util.Scanner;
public class ejercicio11 {
   
    public static void main(String[] args) {
        int tipoMotor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor (1-4): ");
        tipoMotor = sc.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
                break;
        }
    }
}


