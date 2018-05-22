package T7.PracticaObligatoriaFicheros.EjerciciosUsandoObjetosFILE;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostrar  el  contenido  de  los  archivos  y  directorios  de  un  directorio  que
 * leeremos  desde  teclado.  Si  es  un  fichero  tras  su  nombre  incluiremos
 * la  palabra * es  un  fichero.  Si  es  un  directorio  mostraremos  su  contenido  Sólo  lo  haremos
 * sobre  el  primer  nivel  de directorios (ContenidoRecursivo.java)
 */
public class Ej6 {

    public void mostrarContenidoDirectorio(String ruta) {
        File file = new File(ruta);
        System.out.println("Se va a listar el siguiente directorio: \n" + file.getAbsolutePath());
        if (file.exists()) {
            String[] lista = file.list();
            for (String elemento : lista) {
                System.out.println(elemento);
                File file1 = new File(file.getAbsolutePath() + "\\" + elemento);
                if (file1.isDirectory()) {
                    String[] sublista = file1.list();
                    for (String elemento1 : sublista) {
                        System.out.println("\t" + elemento1);
                    }
                }
            }
        } else System.out.printf("El direcorio no existe");
    }

    public static void main(String[] args) {
        Ej6 ej6 = new Ej6();
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Introduzca el directorio a mostrar:");
        ej6.mostrarContenidoDirectorio(entrada.nextLine());
        entrada.close();
    }
}
