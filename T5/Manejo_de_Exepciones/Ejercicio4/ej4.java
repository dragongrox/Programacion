package T5.Manejo_de_Exepciones.Ejercicio4;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valores ax,bx,c : ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        try {
            if (a != 0) {
                if (((b * b) - (4 * a * c)) > 0) {
                    double x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
                    double x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
                    System.out.println("La solucion de x1: " + x1);
                    System.out.println("La solucion de x2: " + x2);
                }
                if (((b * b) - (4 * a * c)) == 0) {
                    System.out.println("La solucion es: " + (-(b / 2 * a)));
                }
                if (((b * b) - (4 * a * c)) < 0) {
                    System.out.println("La solucion es de tipo complejo.");
                }
            } else throw new exeption();
        } catch (exeption A) {
            System.out.println("ax no puede ser 0");
        }
    }
}
