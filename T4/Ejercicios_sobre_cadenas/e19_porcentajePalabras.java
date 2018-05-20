package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e19_porcentajePalabras {
    public static int[] palabrasMenores(String frase) {
        int[] recuento = new int[2];
        for (int cont = 0, aux = 0; cont < frase.length(); cont++) {
            if (frase.charAt(cont) != ' ' && cont < frase.length() - 1)
                aux++;
            else {
                aux++;
                if (aux < 5) {
                    recuento[0]++;
                    aux = 0;
                } else {
                    recuento[1]++;
                    aux = 0;
                }
            }
        }
        return recuento;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la frase");
        int[] recuento = palabrasMenores(entrada.nextLine());
        System.out.println("Hay " + String.format("%.2f", (float) ((100 * recuento[0]) / (recuento[0] + recuento[1]))) + " palabras menores que 5.");
        System.out.println("Hay " + String.format("%.2f", (float) ((100 * recuento[1]) / (recuento[0] + recuento[1]))) + " palabras mayores o iguales que 5.");
    }
}
