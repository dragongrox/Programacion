package T5.Manejo_de_Exepciones;

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
        float num1 = 0, num2 = 0;
        try {
            System.out.println("Introduzca dos numeros naturales. ");
            num1 = Integer.parseInt(entrada.readLine().charAt(0) + "");
            num2 = Integer.parseInt(entrada.readLine().charAt(0) + "");
            if (num1 < 1 || num2 < 1) throw new exeption();
        } catch (java.io.IOException e) {
            System.out.println("No es un valor valido. ");
            return Division();
        } catch (exeption a) {
            return Division();
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println(Division() + " es la solucion.");
    }
}
