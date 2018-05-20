package T4.Ejercicios_sobre_cadenas;

import T4.MetodoOrdenacion.Ordenada;

import java.util.Vector;

/**
 * @Author Sergey Shevchenko
 */
/*
Realizar los metodos que permiten hacer busquedas
secuenciales y busquedas binarias en vectores de cadenas.
 */
public class e1_BusquedaCadenasVectores {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("presto");
        vector.add("velo");
        vector.add("papoy");
        for (int cont = 0; cont < vector.size(); cont++) {
            System.out.println(vector.get(cont));
        }
        Ordenada ordenar = new Ordenada();
        System.out.println("Buscamos la palabra velo con el metodo de busqueda secuencial");
        ordenar.busqueda(vector, "velo");
        System.out.println("Buscamos la palabra presto con el metodo de busqueda binaria");
        ordenar.busquedaBinaria(vector, "presto");
    }
}
