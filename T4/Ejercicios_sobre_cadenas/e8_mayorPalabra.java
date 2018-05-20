package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e8_mayorPalabra {
    public static int palabraMayor(String frase) {
        int aux = 0, tamMayor = 0, posMayor = 0;
        for (int cont = 0; cont < frase.length(); cont++) {
            if (' ' != (frase.charAt(cont)) && cont + 1 < frase.length())
                aux++;
            else if (tamMayor < aux) {
                tamMayor = aux;
                posMayor = cont - aux;
                aux = 0;
            } else
                aux = 0;
        }
        System.out.println("La palabra mas grande es " + frase.substring(posMayor, (posMayor + tamMayor + 1)) + " y contiene " + tamMayor + "caracteres.");
        return tamMayor;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la frase.");
        String frase = entrada.nextLine();
        palabraMayor(frase);
    }
}
