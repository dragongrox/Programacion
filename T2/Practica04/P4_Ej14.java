package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej14 {
    /*
    Dado un número que se introduce por teclado, si es
    positivo verificar si se encuentra en el intervalo
    abierto 60 – 90, de lo contrario emitir un mensaje
    de error.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el valor");
        float num = teclado.nextFloat();
        if (num > 0)
            if (num > 60 && num < 90)
                System.out.println("El numero se encuentra en el intervalo");
            else
                System.out.println("Error, fuera de intervalo");
        else
            System.out.println("No es un numero positivo");
        teclado.close();

    }
}
