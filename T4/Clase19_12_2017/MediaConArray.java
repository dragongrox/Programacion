package T4.Clase19_12_2017;

import java.util.Scanner;

/*
Calcular la media de cada alumno
cuantos alumnos superan la media
Cuantos alumnos estan aprobados
Calcular la media de cada evaluacion
nº de alumnos se pide por teclado
 */
public class MediaConArray {


    public static void main(String[] args) {
        System.out.println("Introduzca el munero de alumnos");
        Scanner entrada = new Scanner(System.in);
        int alumnos = entrada.nextInt();
        int array[][] = new int[alumnos][3];
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[filas].length; columnas++) {
                array[filas][columnas] = (int) (Math.random() * 10 + 1);
            }
        }
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[filas].length; columnas++) {
                System.out.print(String.format("%02d", array[filas][columnas]) + " ");
            }
            System.out.println();
        }

        for (int filas = 0; filas < array.length; filas++) {
            float mediaAlumno = 0;
            for (int columnas = 0; columnas < array[filas].length; columnas++)
                mediaAlumno = mediaAlumno + array[filas][columnas];
            System.out.println("La media del alumno " + (filas + 1) + " es de " + (mediaAlumno / alumnos));
        }

        for (int columnas = 0; columnas < array[array.length].length; columnas++) {
            double mediaEvaluacion = 0;
            for (int filas = 0; filas < array.length; filas++) {
                mediaEvaluacion += array[filas][columnas];
            }
            System.out.println("La media de la evaluacion " + (columnas + 1) + " es de " + String.format("%.2f", mediaEvaluacion / alumnos));
        }
        double mediaTotal = 0;
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[filas].length; columnas++) {
                mediaTotal += array[filas][columnas];
            }
        }
        System.out.println("La media total es de " + String.format("%.2f", mediaTotal / alumnos));
    }
}
