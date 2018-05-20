package T7.Ficheros_de_objeto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class main {

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opc = 0;
        do {
            opc = 0;
            System.out.println("1.Crear fichero\n" +
                    "2.Añadir publicaciones\n" +
                    "3.Mostrar datos.\n" +
                    "4.Salir del programa");
            try {
                opc = Integer.parseInt(entrada.readLine());
            } catch (Exception e) {
                System.out.println("No es un valor valido.");
            }
            switch (opc) {
                case 1:
                    System.out.println();
                case 2:
                    System.out.println();
                case 3:
                    System.out.println();
            }

        } while (opc != 4);
    }
}
