package T3.ShevchenkoSergeyP03.Ejercicio05;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */

/*
Realizar una clase Vector3d que permita manipular vectores de tres componentes en
coordenadas x, y, z de acuerdo con las siguientes normas:
 Constructores:
o Por defecto
o De clase o parametrizado
o De copia
 Getter, setter y toString
 Método equal para saber si dos vectores tienen sus componentes iguales.
 Método trasladar (sobrecargado) que permita obtener un nuevo punto
trasladando la coordenada o coordenadas adecuadas de acuerdo a la distancia
o distancias especificadas .
o Si solo se proporciona un valor se cambiará el valor de la coordenada x
o Si se proporcionan dos valores cambiaremos las coordenadas x, y
o Si se proporcionan tres valores cambiaremos los valores de todas las
coordenadas.
 */
public class Vector3d {

    Punto3d puntoInicial, puntoFinal;

    public Punto3d asignarPunto(double coordenadaX, double coordenadaY, double coordenadaZ) {
        Punto3d punto3d = new Punto3d(coordenadaX, coordenadaY, coordenadaZ);
        return punto3d;
    }

    public Vector3d() {
        this.puntoInicial = asignarPunto(0, 0, 0);
        this.puntoFinal = asignarPunto(1, 1, 1);
    }

    public Vector3d(Vector3d t) {
        this.puntoInicial = t.puntoInicial;
        this.puntoFinal = t.puntoFinal;
    }

    public Vector3d(Punto3d puntoInicial, Punto3d puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Punto3d getPuntoInicial() {
        return puntoInicial;
    }

    public void setPuntoInicial(Punto3d puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

    public Punto3d getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(Punto3d puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public double moduloVector() {
        return Math.pow(Math.pow(puntoFinal.getCoordenadaX() - puntoInicial.getCoordenadaX(), 2) +
                Math.pow(puntoFinal.getCoordenadaY() - puntoInicial.getCoordenadaY(), 2) +
                Math.pow(puntoFinal.getCoordenadaZ() - puntoInicial.getCoordenadaZ(), 2), 0.5);
    }

    @Override
    public String toString() {
        return "punto inicial=" + puntoInicial +
                ", punto final=" + puntoFinal +
                ", modulo=" + this.moduloVector();
    }

    public boolean equal(Vector3d vector) {
        return puntoFinal.getCoordenadaX() - puntoInicial.getCoordenadaX() == vector.puntoFinal.getCoordenadaX() - vector.puntoInicial.getCoordenadaX() &&
                puntoFinal.getCoordenadaY() - puntoInicial.getCoordenadaY() == vector.puntoFinal.getCoordenadaY() - vector.puntoInicial.getCoordenadaY() &&
                puntoFinal.getCoordenadaZ() - puntoInicial.getCoordenadaZ() == vector.puntoFinal.getCoordenadaZ() - vector.puntoInicial.getCoordenadaZ();
    }

    public static void main(String[] args) {
        Vector3d vectorDefecto = new Vector3d();
        System.out.println("El vector por defecto es " + vectorDefecto);
        System.out.println("Defina otro vector poniendo su punto inicial y su punto final.");
        Scanner entrada = new Scanner(System.in);
        Punto3d puntoInicial = new Punto3d(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble());
        Punto3d puntoFinal = new Punto3d(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble());
        Vector3d vectorClase = new Vector3d(puntoInicial, puntoFinal);
        System.out.println("El vector definido es " + vectorClase);
        System.out.println("Se procede a copiar el anterior vector.");
        Vector3d vectorCopia = new Vector3d(vectorClase);
        System.out.println("El vector copiado es " + vectorCopia);
        if (vectorClase.equal(vectorDefecto))
            System.out.println("Los vectores 1 y 2 son iguales");
        else
            System.out.println("Los vectores 1 y 2 no son iguales");
        System.out.println("Traslade el punto final del vector 3 en el eje x");
        vectorCopia.puntoFinal.trasladar(entrada.nextDouble());
        System.out.println("Los valores nuevos del vector son " + vectorCopia);
        System.out.println("Traslade el punto final del vector 3 en el eje x y en el eje y");
        vectorCopia.puntoFinal.trasladar(entrada.nextDouble(), entrada.nextDouble());
        System.out.println("Los valores nuevos del vector son " + vectorCopia);
        System.out.println("Traslade el punto final del vector 3 en el eje x, en el eje y y en el eje z");
        vectorCopia.puntoFinal.trasladar(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble());
        System.out.println("Los valores nuevos del vector son " + vectorCopia);
    }
}
