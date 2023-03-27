package Guia3;

/*
 * Crear un programa que dado un numero determine si es par o impar.
 */

public class Guia3Ejerc1 {

  public static void main(String[] args) {
    int valor = 100;
    boolean resultado = esPar(valor);
    System.out.println("El número es par: " + resultado);
  }

  public static boolean esPar(int numero) {
      return numero % 2 == 0;
  }

}
 
/*
La función esPar toma un número entero como entrada y comprueba si es par o no. 
Utiliza la operación módulo % para encontrar el resto de la división del número 
por 2. Si el resto es 0, el número es par y la función devuelve true, de lo 
contrario devuelve false.

*/