package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej11 {
    /*
    Programa que lea un número entero N de 5 cifras y muestre
    sus cifras desde el final.  Lee 12345 y escribe 5 4 3 2 1
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        while (n < 10000 || n > 99999) {
            System.out.println("Introduzca un numero entero de 3 cifras");
            n = teclado.nextInt();
            if (n < 10000 || n > 99999)
                System.out.println("No es un valor valido");
        }
        System.out.print("Las cifras que forman el numero " + n + " son ");
        int cif;
        while (n > 0) {
            cif = n % 10;
            n = n / 10;
            System.out.print(cif + " ");
        }
    }
}
