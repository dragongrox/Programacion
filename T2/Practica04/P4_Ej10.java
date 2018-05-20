package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej10 {
    /*
    Programa que lee un número de 3 cifras y muestra sus
    cifras por separado.  Lee 315 y muestra 3 1 5
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        while (num < 100 || num > 999) {
            System.out.println("Introduzca un numero entero de 3 cifras");
            num = teclado.nextInt();
            if (num < 100 || num > 999)
                System.out.println("No es un valor valido");
        }
        System.out.print("Las cifras que forman el numero " + num + " son ");
        int cont = 2, cif;
        while (cont >= 0) {
            cif = (int) (num / Math.pow(10, cont));
            num = (int) (num - cif * Math.pow(10, cont));
            System.out.print(cif + " ");
            cont--;
        }
    }
}
