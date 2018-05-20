package T5.Manejo_de_Exepciones.Ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author sergey shevchenko
 */
/*
Implementar un programa realice la división de dos números naturales, si uno de los dos no lo es, que arroje una excepción.
 */
public class ej1 {

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

