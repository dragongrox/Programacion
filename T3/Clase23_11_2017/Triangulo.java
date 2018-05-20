package T3.Clase23_11_2017;

import T3.Clase22_11_2017.Punto;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */

/*
Triangulo
    Vertice1: Punto
    Vertice2: Punto
    Vertice3: Punto

    3 constructores
    getter y settter
    toString --> A(x,y) B(x,y) C(x,y)
    perimetro():double
    area():double

    generar un numero determinado de triangulos
    media perimetro
    media superficie
    triangulo con mayor superficie
    triangulo con menor superficie
    triangulo con mayor perimetro
    triangulo con menor perimetro
 */
public class Triangulo {
    private Punto Vertice1, Vertice2, Vertice3;

    public Triangulo() {
        Punto punto1 = new Punto(3, 4);
        Punto punto2 = new Punto();
        Punto punto3 = new Punto(1, -2);
        Vertice1 = punto1;
        Vertice2 = punto2;
        Vertice3 = punto3;
    }

    public Triangulo(Triangulo t) {
        Vertice1 = t.Vertice1;
        Vertice2 = t.Vertice2;
        Vertice3 = t.Vertice3;
    }

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        Vertice1 = vertice1;
        Vertice2 = vertice2;
        Vertice3 = vertice3;
    }

    public Punto getVertice1() {
        return Vertice1;
    }

    public Punto getVertice2() {
        return Vertice2;
    }

    public Punto getVertice3() {
        return Vertice3;
    }

    public void setVertice1(Punto vertice1) {
        Vertice1 = vertice1;
    }

    public void setVertice2(Punto vertice2) {
        Vertice2 = vertice2;
    }

    public void setVertice3(Punto vertice3) {
        Vertice3 = vertice3;
    }

    @Override
    public String toString() {
        return "A(" + Vertice1 +
                ") B(" + Vertice2 +
                ") C(" + Vertice3 +
                ')';
    }

    public double perimetro() {
        Punto punto1 = new Punto(this.getVertice1());
        Punto punto2 = new Punto(this.getVertice2());
        Punto punto3 = new Punto(this.getVertice3());
        return punto1.distancia(punto2) + punto2.distancia(punto3) + punto3.distancia(punto1);
    }

    public double area() {
        Punto punto1 = new Punto(this.getVertice1());
        Punto punto2 = new Punto(this.getVertice2());
        Punto punto3 = new Punto(this.getVertice3());
        double semiperimetro = this.perimetro() / 2;
        return Math.pow(semiperimetro * (Math.pow((semiperimetro - punto1.distancia(punto2)), 2) * Math.pow((semiperimetro - punto2.distancia(punto3)), 2) * Math.pow((semiperimetro - punto2.distancia(punto3)), 2)), 0.5);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        do {
            System.out.println("Introduzca las veces que quiere introducir los triangulos:");
            n = entrada.nextInt();
            if (n <= 0)
                System.out.println("Valor no valido");
        } while (n <= 0);
        double mediaP = 0, mediaS = 0, mayorS = Integer.MIN_VALUE, menorS = Integer.MAX_VALUE, mayorP = Integer.MIN_VALUE, menorP = Integer.MAX_VALUE;
        int cont = 0;
        for (cont = 0; cont < n; cont++) {
            System.out.println("Introduzca el vertice 1");
            Punto punto1 = new Punto(entrada.nextInt(), entrada.nextInt());
            System.out.println("Introduzca el vertice 2");
            Punto punto2 = new Punto(entrada.nextInt(), entrada.nextInt());
            System.out.println("Introduzca el vertice 3");
            Punto punto3 = new Punto(entrada.nextInt(), entrada.nextInt());
            Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
            if (triangulo.perimetro() > mayorP)
                mayorP = triangulo.perimetro();
            if (triangulo.perimetro() < menorP)
                menorP = triangulo.perimetro();
            if (triangulo.area() > mayorS)
                mayorS = triangulo.area();
            if (triangulo.area() < menorS)
                menorS = triangulo.area();
            mediaP = mediaP + triangulo.perimetro();
            mediaS = mediaS + triangulo.perimetro();
        }

        System.out.println("La media del perimetro es de " + (mediaP / cont));
        System.out.println("La media de la superficie es de " + (mediaS / cont));
        System.out.println("El perimetro mayor es " + mayorP);
        System.out.println("El perimetro menor es " + menorP);
        System.out.println("La superficie mayor es " + mayorS);
        System.out.println("La superficie menor es " + menorS);
    }
}
