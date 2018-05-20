package T4.MetodoOrdenacion;

import java.util.Scanner;
import java.util.Vector;

public class Ordenada {

    static void seleccion(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = a[i];
                a[i] = a[min];
                a[min] = aux;
            }
        }

    }

    static void intercambio(int[] array) {
        for (int cont = 0; cont < array.length; cont++) {
            int aux = array[cont];
            for (int c = cont + 1; c < array.length; cont++) {
                if (array[cont] > array[c]) {
                    array[cont] = array[c];
                    array[c] = aux;
                }
            }
        }
    }


    static void burbuja(int[] array) {
        boolean sw = true;
        for (int cont = array.length; cont > 0 | sw == true; cont--) {
            int aux = 0;
            sw = false;
            for (int c = 0; c < cont - 1; c++) {
                if (array[c] > array[c + 1]) {
                    aux = array[c];
                    array[c] = array[c + 1];
                    array[c + 1] = aux;
                    sw = true;
                }
            }
        }
    }

    static void burbuja(Vector<String> vector) {
        boolean sw = true;
        for (int cont = vector.size(); cont > 0 | sw == true; cont--) {
            String aux = "";
            sw = false;
            for (int c = 0; c < cont - 1; c++) {
                if (vector.get(c).compareTo(vector.get(c + 1)) > 0) {
                    aux = vector.get(c);
                    vector.set(c, vector.get(c + 1));
                    vector.set(c + 1, aux);
                    sw = true;
                }
            }
        }
    }

    static void busqueda(int[] array, int numero) {
        int aux = 0;
        for (int cont = 0; cont < array.length; cont++) {
            if (array[cont] == numero) {
                aux++;
            }
        }
        if (aux > 0)
            System.out.println("Se hen encontrado " + aux + " veces el numero.");
        else
            System.out.println("No se ha encontrado el numero buscado.");
    }

    static void busquedaBinaria(int[] array, int numero) {
        burbuja(array);
        if (array[0] > numero || array[array.length - 1] < numero)
            System.out.println("No se ha encontrado el numero buscado.");
        else {
            int cont = 0, max = array.length - 1;
            boolean sw = false;
            do {
                if (numero < array[max] && numero > array[cont])
                    if (numero > array[max / 2] || numero < array[max / 2])
                        if (numero > array[max / 2])
                            cont = max / 2;
                        else
                            max = max / 2;
                    else sw = true;
                else sw = true;
            } while (sw = false);
            while (cont <= max) {
                if (array[cont] == numero)
                    System.out.println("El numero esta en la posicion " + cont);
                cont++;
            }
        }
    }

    public int busquedaBinaria(Vector<String> vector, String palabra) {
        burbuja(vector);
        if (vector.get(0).compareTo(palabra) > 0 || vector.get(vector.size() - 1).compareTo(palabra) < 0) {
            System.out.println("No se ha encontrado la palabra buscada.");
            return 0;
        } else {
            int cont = 0, max = vector.size() - 1;
            boolean sw = false;
            do {
                if (vector.get(max).compareTo(palabra) < 0 && vector.get(cont).compareTo(palabra) > 0)
                    if (vector.get(max / 2).compareTo(palabra) < 0 || vector.get(max / 2).compareTo(palabra) > 0)
                        if (vector.get(max / 2).compareTo(palabra) < 0)
                            cont = max / 2;
                        else
                            max = max / 2;
                    else sw = true;
                else sw = true;
            } while (sw = false);
            while (cont <= max) {
                if (vector.get(cont).equals(palabra))
                    System.out.println("La palabra esta en la posicion " + cont);
                cont++;
            }
            return 1;
        }
    }

    public int busqueda(Vector<String> vector, String palabra) {
        int aux = 0;
        for (int cont = 0; cont < vector.size(); cont++) {
            if (vector.get(cont).equals(palabra)) {
                aux++;
            }
        }
        if (aux > 0) {
            return aux;
        } else
            return aux;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[(int) (Math.random() * 100 - 1)];
        for (int cont = 0; cont < array.length; cont++)
            array[cont] = (int) (Math.random() * 100 + 1);
        System.out.println("Array sin ordenarPorNota: ");
        for (int cont = 0; cont < array.length; cont++) {
            System.out.print(array[cont] + " ");
        }
        System.out.println("\n Array ordenado: ");
        burbuja(array);
        for (int cont = 0; cont < array.length; cont++) {
            System.out.print(array[cont] + " ");
        }
        System.out.println("\n Introduzca el numero a buscar: ");
        int num = entrada.nextInt();
        busquedaBinaria(array, num);
    }
}
