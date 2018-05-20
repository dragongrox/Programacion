package T4.Ejercicios_sobre_cadenas;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class e7_contarPalabras {

    public static void main(String[] args) {
        System.out.println("Introduzca una frase para contar sus palabras: ");
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.nextLine();
        System.out.println("contiene " + (e5_encontrarSubcadena.encontrarSubcadena(cadena, " ") + 1) + " palabras");
    }
}
