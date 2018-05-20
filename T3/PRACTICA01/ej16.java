package T3.PRACTICA01;

import java.util.Scanner;

/**
 * Escribir un programa que calcule y visualice 1! + 2! + 3! + ... + (n-1)! + n! donde n es un dato de entrada.
 */
public class ej16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        while (n < 1) {
            System.out.println("Introduzca el valor de n");
            n = entrada.nextInt();
            if (n < 1)
                System.out.println("Es un valor no valido");
        }
        for (int cont = 1; cont <= n; cont++)
            if (n == cont)
                System.out.println(cont + "!");
            else
                System.out.print(cont + "! + ");
    }
}
