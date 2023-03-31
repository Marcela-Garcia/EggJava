/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos
y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa 
los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en 
cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package Guia5;

import java.util.Scanner;

public class extras4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double[][] notas = new double[10][4];
        double[] promedios = new double[10];

        cargarNotas(leer, notas);
        
        calcularPromedios(notas, promedios);

        // Obtener cantidad de aprobados y desaprobados
        int aprobados = contarAprobados(promedios);
        int desaprobados = contarDesaprobados(promedios);

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

    public static void cargarNotas(Scanner leer, double[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1));
            System.out.print("Nota primer TP: ");
            notas[i][0] = leer.nextDouble();
            System.out.print("Nota segundo TP: ");
            notas[i][1] = leer.nextDouble();
            System.out.print("Nota primer integrador: ");
            notas[i][2] = leer.nextDouble();
            System.out.print("Nota segundo integrador: ");
            notas[i][3] = leer.nextDouble();
        }
    }

    public static void calcularPromedios(double[][] notas, double[] promedios) {
        for (int i = 0; i < notas.length; i++) {
            double promedio = 0;
            promedio += notas[i][0] * 0.1;
            promedio += notas[i][1] * 0.15;
            promedio += notas[i][2] * 0.25;
            promedio += notas[i][3] * 0.5;
            promedios[i] = promedio;
        }
    }

    public static int contarAprobados(double[] promedios) {
        int aprobados = 0;
        for (double promedio : promedios) {
            if (promedio >= 7) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public static int contarDesaprobados(double[] promedios) {
        int desaprobados = 0;
        for (double promedio : promedios) {
            if (promedio < 7) {
                desaprobados++;
            }
        }
        return desaprobados;
    }

}
