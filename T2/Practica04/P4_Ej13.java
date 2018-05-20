package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej13 {
    /*
    Dado un número entero que se introduce por teclado,
    determinar si  se encuentra  en   el  intervalo  cerrado  51 – 100
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int num = teclado.nextInt();
        if (num >= 51 && num <= 100)
            System.out.println("El numero esta en el intervalo");
        else
            System.out.println("El numero no esta en el intervalo");
        teclado.close();
    }
}
