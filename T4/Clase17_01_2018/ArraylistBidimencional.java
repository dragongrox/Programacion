package T4.Clase17_01_2018;
/**
 * @Author Sergey Shevchenko
 */

import java.util.ArrayList;
import java.util.Scanner;

/*
dni|nombre|apellidos|edad|empresas(a/b)

dada una empresa (A/B) todos los datos de los empleados de la emp.
datos de la/el mas mayor y el/la mas joven (si hay varios todos).
Dadauna empresa (A/B) crear un array con los empleados de dicha empresa.
 */
public class ArraylistBidimencional {
    public static void main(String[] args) {
        ArrayList<ArrayList> arrayListArrayList = new ArrayList<>();
        int empleado = 0;
        Scanner entrada = new Scanner(System.in);
        for (int cont = 0, aux = 1; aux != 0; cont++) {
            System.out.println("Introduzca el dni, nombre, apellidos, edad y empresa");
            for (int c = 0; c < 5; c++)
                arrayListArrayList.add(new ArrayList<String>());
            for (int columna = 0; columna < 5; columna++)
                arrayListArrayList.get(cont).add(entrada.next());
            System.out.println("Si desea terminar el proceso de introduccion introduzca 0");
            aux = entrada.nextInt();
            empleado++;
        }
        arrayListArrayList.trimToSize();
        for (int cont2 = 0; cont2 < empleado; cont2++) {
            arrayListArrayList.get(cont2).trimToSize();
            for (int cont = 0; cont < 5; cont++)
                System.out.println(arrayListArrayList.get(cont2).get(cont));
            System.out.println();
        }

        System.out.println("Introduzca la empresa: ");
        String empresa = entrada.next();
        for (int cont2 = 0; cont2 < empleado; cont2++) {
            if (arrayListArrayList.get(cont2).get(4).equals("a"))
                for (int cont = 0; cont < 5; cont++)
                    System.out.println(arrayListArrayList.get(cont2).get(cont));
            System.out.println();
        }

        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        for (int cont2 = 0; cont2 < empleado; cont2++) {

        }

    }
}
