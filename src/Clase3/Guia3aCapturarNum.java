/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
 */
package Clase3;

import java.util.Scanner;

public class Guia3aCapturarNum {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        while (contador < 20) { // Se leen 20 números
            System.out.println("Ingrese un número:");
            int numero = leer.nextInt();
            if (numero == 0) { // Si el número es 0, se sale del bucle
                System.out.println("Se capturó el número cero.");
                break;
            }
            if (numero > 0) { // Si el número es positivo, se suma
                suma += numero;
            }
            contador++; // Se incrementa el contador
        }
        System.out.println("La suma de los números ingresados es: " + suma);

    }

}
/*
int suma = 0;: Declara una variable entera llamada suma e inicializa su valor en
0.
int contador = 0;: Declara una variable entera llamada contador e inicializa su 
valor en 0.
while(contador < 20) {...}: Inicia un bucle while que se ejecuta mientras la 
variable contador es menor que 20.int numero = sc.nextInt();: Lee un número entero ingresado por el usuario y lo 
guarda en la variable numero.
if(numero == 0) {...}: Si el número ingresado es igual a 0, muestra en la 
consola el mensaje "Se capturó el número cero." y sale del bucle utilizando la 
sentencia break.
if(numero > 0) {...}: Si el número ingresado es mayor que 0, lo suma a la 
variable suma.
contador++;: Incrementa la variable contador en 1. */
