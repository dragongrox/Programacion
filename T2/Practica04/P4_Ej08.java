package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej08 {
    /*
    Programa que pida al usuario un valor para una variable X
    y calcule y escriba el valor de y en la función y = 6x^2+ 8x - 17.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el valor de x para la funcion y = 6x^2+ 8x - 17");
        float x = teclado.nextFloat();
        System.out.println("y=" + (6 * Math.pow(x, 2) + 8 * x - 17));

        teclado.close();
    }
}
