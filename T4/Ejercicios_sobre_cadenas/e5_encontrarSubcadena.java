package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class e5_encontrarSubcadena {
    public static int encontrarSubcadena(String palabra, String subcadena) {
        int aux = 0;
        for (int cont = 0, sw = 0; cont < palabra.length(); ) {
            for (int pos = 0; pos < subcadena.length() && cont < palabra.length(); cont++)
                if (palabra.charAt(cont) == subcadena.charAt(pos)) {
                    sw++;
                    pos++;
                } else
                    pos = 0;
            if (sw == subcadena.length())
                aux++;
            else
                cont = palabra.length();
            sw = 0;
        }
        return aux;
    }

    public static void main(String[] args) {
        System.out.println("Introduzca la cadena: ");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        palabra = palabra.toLowerCase();
        System.out.println("Introduzca la subcadena a buscar: ");
        String cad = entrada.next();
        cad = cad.toLowerCase();
        System.out.println("La cadena contiene " + (encontrarSubcadena(palabra, cad)) + " subcadenas.");
    }
}
