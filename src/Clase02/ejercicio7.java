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
 
/*
En este ejercicio, el método main comienza creando una variable llamada valor 
con el valor 6. Luego, llama a la función esPar con valor como argumento, y el 
resultado se almacena en una variable booleana llamada resultado. Finalmente, 
se imprime el resultado utilizando la función System.out.println().

La función esPar toma un número entero como entrada y comprueba si es par o no. 
Utiliza la operación módulo % para encontrar el resto de la división del número 
por 2. Si el resto es 0, el número es par y la función devuelve true, de lo 
contrario devuelve false.

En resumen, este programa utiliza la función esPar para determinar si un número 
dado es par o no, y lo muestra por pantalla en el método main.

*/