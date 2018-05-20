package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e20_encontrarCadenaPosicion {
    public static int encontrarSubcadena(String palabra, String subcadena, int posicion) {
        int aux = 0;
        for (int cont = 0, sw = 0; cont < palabra.length(); ) {
            for (int pos = posicion; pos < subcadena.length() && cont < palabra.length(); cont++)
                if (palabra.charAt(cont) == subcadena.charAt(pos)) {
                    sw++;
                    pos++;
                } else
                    pos = 0;
            if (sw == subcadena.length())
                return posicion;
            else
                cont = palabra.length();
            sw = 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cadena");
        String cadena = entrada.nextLine();
        System.out.println("Introduzca la subcadena a buscar");
        String subcadena = entrada.nextLine();
        System.out.println("Introduzca la pòsicion desde la cual empezar.");
        System.out.println("La cadena se ha encontrado en la posicion " + encontrarSubcadena(cadena, subcadena, entrada.nextInt()));
    }
}
