package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e18_letrasNoEncontradas {
    public static String letrasNoEncontradas(String frase) {
        String letras = "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM", ret = "";
        for (int cont = 0; cont < letras.length(); cont++) {
            for (int cont2 = 0; cont2 < frase.length(); cont2++) {
                if (!frase.substring(cont2, cont2 + 1).matches(letras.charAt(cont) + "")) {
                    ret += letras.charAt(cont);
                    cont2 = frase.length();
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la frase ");
        System.out.println(letrasNoEncontradas(entrada.nextLine()) + " son las letras no encontradas.");
    }
}
