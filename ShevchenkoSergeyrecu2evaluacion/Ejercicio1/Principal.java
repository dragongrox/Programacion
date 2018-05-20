package ShevchenkoSergeyrecu2evaluacion.Ejercicio1;

import ShevchenkoSergeyrecu2evaluacion.Utilidades;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * @Author Sergey  Shevchenko
 */
public class Principal extends Utilidades {

    static Scanner entrada = new Scanner(System.in);

    String nombre;

    double[] ventas;

    static Vector<Principal> almacen = new Vector<Principal>();

    public Principal() {
        ventas = new double[12];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", ventas=" + Arrays.toString(ventas);
    }

    public void introducir() {

        try {
            System.out.println("Introduzca el nombre del empleado: ");
            entrada = new Scanner(System.in);
            setNombre(entrada.nextLine());
        } catch (Exception e) {
            System.out.println("No es un valor valido.");
        }
        try {
            System.out.println("Introduzca las ventas de cada mes: ");
            for (int cont = 0; cont < 12; cont++) {
                System.out.println("Mes " + (cont + 1));
                entrada = new Scanner(System.in);
                ventas[cont] = entrada.nextDouble();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fuera de rango.");
        } catch (Exception e) {
            System.out.println("No es un valor valido.");
        }
    }

    public static void main(String[] args) {
        int opc = 0;
        Principal obj = new Principal();
        do {
            System.out.println("1.Introducir datos de un empleado.");
            System.out.println("2.Mostrar todos los empleados almacenados");
            System.out.println("3.Total de ventas anuales.");
            System.out.println("4.Importe total de ventas y importe a pagar por comisiones");
            System.out.println("5.Media de ventas en cada mes.");
            System.out.println("6.Salir");
            System.out.println("Introduzca una de las opciones: ");
            entrada = new Scanner(System.in);
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    obj.introducir();
                    almacen.add(obj);
                    break;
                case 2:
                    System.out.println(almacen);
                case 3:
                    for (int cont = 0; cont < almacen.size(); cont++) {
                        System.out.println("El empleado " + almacen.get(cont).getNombre() + "tiene unas ventas anuales de " +
                                suma(almacen.get(cont).ventas) + " con una comision del " + (suma(almacen.get(cont).ventas) * 10 / 100));
                    }
                    break;
                case 4:
                    double total = 0;
                    for (int cont = 0; cont < almacen.size(); cont++) {
                        total += suma(almacen.get(cont).ventas);
                    }
                    System.out.println("El total de las ventas es de " + total + " con una comision total de " + (total * 10 / 100));
                    break;
                case 6:
                    System.out.println("El programa se va a terminar...");
                    break;
                default:
                    System.out.println("No es una opcion valida.");
            }
        } while (opc != 6);
    }
}
