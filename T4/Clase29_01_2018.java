package T4;

import java.util.Scanner;
import java.util.regex.*;

/*
Cadena compuesta exclusivamente de caracteres y numeros, eliminar los numeros.
 */
public class Clase29_01_2018 {
    public static String eliminarNumeros(String cad) {
        String ret = "";
        for (int cont = 0; cont < cad.length(); cont++) {
            boolean b = Pattern.matches("\\D", "" + cad.charAt(cont));
            if (b)
                ret += cad.charAt(cont);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introzca la cadena");
        System.out.println("La cadena tratada seria " + eliminarNumeros(entrada.nextLine()));
    }
}
