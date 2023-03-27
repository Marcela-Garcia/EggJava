/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).

 */
package Guia5;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Declaración de variables
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        boolean antisimetrica = true;

        // Comprobar si la matriz es antisimétrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) { //negativo
                    antisimetrica = false;
                    break;
                }
            }
            if (!antisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (antisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz NO es antisimétrica");
         }
    }

}
    
//Para comprobar si la matriz es antisimétrica se usa un par de bucles for anidados 
//para comparar cada elemento de la matriz con su correspondiente en la matriz traspuesta, pero negativo. 
//Si en algún momento se encuentra un elemento que no cumple la condición, se cambia el valor 
//de antisimetrica a falso y se sale de los bucles.