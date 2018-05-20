package T2.Practica04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
public class P4_Ej15 {
    /*
    Diseña un programa Java para leer las longitudes de
    los lados de un triangulo (L1, L2, L3) y calcular el
    área del mismo de acuerdo con la siguiente fórmula:
    sp=(L1+L2+L3)/2
    area=Math.pow((sp*(sp-L1)*(sp-L2)*(sp-L3)),0,5)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float L1 = 0, L2 = 0, L3 = 0;
        while (L1 <= 0 && L2 <= 0 && L3 <= 0) {
            System.out.println("Introduzca los lados del triangulo");
            L1 = teclado.nextFloat();
            L2 = teclado.nextFloat();
            L3 = teclado.nextFloat();
            if (L1 <= 0 && L2 <= 0 && L3 <= 0)
                System.out.println("No es un valor valido");
        }
        double sp = (L1 + L2 + L3) / 2;
        System.out.println("El area del triangulo es " + Math.pow((sp * (sp - L1) * (sp - L2) * (sp - L3)), (0.5)));


        teclado.close();
    }

}
