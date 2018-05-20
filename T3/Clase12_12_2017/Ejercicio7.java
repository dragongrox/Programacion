package T3.Clase12_12_2017;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Crea dos arrays unidimensionales que tengan  el mismo tamaño  (lo pedira  por
teclad0), en uno de ellos almacenaras nombres de personas como cadenas, en el
otro array o arreglo ira almacenando la longuitud de los nombres. Muestra por
pantalla el nombre y la longitud que tiene.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanio = 1;
        do {
            System.out.println("Introduzca el tamaño del array ");
            tamanio = entrada.nextInt();
            if (tamanio < 1)
                System.out.println("No es un valor valido. ");
        } while (tamanio < 1);

        String[] nombres = new String[tamanio];
        int[] longitud = new int[tamanio];

        for (int cont = 0; cont < tamanio; cont++) {
            System.out.println("Introduzca el nombre");
            nombres[cont] = entrada.next();
            longitud[cont] = nombres[cont].length();
        }

        for (int cont = 0; cont < tamanio; cont++) {
            System.out.println(nombres[cont] + " tiene  una longitud de " + longitud[cont]);
        }
    }
}
