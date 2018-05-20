package T5.Manejo_de_Exepciones.Ejercicio6;

import java.util.Scanner;

public class Calculadora {
    static Scanner entrada = new Scanner(System.in);

    public static int introduccionI() {
        try {
            entrada = new Scanner(System.in);
            return entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Valor invalido");
            return introduccionI();
        }
    }

    public static double introduccionD() {
        try {
            entrada = new Scanner(System.in);
            return entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Valor invalido");
            return introduccionD();
        }
    }

    public static void complejo() {
        int opc = 0;
        do {
            System.out.println("1.Potencia\n" +
                    "2.Raiz cuadrada\n" +
                    "3.Volver");
            opc = introduccionI();
            double num1 = 0;
            switch (opc) {
                case 1:
                    System.out.println("Introduzca el numero: ");
                    num1 = introduccionD();
                    System.out.println(Math.pow(num1, 2));
                    break;
                case 2:
                    System.out.println("Introduzca el numero: ");
                    num1 = introduccionD();
                    System.out.println(Math.pow(num1, 0.5));
                    break;
                case 3:
                    System.out.println("Volviendo...");
                default:
            }
        } while (opc != 3);
    }

    public static void simple() {
        int opc = 0;
        do {
            System.out.println("1.Suma\n" +
                    "2.Resta\n" +
                    "3.Division\n" +
                    "4.Multiplicacion\n" +
                    "5.Volver");
            opc = introduccionI();
            double num1 = 0, num2 = 0;
            switch (opc) {
                case 1:
                    System.out.println("Introduzca los dos numero: ");
                    num1 = introduccionD();
                    num2 = introduccionD();
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Introduzca los dos numero: ");
                    num1 = introduccionD();
                    num2 = introduccionD();
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Introduzca los dos numero: ");
                    num1 = introduccionD();
                    num2 = introduccionD();
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case 4:
                    System.out.println("Introduzca los dos numero: ");
                    num1 = introduccionD();
                    num2 = introduccionD();
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 5:
                    System.out.println("Volviendo...");
                default:
            }
        } while (opc != 5);
    }


    public static void main(String[] args) {

        int opc = 0;
        do {
            System.out.println("1.Operaciones basicas\n" +
                    "2.Operaciones complejas\n" +
                    "3.Salir\n");
            opc = introduccionI();
            switch (opc) {
                case 1:
                    simple();
                    break;
                case 2:
                    complejo();
                    break;
                case 3:
                    System.out.println("Cerrando el programa...");
                default:
            }

        } while (opc != 3);
    }
}
