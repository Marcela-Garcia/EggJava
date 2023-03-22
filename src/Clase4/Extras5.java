/*
 * Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.Solicite una letra (carácter) que representa la clase de un socio, 
y luego un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.

 */
package Clase4;

import java.util.Scanner;

public class Extras5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la clase del socio (A, B o C): ");
        String clase = leer.next();

        System.out.print("Ingrese el costo del tratamiento: ");
        double costo = leer.nextDouble();// leer la entrada del usuario y almacenarla en una variable llamada "costo".

        double descuento = 0; 

        switch (clase) { //para determinar el descuento según la clase del socio 
            case "A":
                descuento = 0.5;
                break;
            case "B":
                descuento = 0.35;
                break;
            case "C":
                descuento = 0;
                break;
            default:
                System.out.println("Clase de socio inválida.");
                System.exit(0);
        }

        double costoConDescuento = costo * (1 - descuento); //Se calcula el costo con descuento multiplicando el costo por (1 - descuento).
        System.out.println("El importe a pagar es: " + costoConDescuento);

          }
}
