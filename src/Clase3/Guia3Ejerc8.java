/*
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Clase3;

import java.util.Scanner;

public class Guia3Ejerc8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos por lado del cuadrado: ");
        int n = leer.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                //Si estamos en una de estas posiciones, imprimimos un asterisco ("*"
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}

/*
 entramos en dos bucles for anidados para dibujar el cuadrado que va de 1 hasta n
el bucle for, verificamos si la posición actual (i y j) corresponde a una posición 
en el borde del cuadrado (si estamos en la primera o última fila o en la 
primera o última columna). 
*/
    
