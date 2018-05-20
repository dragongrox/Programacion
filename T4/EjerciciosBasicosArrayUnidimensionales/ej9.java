package T4.EjerciciosBasicosArrayUnidimensionales;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Hacer un programa para ingresar n valores reales en un arreglo y
los muestreen la pantalla, además informará del mayor, el menor y el promedio.
 */
public class ej9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de numeros que va a ingresar: ");
        int tam = entrada.nextInt();
        entrada = new Scanner(System.in);
        int[] numeros = new int[tam];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, prom = 0;
        for (int cont = 0; cont < tam; cont++) {
            System.out.println("Introduzca un numero: ");
            numeros[cont] = entrada.nextInt();
        }
        System.out.println("Los numeros ingresados son: ");
        for (int cont = 0; cont < tam; cont++) {
            System.out.print(numeros[cont] + " ");
            System.out.println();
            if (max < numeros[cont])
                max = numeros[cont];
            if (min > numeros[cont])
                min = numeros[cont];
            prom += numeros[cont];
        }
        System.out.println("El numero maximo es " + max);
        System.out.println("El numero minimo es " + min);
        System.out.println("El promedio es " + (float) prom / tam);
    }
}
