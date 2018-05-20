package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class e2_contarVocales {
    public static void main(String[] args) {
        System.out.println("Introduzca la cadena: ");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        palabra = palabra.toLowerCase();
        String vocales = "aeiouáéíóú";
        int aux = 0;
        for (int cont = 0; cont < vocales.length(); cont++) {
            for (int pos = 0; pos < palabra.length(); ) {
                if (palabra.indexOf(vocales.charAt(cont), pos) >= 0) {
                    aux++;
                    pos = palabra.indexOf(vocales.charAt(cont), pos) + 1;
                } else
                    pos = palabra.length();
            }
        }
        System.out.println("La cadena contiene " + aux + " vocales.");

    }
}
