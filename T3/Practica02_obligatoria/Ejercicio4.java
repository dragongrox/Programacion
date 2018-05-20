package T3.Practica02_obligatoria;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */

/*
Crear un programa que valore el salario neto semanal de los
trabajadores de una empresa de acuerdo a las siguientes normas:
 Horas semanales trabajadas <38 a una tasa.
 Horas extras (38 o más) a una tasa 50% superior a la ordinaria.
 Impuestos de 0%, si el salario bruto es menor o igual a 750 euros;
   10%, si el salario bruto es mayor que 750 euros.
 */
public class Ejercicio4 {

    public static float valorarSalario(int horas, float tasa) {
        float salario;
        if (horas < 38)
            salario = horas * tasa;
        else
            salario = (horas - 37) * (tasa * 1.50f) + (horas * tasa - (horas - 37) * (tasa * 1.50f));
        if (salario > 750)
            salario = salario - salario * 0.1f;
        return salario;

    }

    public static void main(String[] args) {
        int horas;
        final float tasa = 5.50f;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduzca el numero de horas: ");
            horas = entrada.nextInt();
        } while (horas <= 0);
        System.out.println("El salario semanal es de " + valorarSalario(horas, tasa));
    }
}
