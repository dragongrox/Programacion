package T4.Clase19_12_2017;

import java.util.Iterator;
import java.util.Scanner;

/*
Estadisticas evaluacion:
Tabla:
 nAlumnos
 nAsignaturas
media por modulo
media por alumno
asignaturas:
Prog
BD
LM
SI
ED
FOL
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int nAlumnos, nAsignaturas = 6;
        System.out.println("Introduzca el numero de alumnos.");
        Scanner entrada = new Scanner(System.in);
        nAlumnos = entrada.nextInt();
        double[][] notas = new double[nAlumnos][nAsignaturas];
        String[] modulos = new String[]{"Programacion", "BD", "LM", "SI", "ED", "FOL"};
        String[] nombres = new String[]{"Pepe ", "Jose ", "Antonio ", "Miguel ", "Sergio "};
        String[] apellidos = new String[]{"Rodríguez ", "Fernández ", "Díaz ", "Pérez ", "González "};
        String[] alumnos = new String[nAlumnos];
        for (int fila = 0; fila < nAlumnos; fila++) {
            for (int columna = 0; columna < nAsignaturas; columna++) {
                notas[fila][columna] = Math.random() * 10 + 1;
            }
            alumnos[fila] = nombres[(int) (Math.random() * 5)] + apellidos[(int) (Math.random() * 5)] + apellidos[(int) (Math.random() * 5)];
        }
        boolean[][] matriculados = new boolean[nAlumnos][nAsignaturas];
        for (int fila = 0; fila < nAlumnos; fila++) {
            for (int columna = 0; columna < nAsignaturas; columna++) {
                if ((int) (Math.random() * 2) == 0)
                    matriculados[fila][columna] = true;
                else
                    matriculados[fila][columna] = false;
                System.out.print(matriculados[fila][columna] + " ");
            }
            System.out.println();
        }
        double media = 0;
        for (int columna = 0; columna < nAsignaturas; columna++) {
            int cont = 0;
            for (int fila = 0; fila < nAlumnos; fila++) {
                if (matriculados[fila][columna] == true) {
                    media += notas[fila][columna];
                    cont++;
                }
            }
            System.out.println("La media del modulo " + modulos[columna] + " es igual a " + String.format("%.2f", media / cont));
            media = 0;
        }

        for (int fila = 0; fila < nAlumnos; fila++) {
            int cont = 0;
            for (int columna = 0; columna < nAsignaturas; columna++) {
                if (matriculados[fila][columna] == true) {
                    media += notas[fila][columna];
                    cont++;
                }
            }
            System.out.print("La media del alumno " + alumnos[fila] + "es de " + String.format("%.2f", media / cont) + " y esta matriculado en ");
            for (int columna = 0; columna < nAsignaturas; columna++) {
                if (matriculados[fila][columna] == true)
                    System.out.print(modulos[columna] + ", ");
            }
            System.out.println();
            media = 0;
        }
    }
}
