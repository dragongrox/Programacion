package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej12 {
    /*
    Programa que lea un carácter y compruebe si es un número
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char car = teclado.next().charAt(0);

        if (car <= 57 && car >= 48)
            System.out.println("Es un numero");
        else
            System.out.println("No es un numero");
        teclado.close();
    }
}
