package T4.PracticaArrayListYVector;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 * @Author Sergey Shevchenko
 */
/*
programa pide por teclado los datos de los coches y los almacena en memoria.
Los datos a introducir son:
•matrícula
•marca
•modelo
•tipo de combustible
•Km
Queremos conocer:
a)Información sobre todos los coches que se han introducido.
b)Todos los coches de una marca determinada,escribiremos la información de estos coches y el número total de coches.
c)Todos los coches con menos de un número determinado de Kilómetros, escribiremos la información de estos coches y
  el número total de coches.
d)El coche o coches con mayor número de Kilómetros.Escribiremos la matriculamarcay modelo de los que cumplen esta condición.
e)Dado un tipo de combustible, todos los coches que consumen dicho combustible(información delvehículoy número de vehículos)
f)Todos los coches ordenados por número dekilómetros de menor a mayor.
 */
public class ej1 {
    public static Coche introducir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la matricula: ");
        String matricula = entrada.nextLine();
        System.out.println("Introduzca la marca: ");
        String marca = entrada.nextLine();
        System.out.println("Introduzca el modelo: ");
        String modelo = entrada.nextLine();
        System.out.println("Introduzca el tipo de combustible: ");
        String tCombustible = entrada.nextLine();
        System.out.println("Introduzca el numero de km: ");
        int km = entrada.nextInt();
        return new Coche(matricula, marca, modelo, tCombustible, km);
    }

    public static void ordenarPorKm(ArrayList<Coche> arraylist) {
        ArrayList<Coche> arraylistCopia = arraylist;
        for (int cont = 0; cont < arraylistCopia.size(); cont++) {
            for (int aux = 0; aux < arraylistCopia.size(); aux++)
                if (arraylistCopia.get(cont).getKm() < arraylistCopia.get(aux).getKm()) {
                    Coche coche = new Coche(arraylistCopia.get(cont));
                    arraylistCopia.set(cont, arraylistCopia.get(aux));
                    arraylistCopia.set(aux, coche);
                }
        }
        mostrarTodo(arraylistCopia);
    }

    public static void filtrarCombustible(ArrayList<Coche> arraylist) {
        Scanner entrada;
        System.out.println("Introduzca el tipo de combuestible por el cual se filtraran los coches: ");
        entrada = new Scanner(System.in);
        String combustible = entrada.nextLine();
        for (int cont = 0; cont < arraylist.size(); cont++)
            if (arraylist.get(cont).getTipoDeCombustible().equals(combustible))
                System.out.println(arraylist.get(cont).toString());
    }

    public static void masKm(ArrayList<Coche> arraylist) {
        int max = Integer.MIN_VALUE, pos = 0;
        for (int cont = 0; cont < arraylist.size(); cont++)
            if (arraylist.get(cont).getKm() > max) {
                max = arraylist.get(cont).getKm();
                pos = cont;
            }
        System.out.println("El vehiculo con mas km es " + arraylist.get(pos).toString());
    }

    public static void filtrarKm(ArrayList<Coche> arraylist) {
        Scanner entrada;
        System.out.println("Introduzca pordebajo de cuantos km quiere buscar los coches: ");
        entrada = new Scanner(System.in);
        int km = entrada.nextInt();
        for (int cont = 0; cont < arraylist.size(); cont++) {
            if (arraylist.get(cont).getKm() < km) {
                System.out.println(arraylist.get(cont).toString());
            }
        }
    }

    public static void filtrarMarca(ArrayList<Coche> arraylist) {
        Scanner entrada;
        System.out.println("Introduzca la marca por la que filtrar: ");
        entrada = new Scanner(System.in);
        String marca = entrada.nextLine();
        marca.toLowerCase();
        for (int cont = 0; cont < arraylist.size(); cont++) {
            if (arraylist.get(cont).getMarca().equals(marca))
                System.out.println(arraylist.get(cont).toString());
        }
    }

    public static void mostrarTodo(ArrayList<Coche> arraylist) {
        for (int cont = 0; cont < arraylist.size(); cont++) {
            System.out.println(arraylist.get(cont).toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Coche> arraylist = new ArrayList<Coche>();
        arraylist.add(new Coche("431242", "citroen", "c3", "gasolina", 123124));
        arraylist.add(new Coche());
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("1.Introducir los datos de un coche.\n" +
                    "2.Informacion sobre todos los coches.\n" +
                    "3.Todos los coches de una marca determinada\n" +
                    "4.Todos los coches con menos de un número determinado de Kilómetros.\n" +
                    "5.El coche o coches con mayor número de Kilómetros.\n" +
                    "6.Todos los coches que consumen un combustible determinado\n" +
                    "7.Todos los coches odenados por numero de kilometros de menor a mayor.\n" +
                    "0.Salir.\n" +
                    "Eliga una de las opciones anteriores: ");
            entrada = new Scanner(System.in);
            opc = entrada.nextInt();
            new Scanner(System.in);
            switch (opc) {
                case 0:
                    System.out.println("El programa ha sido realizado por Sergey Shevchenko");
                case 1:
                    arraylist.add(introducir());
                    break;
                case 2:
                    mostrarTodo(arraylist);
                    break;
                case 3:
                    filtrarMarca(arraylist);
                    break;
                case 4:
                    filtrarKm(arraylist);
                    break;
                case 5:
                    masKm(arraylist);
                    break;
                case 6:
                    filtrarCombustible(arraylist);
                    break;
                case 7:
                    ordenarPorKm(arraylist);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opc != 0);
    }
}
