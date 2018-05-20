package T3.Clase22_11_2017;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */

/*
1)Crear tres puntos
    Con c. por defecto (punto1)
    Con c. de clase (punto2) los valores x e y se leen por teclado
    Con c. de copia (punto3)
2)Cambiar los valores x e y del punto 2 (escribiremos lo que valia antes del cambio y despues del cambio
3) Calcular y escribir la distancia entre punto1 y punto 2
4) Crear un nuevo punto (puntomedio) de punto2 y punto3
 */
public class PuntoPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Punto pun1 = new Punto();
        System.out.println("El punto 1 por defecto es " + pun1.toString());
        System.out.println("Introduzca las cordenadas x y y del punto 2");
        Punto pun2 = new Punto(entrada.nextInt(), entrada.nextInt());
        System.out.println("El punto 2 es " + pun2.toString());
        System.out.println("Las coordenadas del punto 2 se copiaran en el punto 3");
        Punto pun3 = new Punto(pun2);
        System.out.println("El punto 3 es " + pun3.toString());
        System.out.println("La distancia entre el punto 1 y 2 es " + pun1.distancia(pun2));
        System.out.println("El punto medio entre el punto 1 y 3 es " + pun1.puntoMedio(pun3));

        Punto punto1 = new Punto();
        System.out.println("Las cordenadas del punto 1 son (por defecto): " + punto1.toString());
        System.out.println("Introduzca las cordenadas del punto 2 ");
        Punto punto2 = new Punto(entrada.nextInt(), entrada.nextInt());
        System.out.println("Se va a copiar punto 2 en punto 3 ");
        Punto punto3 = new Punto(punto2);
        punto2.setCoordenadaX(4);
        punto2.setCoordenadaY(-5);
        System.out.println(punto2);
        System.out.println("La distancia entre punto1 y punto2 es " + punto1.distancia(punto2));
        Punto puntoMedio = new Punto(punto2.puntoMedio(punto3));
        System.out.println("El punto medio entre punto 2 y punto 3 es de " + puntoMedio);

        System.out.println("El punto 1 esta en ");
        punto1.cuadrante();
    }
}
