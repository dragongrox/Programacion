package T4.EjerciciosBasicosArrayUnidimensionales;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Crea dos arraysunidimensionales que tengan el mismo tamaño (lo pedirá por teclado),
en uno de ellos almacenaras nombres de personas como cadenas, en el otro array o
arreglo ira almacenando la longitud de los nombres, Muestra por pantalla el nombre
y la longitud que tiene.
 */
public class ej7 {

    public static void main(String[] args) {
        System.out.println("Introduzca el tamaño de array");
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        String[] palabras = new String[tam];
        int[] tamanio = new int[tam];
        for (int cont = 0; cont < tam; cont++) {
            System.out.println("Introduzca el nombre: ");
            entrada = new Scanner(System.in);
            palabras[cont] = entrada.nextLine();
            tamanio[cont] = palabras[cont].length();
        }

        for (int cont = 0; cont < palabras.length; cont++)
            System.out.println(palabras[cont] + " " + tamanio[cont]);
    }
}
