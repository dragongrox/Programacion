package T7.PracticaObligatoriaFicheros.EjerciciosUsandoObjetosFILE;

import java.io.File;
import java.util.Scanner;

/**
 * Escribir  todos  los  ficheros  de  un  directorio  que  empiecen  por  una  determinada letra
 * (indiferente si  es mayúscula o minúscula)  ( FiltroComienzo.java )
 */
public class Ej7 {
    public interface FilenNameFilter {
        boolean accept(File ruta, String nombre);
    }

    public void filtroPrimeraLetra(String ruta, char letra) {
        File file = new File(ruta);
        if (file.exists()) {
            FilenNameFilter filenNameFilter = new FilenNameFilter() {
                @Override
                public boolean accept(File ruta, String nombre) {
                    return nombre.toLowerCase().startsWith(String.valueOf(letra).toLowerCase());
                }
            };
            String[] lista = file.list();
            for (String elemento : lista)
                if (filenNameFilter.accept(file, elemento))
                    System.out.println(elemento);
        } else System.out.printf("La ruta indicada no es valida. ");
    }

    public static void main(String[] args) {
        Ej7 ej7 = new Ej7();
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Introduzca la ruta del directorio y la letra por la que quiere filtrar:\n");
        ej7.filtroPrimeraLetra(entrada.nextLine(), entrada.nextLine().charAt(0));
        entrada.close();
    }
}
