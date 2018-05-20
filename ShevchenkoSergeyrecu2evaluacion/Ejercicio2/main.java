package ShevchenkoSergeyrecu2evaluacion.Ejercicio2;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Animal> almacen = new ArrayList<Animal>();
    static Scanner entrada = new Scanner(System.in);

    public static void agregar() throws Exception {
        System.out.println("Introduzca el numero de patas: ");
        int num = entrada.nextInt();
        switch (num) {
            case 0:
                almacen.add(new Pez(num));
                break;
            case 4:
                almacen.add(new Gato(num));
                break;
            case 8:
                almacen.add(new Araña(num));
                break;
            default:
                System.out.println("No es un valor valido");
        }
    }

    public static void borrar(int indice) {
        System.out.println("El animal " + almacen.get(indice) + " se va a eliminar");
        almacen.remove(indice);
    }

    public static void modificar(int indice) throws Exception {
        System.out.println("El animal " + almacen.get(indice) + " se va a modificar");
        System.out.println("Introduzca el numero de patas: ");
        int num = entrada.nextInt();
        switch (num) {
            case 0:
                almacen.set(indice, new Pez(num));
                break;
            case 4:
                almacen.set(indice, new Gato(num));
                break;
            case 8:
                almacen.set(indice, new Araña(num));
                break;
            default:
                System.out.println("No es un valor valido");
        }
    }

    public static void mostrar() {
        int A = 0, P = 0, G = 0;
        for (int cont = 0; cont < almacen.size(); cont++) {
            if (almacen.get(cont).numPatas == 0)
                P++;
            else if (almacen.get(cont).numPatas == 4) {
                G++;
            } else A++;
        }
        System.out.println("Arañas=" + A + ", Gatos=" + G + " y Pezes=" + P);
    }

    public static void main(String[] args) {


        int opc = 0;
        do {
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("1.Agregar animal");
            System.out.println("2.Borrar animal");
            System.out.println("3.Modificar animal");
            System.out.println("4.Mostrar numero de cada animal.");
            System.out.println("5.Salir.");
            try {
                entrada = new Scanner(System.in);
                opc = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("No es un numero valido.");
            }
            switch (opc) {
                case 1:
                    try {
                        agregar();
                    } catch (Exception e) {
                        System.out.println("No es un numero de patas valido");
                        ;
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Introduzca la el indice del animal");
                        borrar(entrada.nextInt());
                    } catch (Exception e) {
                        System.out.println("No es una posicion valida.");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Introduzca la el indice del animal");
                        modificar(entrada.nextInt());
                    } catch (Exception e) {
                        System.out.println("No se pudo modificar.");
                    }
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    System.out.println("Se va a cerrar el programa...");
                default:
                    System.out.println("No es un valor valido.");
            }
        } while (opc != 5);
    }
}
