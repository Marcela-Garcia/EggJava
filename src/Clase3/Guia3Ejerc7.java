/*
 * Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package Clase3;

import java.util.Scanner;

public class Guia3Ejerc7 {

    
    public static void main(String[] args) {
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        String cadenaDeEntrada = "";

        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Ingrese una cadena: ");
            cadenaDeEntrada = leer.nextLine();

            if (cadenaDeEntrada.equals("&&&&&")) {
                break;
            } else if (cadenaDeEntrada.length() == 5 && cadenaDeEntrada.substring(0, 1).equals("X") && cadenaDeEntrada.substring(4, 5).equals("O")) {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        } while (true);

        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);

    }

}
//LENGHT: DEVUELVE LONGITUD DE LA CADENA
//SUBSTRING: DEVUELVE UNA CADENA DE LA CADENA ORIGINAL
//EQUALS: COMPARAR DOS CADENAS Y DEVUELVE TRUE SI SON IGUALES Y FALSE SI NO LO SON.
