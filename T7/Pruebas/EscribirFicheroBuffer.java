package T7.Pruebas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroBuffer {
    public static void main(String[] args) {
        EscribiendoBuffer escribiendo = new EscribiendoBuffer();
        escribiendo.escribir("Esto es una prueba \n" +
                "Algo mas \n", "C:\\Users\\drago\\Desktop\\prueba.txt");
    }
}

class EscribiendoBuffer {
    public void escribir(String texto, String ruta) {
        try {
            FileWriter fileWriter = new FileWriter(ruta, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int cont = 0; cont < texto.length(); cont++) {
                bufferedWriter.write(texto.charAt(cont));
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Se ha producido un error");
        }
    }
}
