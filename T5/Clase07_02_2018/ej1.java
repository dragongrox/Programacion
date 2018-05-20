package T5.Clase07_02_2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author Sergey Shevchenko
 */
/*
Crear un metodo que permita validar si el valor ingresado en un JOptionPane es Numerico.
Crear un metodo que permita validar si el valor ingresado en un JOptionPane es de tipo Caracter.
Crear un metodo que permita validar si el valor ingresado esta dentro del rango de 1 a 100.
 */
public class ej1 {
    public static int comprobarNumerico() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int ret = 0;
        try {
            System.out.println("Introduzca numero");
            ret = Integer.parseInt(entrada.readLine());
        } catch (java.io.IOException i) {
            System.out.println("No es un valor valido.");
            ret = comprobarNumerico();
        }
        return ret;
    }

    public static char comprobarCaracter() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char ret = 0;
        try {
            System.out.println("Introduzca el caracter");
            ret = entrada.readLine().charAt(0);
        } catch (java.io.IOException i) {
            System.out.println("No es un valor valido.");
            ret = comprobarCaracter();
        }
        return ret;
    }

    public static int comprobarNumero1y100() throws exepcionRange {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int ret = 0;
        try {
            System.out.println("Introduzca numero");
            ret = Integer.parseInt(entrada.readLine());
            if (ret < 1 || ret > 100) throw new exepcionRange();
        } catch (java.io.IOException i) {
            System.out.println("No es un valor valido.");
            ret = comprobarNumero1y100();
        } catch (java.lang.Exception j) {
            System.out.println("Tipo de dato erroneo.");
        }

        return ret;
    }

    public static void main(String[] args) {
        try {
            comprobarNumero1y100();
        } catch (exepcionRange i) {
            System.out.println("El numero no se encuentra en el rango.");
        }

    }
}
