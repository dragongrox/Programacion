package T3.Practica02_obligatoria;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Escribir un programa que determine y escriba la descomposición
factorial de los números enteros comprendidos entre 1 900 y 2 000
 */
public class Ejercicio7 {

    public static String descomposicionFactorial(int num) {
        int aux = 2;
        String salida = "";
        do {
            boolean sw = false;
            salida = salida + String.format("%4d", num) + "|";
            do {
                if (num % aux == 0) {
                    num = num / aux;
                    salida = salida + aux + "\n";
                    sw = true;
                } else
                    aux++;
            } while (sw == false);
        } while (num != 1);
        salida = salida + "   1|" + "\n";
        return salida;
    }

    public static void main(String[] args) {
        for (int cont = 1900; cont <= 2000; cont++)
            System.out.println(descomposicionFactorial(cont));
    }
}
