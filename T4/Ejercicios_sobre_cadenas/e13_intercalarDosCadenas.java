package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e13_intercalarDosCadenas {
    public static String intercalar(String cad1, String cad2) {
        String aux = "";
        if (cad1.length() < cad2.length()) {
            aux = cad1;
            cad1 = cad2;
            cad2 = aux;
            aux = "";
        }
        for (int cont = 0; cont < cad1.length(); cont++) {
            aux += cad1.charAt(cont);
            if (cont < cad2.length())
                aux += cad2.charAt(cont);
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca las dos cadenas a intercalar (sin espacios)");
        System.out.println("Las cadenas intercaladas serian " + intercalar(entrada.next(), entrada.next()));
    }
}
