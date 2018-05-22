package T7.Pruebas.Leer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheroBuffer {
    public static void main(String[] args) {
        LeerFicheroBuffer acceso = new LeerFicheroBuffer();
        acceso.leer("C:\\Users\\drago\\Desktop\\prueba.txt");
    }
}

class LeerFicheroBuffer {


    public void leer(String ruta) {
        try {
            FileReader entrada = new FileReader(ruta);

            BufferedReader bufferedReader = new BufferedReader(entrada);

            String linea = "";

            while (linea != null) {
                linea = bufferedReader.readLine();
                System.out.println(linea);
            }

            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
