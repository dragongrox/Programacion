package T3.Practica02_obligatoria;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Hacer un programa que muestre el siguiente menú:
MENÚ
1.- Números Primos
2.- Suma sucesión
3.- Mayor Menor
4.- Raíz cuadrada
5.- Salir
 Si el usuario pulsa la opción 1: se le pedirá un número entero,
positivo y distinto de 0, y se escribirá un mensaje indicando si el
número es primo o no. Un número es primo cuando es divisible
solo por si mismo y por la unidad. (El 1 no es primo).
 Si el usuario pulsa la opción 2: se le pedirá un número entero,
`positivo y mayor que 0, y se escribirá la suma de los términos 1,
1/2 1/3 1/4 .... hasta 1/n siendo n el número que se ha introducido por
teclado.
 Si el usuario pulsa la opción 3: se le pedirá un número entero,
positivo y distinto de 0, a continuación se pedirán tantos números
enteros como indique el número introducido y se mostrará el
mayor valor, el menor valor y si se ha introducido algún 0.
 Si el usuario pulsa la opción 4: se le pedirá un número entero,
positivo y distinto de 0 y mostrará la raíz cuadrada de dicho
número y su resto
P.e. la raíz cuadrada de 13 es 3
Resto es 4 (13-3*3=4)
 */
public class Ejercicio10 {


    public static Float sumaTerminos1(int n) {
        Float suma = 0f;
        for (int cont = 1; cont <= n; cont++)
            suma = suma + 1 / cont;
        return suma;
    }

    public static boolean primo(int num) {
        for (int cont = 2; cont < num; cont++)
            if (num % cont == 0)
                return false;
        return true;
    }

    private static int introduccion() {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca un número entero, positivo y distinto de 0");
            num = entrada.nextInt();
            if (num <= 0)
                System.out.println("No es un numero valido");
        } while (num <= 0);
        return num;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc, num;
        do {
            System.out.println("MENÚ\n" +
                    "1.- Números Primos\n" +
                    "2.- Suma sucesión\n" +
                    "3.- Mayor Menor\n" +
                    "4.- Raíz cuadrada\n" +
                    "5.- Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    num = introduccion();
                    if (primo(num))
                        System.out.println("Es un numero primo\n");
                    else
                        System.out.println("No es un numero primo\n");
                    break;
                case 2:
                    num = introduccion();
                    System.out.println("La suma de los terminos 1 hasta n es " + sumaTerminos1(num));
                    break;
                case 3:
                    num = introduccion();
                    int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
                    boolean cero = false;
                    for (int cont = 1, num2; cont <= num; cont++) {
                        System.out.println("Introduzca un numero: ");
                        num2 = entrada.nextInt();
                        if (num2 > mayor)
                            mayor = num2;
                        if (num2 < menor)
                            menor = num2;
                        if (num2 == 0)
                            cero = true;
                    }
                    System.out.println("El numero mayor es " + mayor + "\nEl numero menor es " + menor);
                    if (cero == true)
                        System.out.println("Han habido 0");
                    else
                        System.out.println("No han habido 0");
                    break;
                case 4:
                    num = introduccion();
                    System.out.println("La raiz cuadrada del numero " + num + " es " + (int) (Math.pow(num, 0.5)) + " y el resto es " + (int) (num - Math.pow((int) (Math.pow(num, 0.5)), 2)));
            }
        } while (opc != 5);
    }


}
