package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Escribir un programa que cuente el número de palabras en un texto,
que tengan al menoscuatro vocales diferentes
 */
public class ej24_cuentapalabras4Vocales {
    public static int cuentaPalabras(String frase) {
        String vocales = "aeiou";
        frase.toLowerCase();
        int palabras = 0;
        for (int cont = 0, v = 0; cont < frase.length(); cont++) {
            if (frase.charAt(cont) != ' ' & cont + 1 != frase.length())
                for (int aux = 0; aux < vocales.length(); aux++) {
                    if (frase.charAt(cont) == vocales.charAt(aux))
                        v++;
                }
            else {
                if (v >= 4) {
                    palabras++;
                    v = 0;
                } else
                    v = 0;
            }
        }
        return palabras;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la frase a evaluar: ");
        System.out.println("En esta frase se encuentran " + cuentaPalabras(entrada.nextLine()) + " palabras que contengan 4 o mas vocales.");
    }
}
