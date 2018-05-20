package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
(52)-5-6284000
 */
public class e12_convertirTelefono {
    public static boolean numeroValido(char num) {
        if (num >= 48 && num <= 57)
            return true;
        else
            return false;
    }

    protected static boolean telefonoValido(String num) {
        for (int cont = 0; cont < num.length(); cont++)
            if (!numeroValido(num.charAt(cont)) || num.length() != 10)
                return false;
        return true;
    }

    public static String convertirNumero(String num) {
        if (telefonoValido(num))
            return "(" + num.substring(0, 2) + ")" + "-" + num.substring(2, 3) + "-" + num.substring(3);
        else
            return "Numero invalido";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero (longitud 10): ");
        String num = entrada.next();
        System.out.println("El numero convertido seria " + convertirNumero(num));
    }
}
