package T3.Practica02_obligatoria;

/**
 * @Author Sergey Shevchenko
 */

/*
Dado un número entero que se lee desde teclado,
indicar el número de dígitos que contiene y escribir
los dígitos del número cada uno en una línea empezando
por la unidad.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num, cont = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el numero");
        num = entrada.nextInt();

        if (num < 0)
            num = num * -1;
        else if (num == 0)
            System.out.println(num + " contiene 1 digito.");
        else {
            for (cont = 0; num > 0; cont++) {
                System.out.println(num % 10);
                num = num / 10;
            }
            System.out.println("contiene " + cont + " digitos.");
        }
    }
}
