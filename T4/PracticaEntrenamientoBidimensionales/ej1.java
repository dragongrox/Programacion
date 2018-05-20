package T4.PracticaEntrenamientoBidimensionales;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */

public class ej1 {
    public static void main(String[] args) {
        String[] libros = {"titulo 1", "titulo 2", "titulo 3", "titulo 4", "titulo 5", "titulo 6"};
        String[] casetas = {"Caseta nº 1", "Caseta nº 2", "Caseta nº 3"};
        int[][] ventas = new int[libros.length][casetas.length];
        Scanner entrada = new Scanner(System.in);
        for (int f = 0, c = 0; c < ventas[0].length; c++) {
            for (f = 0; f < ventas.length; f++) {
                System.out.println("Introduzca las ventas del " + libros[f] + " en la " + casetas[c]);
                ventas[f][c] = entrada.nextInt();
            }
        }
        int[] numTot = new int[casetas.length];
        System.out.println("Recuento: ");
        for (int f = 0, c = 0; c < ventas[0].length; c++) {
            for (f = 0; f < ventas.length; f++) {
                numTot[c] += ventas[f][c];
                System.out.print(ventas[f][c] + " ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        String casetaMax = "";
        for (int cont = 0; cont < numTot.length; cont++) {
            System.out.println(casetas[cont] + " ha vendido " + numTot[cont] + " ejemplares.");
            if (numTot[cont] > max) {
                max = numTot[cont];
                casetaMax = casetas[cont];
            }
        }
        System.out.println(casetaMax + " es la que mas libros ha vendido");
        int min = Integer.MAX_VALUE;
        String casetaMin = "";
        for (int f = 0; f < ventas.length; f++)
            for (int c = 0; c < ventas[f].length; c++) {
                if (f == 5) {
                    System.out.println("En " + casetas[c] + " se han vendido " + ventas[f][c] + " ejemplares de El Juego del Ángel");
                    if (ventas[f][c] < min) {
                        min = ventas[f][c];
                        casetaMin = casetas[c];
                    }
                }
            }
        System.out.println("En la caseta que menos se vendio el ejemplar de El Juego del Ángel es " + casetaMin);


    }
}
