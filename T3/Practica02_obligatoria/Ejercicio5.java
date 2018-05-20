package T3.Practica02_obligatoria;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Escribir un programa que resuelva la ecuación cuadrática
(ax2 + bx + c =0) y comprobar que es exactamente una función cuadrática.
 */
public class Ejercicio5 {
    public static double determinante(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static String resolverEcuacion(double a, double b, double c) {
        double determinante = determinante(a, b, c);
        if (determinante > 0)
            return "x1=" + (-b + Math.pow(determinante, 0.5) / 2 * a) + "  x2=" + (-b - Math.pow(determinante, 0.5) / 2 * a);
        else if (determinante == 0)
            return "x=" + (-(b / 2 * a));
        else
            return "No hay solucion";

    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("En la ecuacion ax2 + bx + c =0 introduzca: ");
        System.out.println("Valor de a ");
        a = entrada.nextDouble();
        System.out.println("Valor de b ");
        b = entrada.nextDouble();
        System.out.println("Valor de c ");
        c = entrada.nextDouble();
        if (a == 0)
            System.out.println("No es una ecuacion cuadratica ");
        else {
            System.out.println(resolverEcuacion(a, b, c));


        }


    }
}
