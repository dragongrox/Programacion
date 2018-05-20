package T4.Ejercicios_sobre_cadenas;

import java.util.ArrayList;
import java.util.Scanner;

public class e6 {
    public static String cadenas(String cadena) {
        String ret = "";
        if (cadena.length() % 2 == 0) {
            ArrayList<Integer> num = new ArrayList<Integer>();
            ArrayList<Character> letr = new ArrayList<Character>();
            for (int cont = 0; cont < cadena.length(); cont++) {
                if (cont % 2 == 0)
                    if (cadena.charAt(cont) >= 48 && 57 >= 57)
                        num.add(Integer.parseInt("" + cadena.charAt(cont)));
                    else
                        return "formato invalido";
                else
                    letr.add(cadena.charAt(cont));
            }
            for (int cont = 0; cont < cadena.length() / 2; cont++)
                for (int i = 0; i < num.get(cont); i++)
                    ret += letr.get(cont);
        } else
            ret = "Formato invalido";
        return ret;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la secuencia: ");
        String secuencia = entrada.next();
        System.out.println(cadenas(secuencia));
    }
}
