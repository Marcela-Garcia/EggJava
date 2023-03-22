/*
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar
 */
package Clase4;

/*
no requiere la utilización de la clase Scanner ya que no solicita la entrada 
de datos por parte del usuario.el programa declara e inicializa 
las variables con valores predefinidos en el código.
 */
public class Extras2 {

    public static void main(String[] args) {
        int A = 10, B = 20, C = 30, D = 40; // declara e inicializa

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D); // imprime los valores iniciales

        int aux = B; // se guarda el valor de B en una variable auxiliar
        B = C; // se asigna el valor de C a B
        C = A; // se asigna el valor de A a C
        A = D; // se asigna el valor de D a A
        D = aux; // se asigna el valor de la variable auxiliar a D

        System.out.println("Valores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D); // imprime los valores finales
    }
}
