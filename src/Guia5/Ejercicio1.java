/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package Guia5;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        llenarVector();
        
    }
    
    public static int[] llenarVector(){
        
        int[] vector = new int[100];
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        
        mostrarVector(vector);
        
        return vector;
    }
    
    public static void mostrarVector(int[] vector){
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
         }
     }

    