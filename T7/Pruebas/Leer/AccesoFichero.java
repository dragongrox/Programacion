package T7.Pruebas.Leer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {
    public static void main(String[] args) {
        LeerFichero acceso = new LeerFichero();
        acceso.leer("C:\\Users\\drago\\Desktop\\prueba.txt");
    }
}

class LeerFichero {


    public void leer(String ruta) {
        try {
            FileReader entrada = new FileReader(ruta);

            int c = 0;

            while (c != -1) {
                c = entrada.read();
                System.out.print((char) c);
            }

            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
