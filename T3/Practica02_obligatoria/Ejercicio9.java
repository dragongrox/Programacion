package T3.Practica02_obligatoria;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Programa que lea un fecha de un año (1800 o posterior) y escriba si la
fecha es correcta o no
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Introduzca una fecha en formato DD:MM:AAAA");
        Scanner entrada = new Scanner(System.in);
        String fecha = entrada.next();
        int anio = Integer.valueOf(fecha.substring(6, 10)), mes = Integer.valueOf(fecha.substring(3, 5)), dia = Integer.valueOf(fecha.substring(0, 2));
        boolean swBis = false;
        if (anio >= 1800) { //comprobamos la validez del año
            if (((anio % 4) == 0) && ((anio % 100) != 0 || (anio % 400) == 0)) //comprobamos si el año es biciesto
                swBis = true;
            if (mes > 0 && mes <= 12)
                switch (mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (dia > 0 && dia <= 31)
                            System.out.println("Es una fecha valida ");
                        else
                            System.out.println("No es una fecha valida");
                        break;
                    case 2:
                        if ((dia > 0 && dia <= 28) || (dia > 0 && dia <= 29 && swBis == true))
                            System.out.println("Es una fecha valida");
                        else
                            System.out.println("No es una fecha valida");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dia > 0 && dia <= 30)
                            System.out.println("Es una fecha valida ");
                        else
                            System.out.println("No es una fecha valida ");
                }
            else
                System.out.println("No es uan fecha valida");
        } else
            System.out.println("No es una fecha valida");
    }
}
