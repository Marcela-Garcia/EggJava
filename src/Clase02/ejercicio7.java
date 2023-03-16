package Clase02;

/*
 * Crear un programa que dado un numero determine si es par o impar.
 */

public class ejercicio7 {

  public static void main(String[] args) {
    int valor = 6;
    boolean resultado = esPar(valor);
    System.out.println("El número es par: " + resultado);
  }

  public static boolean esPar(int numero) {
    if (numero % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

}
 
