package T4.EjerciciosBasicosArrayUnidimensionales;

import java.util.Scanner;

/**
 * @Author Sergeyb Shevchenko
 */
/*
Array de 10 elementos el cual calcula la media de los
númerosnegativos y positivos del mismo, númerosingresados por teclado.
 */
public class ej8 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Introduzca un numero: ");
            num[cont] = entrada.nextInt();
        }
        int negativos = 0, positivos = 0, aux = 0;
        for (int cont = 0; cont < 10; cont++) {
            if (num[cont] < 0)
                negativos += num[cont];
            else {
                positivos += num[cont];
                aux++;
            }
        }
        System.out.println("La media de los numero negativos es " + (float) negativos / (10 - aux));
        System.out.println("La media de los numero positivos es " + (float) positivos / aux);
    }
}
