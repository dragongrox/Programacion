package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class e4_invertirCadena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cadena que desea invertir: ");
        String cadena = entrada.nextLine();
        String aux = "";
        for (int cont = cadena.length() - 1; cont >= 0; cont--) {
            aux += cadena.charAt(cont);
        }
        System.out.println("La cadena " + cadena + " invertida es " + aux);
    }
}
