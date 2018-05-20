package T4.Ejercicios_sobre_cadenas;

import T4.Clase15_01_2018.ArrayList;

import java.util.Scanner;

public class e17_arabigoRomanos {
    public static String repetir(int num, char car) {
        String ret = "";
        for (; num > 0; num--)
            ret += car;
        return ret;
    }

    public static String decimas(int numero, String caracteres) {
        String ret = "";
        do {
            switch (numero) {
                case 1:
                    ;
                case 2:
                    ;
                case 3:
                    return repetir(numero, caracteres.charAt(0));
                case 4:
                    ret += caracteres.charAt(0);
                    numero++;
                    break;
                case 5:
                    ret += caracteres.charAt(1);
                    numero -= 5;
                    break;
                case 6:
                    ;
                case 7:
                    ;
                case 8:
                    ret += caracteres.charAt(1);
                    numero -= 5;
                    break;
                case 9:
                    return "" + caracteres.charAt(2) + caracteres.charAt(0);
            }

        } while (numero != 0);
        return ret;
    }

    public static String convertirArabicoRomano(int numero) {
        String ret = "", caracteres = "IVXLCDMVXLCDM__";
        int cont = 1;
        do {
            ret += decimas(numero % 10, caracteres.substring(cont - 1, cont + 2));
            cont += 2;
            numero = numero / 10;
        } while (numero != 0);
        String aux = "";
        for (cont = ret.length() - 1; cont >= 0; cont--) {
            aux += ret.charAt(cont);
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero a convertir: ");
        System.out.println(convertirArabicoRomano(entrada.nextInt()));
    }
}
