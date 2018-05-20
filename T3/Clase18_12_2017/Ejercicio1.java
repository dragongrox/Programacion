package T3.Clase18_12_2017;

/**
 * @SergeyShevchenko
 */
/*
Array 5x4
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}};

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[filas].length; columnas++) {
                System.out.print(String.format("%02d", array[filas][columnas]) + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int columnas = 0; columnas < array[columnas].length; columnas++) {
            for (int filas = 0; filas < array.length; filas++) {
                System.out.print(String.format("%02d", array[filas][columnas]) + " ");
            }
            System.out.println();
        }
    }
}
