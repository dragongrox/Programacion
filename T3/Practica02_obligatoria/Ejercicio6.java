package T3.Practica02_obligatoria;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Diseñar e implementar un programa que solicite a su usuario un valor no
negativo n y visualice la siguiente salida:
1 2 3 ........ n-1 n
1 2 3 ........ n-1
...
1 2 3
1 2
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n;
        do {
            System.out.println("Introduzca el valor de n");
            n = entrada.nextFloat();
            if (n < 0)
                System.out.println("No es un valor valido");
        } while (n < 0);
        for (; n > 1; n--) {
            for (int cont2 = 1; cont2 <= n; cont2++)
                System.out.print(cont2 + " ");
            System.out.println();
        }
    }
}
