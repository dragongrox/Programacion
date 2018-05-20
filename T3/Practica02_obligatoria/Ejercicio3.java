package T3.Practica02_obligatoria;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Escribir un programa que lea la hora en notación de 24 horas y que
imprima en notación de 12; por ejemplo, si la entrada es 13:45, la salida
será 1:45 pm. El programa debe solicitar al usuario que introduzca
exactamente cinco caracteres para especificar una hora; por ejemplo, las
9 en punto se debe introducir así: 09:00.
 */
public class Ejercicio3 {
    public static boolean comprobacionHora(String hora) {
        return (hora.length() == 5 && hora.charAt(2) == ':' && Integer.valueOf(hora.substring(0, 2)) < 24 && Integer.valueOf(hora.substring(0, 2)) >= 0 && Integer.valueOf(hora.substring(3, 5)) < 59 && Integer.valueOf(hora.substring(3, 5)) >= 0);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String hora;
        do {
            System.out.println("Introduzca la hora");
            hora = entrada.next();
            if (!comprobacionHora(hora))
                System.out.println("No es una hora valida.");
        } while (!comprobacionHora(hora));
        if (Integer.valueOf(hora.substring(0, 2)) > 12)
            hora = (String.format("%02d", (Integer.valueOf(hora.substring(0, 2)) - 12))) + hora.substring(2, 5);
        System.out.println(hora);
    }
}
