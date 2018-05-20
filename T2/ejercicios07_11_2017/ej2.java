package T2.ejercicios07_11_2017;

import java.util.Scanner;

/*
Programa que calcule la media de programacion de una clase hasta que
se introduzca una nota 0 o negativa (No hay validacion de notas pero deberia)
 */
public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota = 1f, media = 0;
        boolean sw = false;
        int cont = 0;

        while (sw == false) {
            nota = 10;
            while (nota >= 10) {
                System.out.println("Introduzca la nota");
                nota = teclado.nextFloat();
                if (nota >= 10)
                    System.out.println("El valor no es valido");
                if (nota <= 0)
                    sw = true;
            }
            if (nota <= 0) {
                media = media + nota;
                cont++;
            }
        }

        System.out.println("La media de 30 alumnos es " + (media / cont));
    }
}
