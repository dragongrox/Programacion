package T7.PracticaObligatoriaFicheros.EjerciciosUsandoObjetosFILE;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        String ruta = "C:\\";
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("INTRODUCE RUTA DEL ARCHIVO");
            ruta = sc.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println("ERROR EN LA ENTRADA");
        }
        File r = new File(ruta);
        if (r.isDirectory()) {
            File[] ficheros = r.listFiles();
            for (File f : ficheros)
                System.out.println(f.getName());
        } else
            System.out.println("No es un directorio");
        sc.close();
    }
}
