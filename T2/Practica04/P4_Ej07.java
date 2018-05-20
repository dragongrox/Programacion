package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej07 {
    /*
    Programa Java que pida las notas de las tres evaluaciones
    de un alumno y calcule la nota final (media). La nota final es un numero entero
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las notas de las 3 evaluaciones.");
        float nota, tot = 0;
        int cont = 0;

        while (cont < 3) {
            nota = teclado.nextFloat();
            if (nota >= 1 && nota <= 10) {
                tot = tot + nota;
                cont++;
            } else
                System.out.println("No es un valor valido");
        }
        cont = (int) tot / 3;
        if (tot % 3 >= 0.5)
            cont++;
        System.out.println("Nota final = " + cont);

        teclado.close();
    }
}
