package T2.ejercicios07_11_2017;

import java.util.Scanner;

/*
Programa que calcule la media de programacion de una clase de 30 alumnos
(No hay validacion de notas pero deberia.)
 */
public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        float nota = 0, media = 0;

        while (cont < 30) {
            nota = 0;
            while (nota <= 0 || nota >= 10) {
                System.out.println("Introduzca la nota");
                nota = teclado.nextFloat();
                if (nota <= 0 || nota >= 10)
                    System.out.println("El valor no es valido");
            }
            media = media + nota;
            cont++;
        }

        System.out.println("La media de 30 alumnos es " + (media / 30));
    }
}
