package T2.ejercicios06_11_2017;
/**
 * @Author Sergey Shevchenko
 */

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        /*
        Escribir en letra nota numerica del 1 al 10
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num;
        num = teclado.nextInt();
        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Aprovado");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("No es una opcion valida.");
        }
        teclado.close();


    }
}
/*
Indica se un caracter introducido desde teclado es vocal o no

Escribir numero de dias del mes

Escribir mes en letra
 */