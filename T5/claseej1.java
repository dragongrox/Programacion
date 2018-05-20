package T5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Programa que lea 10 notas validas y escriba la media (usando Scanner y usando BufferedReader).
 * Controlar exepciones y validar notas. ¿Hay alguna diferencia entre ambas a nivel de escritura del programa?
 * <p>
 * Repetir el proceso usando un array d eenteros y ademas de la media, escribir la mayor y la menor de las
 * notas (controlar todas las excepciones que puedan ocurrir)
 * <p>
 * Construir un programa que permita adivinar numeros entre uno y
 * 100, el programa debe delimitar el valor en cada uno de los intentos.
 * El proceso termina cuando adivinamos el numero, en cuyo caso debe
 * aparecer un mensaje y el numero de intentos, o por que superamos
 * los 5 intentos premitidos por el programa, en cuyo caso mostraremos
 * un mensaje, (controlar todas las posibles exepciones).
 */
public class claseej1 {
    public static int leerScanner() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static int leerBufferedReader() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(entrada.readLine());
    }

    public static int leerNotas() {
        int ret = 0;
        do {
            try {
                System.out.println("Introduzca un numero ");
                ret = leerBufferedReader();
            } catch (java.io.IOException i) {
                System.out.println("No es ub valor valido.");
            }
            if (ret < 1 || ret > 10)
                System.out.println("No es un valor valido. ");
        } while (ret > 1 && ret <= 10);
        return ret;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int cont = 0; cont < 10; cont++) {
            sum = leerNotas();
        }
        System.out.println(sum / 10);

    }
}
