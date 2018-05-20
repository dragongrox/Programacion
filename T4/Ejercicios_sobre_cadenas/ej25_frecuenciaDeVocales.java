package T4.Ejercicios_sobre_cadenas;

import T4.Clase15_01_2018.ArrayList;

import java.util.Scanner;

/*
Escriba un programa que calcule la frecuencia de aparición
de las vocales de un texto proporcionado por el usuario.
Esta solución se debe presentar en forma de histograma, por ejemplo:
 */
public class ej25_frecuenciaDeVocales {
    public static String frecuenciaV(String text) {
        String vocales = "aeiou";
        int[] recuento = new int[vocales.length()];
        for (int cont = 0; cont < text.length(); cont++) {
            for (int aux = 0; aux < vocales.length(); aux++) {
                if (text.charAt(cont) == vocales.charAt(aux))
                    recuento[aux]++;
            }
        }
        String ret = "";
        for (int cont = 0; cont < vocales.length(); cont++) {
            ret += vocales.charAt(cont) + " " + recuento[cont] + " ";
            for (int aux = 0; aux < recuento[cont]; aux++)
                ret += "*";
            ret += "\n";
        }
        return ret;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el texto para hacer el recuento: ");
        System.out.println(frecuenciaV(entrada.nextLine()));
    }
}
