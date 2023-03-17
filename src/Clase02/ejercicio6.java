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
/*
El método compararNumeros toma dos parámetros de entrada, numero1 y numero2, 
que son dos números enteros. Luego, se compara si numero1 es mayor que numero2 
utilizando una estructura if-else (SiNo) Si numero1 es mayor que numero2, se devuelve 
numero1, de lo contrario se devuelve numero2. 
Por lo tanto, este método devuelve el número mayor de los dos números 
proporcionados.
*/