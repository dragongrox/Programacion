package T5.Manejo_de_Exepciones.Ejercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author dragon
 */
/*
Realizar un programa que calcular el factorial de cualquier número entero positivo.
El programa debe controlar entre otras excepciones que el número sea negativo y que exista desbordamiento.
 */
public class ej2 {

    public static float Division() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        float num1 = 0, f = 1;
        try {
            System.out.println("Introduzca el numero para calcular el factorial. ");
            num1 = Integer.parseInt(entrada.readLine().charAt(0) + "");
            if (num1 < 1) throw new exeption();
        } catch (Exception e) {
            System.out.println("No es un valor valido. ");
            return Division();
        }
        while (num1 != 0) {
            f = f * num1;
            num1--;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(Division() + " es la solucion.");
    }
}
