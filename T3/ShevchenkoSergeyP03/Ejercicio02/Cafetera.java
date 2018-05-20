package T3.ShevchenkoSergeyP03.Ejercicio02;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Desarrolla una clase Cafetera con atributos _capacidadMaxima (la cantidad máxima
de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café
que hay en la cafetera). Implementa, al menos, los siguientes métodos:
 Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
actual en cero (cafetera vacía).
 Constructor con la capacidad máxima de la cafetera; inicializa la cantidad
actual de café igual a la capacidad máxima.
 Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual
es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
 Accedentes y mutadores.
 llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
 servirTaza(int): simula la acción de servir una taza con la capacidad indicada. Si
la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que
quede.
 vaciarCafetera(): pone la cantidad de café actual en cero.
 agregarCafe(int): añade a la cafetera la cantidad de café indicada.
 */
public class Cafetera {
    int capacidadMaxima, capacidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadActual, int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
        agregarCafe(capacidadActual);
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMaxima;
    }

    public void vaciarCafetera() {
        this.capacidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        if (this.capacidadActual + cantidad < capacidadMaxima)
            this.capacidadActual = this.capacidadActual + cantidad;
        else
            this.llenarCafetera();
    }

    public void servirTaza(int cantidad) {
        if (this.capacidadActual - cantidad >= 0)
            this.capacidadActual = this.capacidadActual - cantidad;
        else
            this.vaciarCafetera();
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", capacidadActual=" + capacidadActual +
                '}';
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Constructor por defecto (cafetera 1): ");
        Cafetera cafeteraPorDefecto = new Cafetera();
        System.out.println(cafeteraPorDefecto);
        System.out.println("\n Contructor con capacidad maxima(cafetera2). ");
        System.out.println("Introduzca la capacidad maxima: ");
        Cafetera cafeteraMaxima = new Cafetera(entrada.nextInt());
        System.out.println(cafeteraMaxima);
        System.out.println("\n Constructor con capacidad maxima y capacidad actual(cafetera3).");
        System.out.println("Itroduzca la capacidad actual de la tetera y la capacidad maxima: ");
        Cafetera cafeteraActualMaxima = new Cafetera(entrada.nextInt(), entrada.nextInt());
        System.out.println(cafeteraActualMaxima);
        System.out.println("\n Introduzca cuanto cafe se quiere hechar de la cafetera2");
        int cantidad = 0;
        do {
            cantidad = entrada.nextInt();
            if (cantidad < 0)
                System.out.println("No es un valor valido. ");
        } while (cantidad < 0);
        cafeteraMaxima.servirTaza(entrada.nextInt());
        System.out.println("El nuevo valor de la cafetera es " + cafeteraMaxima);
        System.out.println("\n Se procedera a rellenar la cafetera2 ");
        cafeteraMaxima.llenarCafetera();
        System.out.println("El nuevo valor de la cafetera es " + cafeteraMaxima);
        System.out.println("\n Se procedera a vaciar la cafetera1 con " + cafeteraPorDefecto);
        cafeteraPorDefecto.vaciarCafetera();
        System.out.println("El nuevo valor de la cafetera es " + cafeteraPorDefecto);
        System.out.println("\n Se procedera a añadir cafe a la cafetera1");
        System.out.println("Introduzca cuanto cafe quiere añadir: ");
        do {
            cantidad = entrada.nextInt();
            if (cantidad < 0)
                System.out.println("No es un valor valido. ");
        } while (cantidad < 0);
        cafeteraPorDefecto.agregarCafe(cantidad);
        System.out.println("El nuevo valor se la cafetera es " + cafeteraPorDefecto);


    }


}
