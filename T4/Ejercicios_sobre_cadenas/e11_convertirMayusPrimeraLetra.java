package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e11_convertirMayusPrimeraLetra {
    public static boolean letra(char letra) {
        if (letra >= 65 && letra <= 90 || letra >= 97 && letra <= 122)
            return true;
        else
            return false;
    }

    public static String covertirPalabra(String palabra) {
        return palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
    }

    public static String convertirFrase(String frase) {
        String ret = "";
        frase = frase + " ";
        for (int cont = 0, aux = 0; cont < frase.length(); cont++) {
            if (' ' != frase.charAt(cont))
                aux++;
            else {
                if (letra(frase.charAt(cont - aux))) {
                    ret += covertirPalabra(frase.substring(cont - aux, cont)) + " ";
                    aux = 0;
                } else {
                    ret += frase.substring(cont - aux, cont) + " ";
                    aux = 0;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la frase: ");
        String frase = entrada.nextLine();
        System.out.println("La frase convertida seria " + convertirFrase(frase));

    }
}
