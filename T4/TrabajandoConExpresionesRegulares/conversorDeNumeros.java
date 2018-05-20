package T4.TrabajandoConExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;

public class conversorDeNumeros {
    public static boolean comprobacionBinario(String num) {
        for (int cont = 0; cont < num.length(); cont++) {
            boolean b = Pattern.matches("[01]", "" + num.charAt(cont));
            if (!b)
                return b;
        }
        return true;
    }

    public static boolean comprobacionOctal(String num) {
        for (int cont = 0; cont < num.length(); cont++) {
            boolean b = Pattern.matches("[0-7]", "" + num.charAt(cont));
            if (!b)
                return false;
        }
        return true;
    }

    public static boolean comprobacionHexadecimal(String num) {
        num = num.toUpperCase();
        for (int cont = 0; cont < num.length(); cont++) {
            boolean b = Pattern.matches("[0-9A-E]", "" + num.charAt(cont));
            if (!b)
                return b;
        }
        return true;
    }

    public static String convertirBinario(String num) {
        int ret = 0;
        if (comprobacionBinario(num))
            for (int cont = 0, aux = num.length() - 1; cont < num.length(); cont++, aux--)
                ret += Integer.parseInt(num.charAt(aux) + "") * Math.pow(2, cont);
        else
            return "No es un numero valido";
        return ret + "";
    }

    public static String convertirOctal(String num) {
        int ret = 0;
        if (comprobacionOctal(num))
            for (int cont = 0, aux = num.length() - 1; cont < num.length(); cont++, aux--)
                ret += Integer.parseInt(num.charAt(aux) + "") * Math.pow(8, cont);
        else
            return "No es un numero valido";
        return ret + "";
    }

    private static String caracterHexagecimalABinario(char num) {
        boolean b = Pattern.matches("[0-9]", "" + num);
        String ret = "";
        if (b) {
            int numN = Integer.parseInt(num + "");
            for (int cont = 4; cont > 0; cont--) {
                if (numN % 2 == 1) {
                    ret += '1';
                    numN = (numN - 1) / 2;
                } else {
                    numN = numN / 2;
                    ret += '0';
                }
            }
            String aux = "";
            for (int cont = ret.length() - 1; cont >= 0; cont--)
                aux += ret.charAt(cont);
            return aux;
        } else {
            int numL = (int) (num);
            switch (numL - 64) {
                case 1:
                    return "1010";
                case 2:
                    return "1011";
                case 3:
                    return "1100";
                case 4:
                    return "1101";
                case 5:
                    return "1110";
                case 6:
                    return "1111";
                default:
                    return "";
            }

        }

    }

    public static String convertirHexadecimal(String num) {
        String ret = "";
        num = num.toUpperCase();
        if (comprobacionHexadecimal(num)) {
            for (int cont = 0; cont < num.length(); cont++)
                ret += caracterHexagecimalABinario(num.charAt(cont));
            return convertirBinario(ret);
        } else
            return "No es un numero valido";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        String num = "";
        do {
            System.out.println("1.Introduzca el numero a convertir a decimal.\n" +
                    "2.Convertir desde binario.\n" +
                    "3.Convertir desde octal.\n" +
                    "4.Convertir desde hexadecimal.\n" +
                    "0.Salir\n" +
                    "Escoja una de la opciones anteriores.");
            opc = entrada.nextInt();
            entrada = new Scanner(System.in);
            switch (opc) {
                case 0:
                    System.out.println("Programa realizado por Sergey Shevchenko");
                    break;
                case 1:
                    System.out.println("Introduzca el numero: ");
                    num = entrada.next();
                    break;
                case 2:
                    System.out.println("El numero " + num + " en binario es " + convertirBinario(num));
                    break;
                case 3:
                    System.out.println("El numero " + num + " en octal es " + convertirOctal(num));
                    break;
                case 4:
                    System.out.println("El numero " + num + " en hexadesimal es " + convertirHexadecimal(num));
                    break;
                default:
                    System.out.println("No es una opcion valida.");
            }
        } while (opc != 0);


    }
}
