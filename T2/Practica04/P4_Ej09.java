package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej09 {
    /*
    Realiza un programa Java que lea un número por teclado
    que pida el precio de un producto (puede tener decimales)
    y calcule el precio final con IVA. El IVA será una constante
    que será del 21%.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int IVA = 21;

        System.out.println("Introduzca el precio de producto.");
        float precio = 0;
        while (precio <= 0) {
            precio = teclado.nextFloat();
            if (precio <= 0)
                System.out.println("No es un valor valido");
        }
        System.out.println("El precio del producto con IVA es de " + (precio + precio * 21 / 100));

        teclado.close();
    }
}
