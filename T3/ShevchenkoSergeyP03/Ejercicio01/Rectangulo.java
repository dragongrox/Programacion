package T3.ShevchenkoSergeyP03.Ejercicio01;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Crea una clase Rectángulo que modele rectángulos por medio de cuatro puntos (los
vértices). Dispondrá de dos constructores: uno que cree un rectángulo partiendo de
sus cuatro vértices y otro que cree un rectángulo partiendo de la base y la altura, de
forma que su vértice inferior izquierdo esté en (0,0). La clase también incluirá un
método para calcular la superficie y otro que desplace el rectángulo en el plano..
 Constructor por defecto
 Accedentes y mutadores.
 Área
 Perímetro
 Clase principal para probar los métodos
y
^
|
|
2-----3
|     |
|     |
1-----4----->x
 */
public class Rectangulo {
    private Punto Vertice1, Vertice2, Vertice3, Vertice4;

    public Rectangulo(double base, double altura) {
        Vertice1 = asignarPunto(0, 0);
        Vertice2 = asignarPunto(0, altura);
        Vertice3 = asignarPunto(base, altura);
        Vertice4 = asignarPunto(base, 0);
    }

    public Rectangulo() {
        Vertice1 = asignarPunto(0, 0);
        Vertice2 = asignarPunto(0, 2);
        Vertice3 = asignarPunto(2, 2);
        Vertice4 = asignarPunto(2, 0);
    }

    public Rectangulo(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        Vertice1 = vertice1;
        Vertice2 = vertice2;
        Vertice3 = vertice3;
        Vertice4 = vertice4;
    }

    public static Punto asignarPunto(double coordenadaX, double coordenadaY) {
        Punto punto = new Punto(coordenadaX, coordenadaY);
        return punto;
    }

    public boolean comprobacionRectangulo() {
        return this.Vertice1.getCoordenadaY() == this.Vertice4.getCoordenadaY() &&
                this.Vertice1.getCoordenadaX() == this.Vertice2.getCoordenadaX() &&
                this.Vertice2.getCoordenadaY() == this.Vertice3.getCoordenadaY() &&
                this.Vertice4.getCoordenadaX() == this.Vertice3.getCoordenadaX();
    }

    public Punto getVertice1() {
        return Vertice1;
    }

    public void setVertice1(Punto vertice1) {
        Vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return Vertice2;
    }

    public void setVertice2(Punto vertice2) {
        Vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return Vertice3;
    }

    public void setVertice3(Punto vertice3) {
        Vertice3 = vertice3;
    }

    public Punto getVertice4() {
        return Vertice4;
    }

    public void setVertice4(Punto vertice4) {
        Vertice4 = vertice4;
    }

    public double superficieRectangulo() {
        return this.getVertice1().distancia(this.getVertice2()) * this.getVertice1().distancia(this.getVertice4());
    }

    public double perimetroRectangulo() {
        return (this.getVertice1().distancia(this.getVertice2()) + this.getVertice1().distancia(this.getVertice4())) * 2;
    }

    public void moverRectangulo(double coordenadaX, double coordenadaY) {
        this.Vertice1.moverPunto(coordenadaX, coordenadaY);
        this.Vertice2.moverPunto(coordenadaX, coordenadaY);
        this.Vertice3.moverPunto(coordenadaX, coordenadaY);
        this.Vertice4.moverPunto(coordenadaX, coordenadaY);
    }

    @Override
    public String toString() {
        return "Vertice1 en " + Vertice1 +
                ", Vertice2 en " + Vertice2 +
                ", Vertice3 en " + Vertice3 +
                ", Vertice4 en " + Vertice4 +
                '}';
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("El rectangulo por defecto tiene " + rectangulo.toString());
        int menu = 0;
        do {
            System.out.println("1.Definir rectangulo por su base y altura.");
            System.out.println("2.Definir rectangulo por sus vertices.");
            System.out.println("3.Calcular la superficie del rectangulo.");
            System.out.println("4.Calcular el perimetro del rectangulo.");
            System.out.println("5.Saber la posicion del los vertices del rectangulo.");
            System.out.println("6.Mover el rectangulo.");
            System.out.println("7.Salir");
            System.out.println("La distribucion de los vertices se entendera de la siguiente forma:");
            System.out.println("2-----3\n" +
                    "|     |\n" +
                    "|     |\n" +
                    "1-----4\n");
            System.out.println("Elija una opcion: ");
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    double base = 0, altura = 0;
                    do {

                        System.out.println("Introduzca base");
                        base = entrada.nextDouble();
                        System.out.println("Introduzca altura");
                        altura = entrada.nextDouble();
                        Rectangulo rectanguloBA = new Rectangulo(base, altura);
                        if (base <= 0 || altura <= 0)
                            System.out.println("Uno de los valores no es valido.");
                        else
                            rectangulo = rectanguloBA;
                    } while (base <= 0 || altura <= 0);
                    break;
                case 2:
                    boolean sw = false;
                    do {
                        System.out.println("Introduzca las cordenadas de los vertices.");
                        Rectangulo rectanguloP = new Rectangulo(asignarPunto(entrada.nextDouble(), entrada.nextDouble()),
                                asignarPunto(entrada.nextDouble(), entrada.nextDouble()),
                                asignarPunto(entrada.nextDouble(), entrada.nextDouble()),
                                asignarPunto(entrada.nextDouble(), entrada.nextDouble()));
                        sw = rectanguloP.comprobacionRectangulo();
                        if (!sw)
                            System.out.println("Las coordenadas dadas no forman un rectangulo.");
                        else
                            rectangulo = rectanguloP;
                    } while (!sw);
                    break;
                case 3:
                    System.out.println("La superficie del rectangulo es de " + rectangulo.superficieRectangulo());
                    break;
                case 4:
                    System.out.println("El perimetro del rectangulo es de " + rectangulo.perimetroRectangulo());
                    break;
                case 5:
                    System.out.println(rectangulo.toString());
                    break;
                case 6:
                    System.out.println("Introduzca cuanto desea mover en el eje X y posteriormete en el eje Y ");
                    rectangulo.moverRectangulo(entrada.nextDouble(), entrada.nextDouble());
                    break;
                case 7:
                    System.out.println("Gracias por el uso de este programa \n @Author Sergey Shevchenko");
            }
        } while (menu != 7);
    }
}
