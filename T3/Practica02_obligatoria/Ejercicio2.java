package T3.Practica02_obligatoria;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Dada una secuencia de números terminada en cero (0),
elaborar un algoritmo para calcular el porcentaje y
la suma de los números impares, el porcentaje y la suma
de los números pares, la suma de todos los números y
cuantos números fueron ingresados, muestre finalmente
estos resultados al usuario.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num = 1, sumaImpares = 0, sumaPares = 0;
        int contI = 0, contP = 0;
        while (num != 0) {
            System.out.println("Introduzca el valor ");
            num = entrada.nextFloat();
            if (num != 0) {
                if (num % 2 == 0) {
                    sumaPares = sumaPares + num;
                    contP++;
                } else {
                    sumaImpares = sumaImpares + num;
                    contI++;
                }
            }
        }
        System.out.println("La suma de todos los pares es " + sumaPares);
        System.out.println("El porcentaje de los numero pares es de " + (contP * 100 / (contI + contP)) + "%");
        System.out.println("La suma de todos los impares es " + sumaImpares);
        System.out.println("El porcentaje de los numeros impares es de " + (100 - contP * 100 / (contI + contP)) + "%");
        System.out.println("La suma de todos los numeros es de " + (sumaImpares + sumaPares));
        System.out.println("En total fueron ingresados " + (contI + contP));

    }
}
