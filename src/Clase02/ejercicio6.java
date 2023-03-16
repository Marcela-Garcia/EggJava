package Clase02;

/*
 * Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
public class ejercicio6 {

  public static void main(String[] args) {
    int valor1 = 10;
    int valor2 = 15;
    int resultado = compararNumeros(valor1, valor2);
    System.out.println("El mayor número es: " + resultado);
  }

  public static int compararNumeros(int numero1, int numero2) {
    if (numero1 > numero2) {
      return numero1;
    } else {
      return numero2;
   }
  }

}
