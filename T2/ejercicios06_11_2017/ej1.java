package T2.ejercicios06_11_2017;
/**
 * @Author Sergey Shevchenko
 */

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        /*
        Indica si un caracter introducido desde teclado es vocal o no
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un caracter ");
        char car = teclado.next().charAt(0);
        if (car == 'a' || car == 'o' || car == 'u' || car == 'e' || car == 'i' || car == 'y')
            System.out.println("Es una vocal");
        else
            System.out.println("Es una consonante");
        teclado.close();
    }

}
