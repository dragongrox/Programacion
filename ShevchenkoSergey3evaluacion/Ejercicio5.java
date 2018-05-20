package ShevchenkoSergey3evaluacion;

import java.io.*;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        FileReader archivo = null;
        System.out.println("Introduzca la ruta del archivo: ");
        Scanner entrada = new Scanner(System.in);
        String ruta = entrada.nextLine();
        try {
            archivo = new FileReader(ruta);
            long nLineas = 0;
            BufferedReader bf = new BufferedReader(archivo);
            String linea = null;
            while ((linea = bf.readLine()) != null) {
                nLineas++;
            }

            System.out.println("Numero de lineas " + nLineas);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
