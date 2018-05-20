package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e9_caracteresImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String cadena = entrada.nextLine(), carImpar = "";
        System.out.print("Los caracteres impares son ");
        for (int cont = 0; cont < cadena.length(); cont++) {
            if (cont % 2 != 0) {
                System.out.print(cadena.charAt(cont));
            }
        }
        System.out.println(" (contando desde 0)");
    }
}
