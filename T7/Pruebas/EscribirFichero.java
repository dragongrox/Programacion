package T7.Pruebas;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static void main(String[] args) {
        Escribiendo escribiendo = new Escribiendo();
        escribiendo.escribir("Esto es una prueba \n" +
                "Algo mas \n", "C:\\Users\\drago\\Desktop\\prueba.txt");
    }
}

class Escribiendo {
    public void escribir(String texto, String ruta) {
        try {
            FileWriter fileWriter = new FileWriter(ruta, true);

            for (int cont = 0; cont < texto.length(); cont++) {
                fileWriter.write(texto.charAt(cont));
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Se ha producido un error");
        }
    }
}
