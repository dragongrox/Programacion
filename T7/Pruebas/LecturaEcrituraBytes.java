package T7.Pruebas;

import java.io.*;

public class LecturaEcrituraBytes {
    public int[] leectura(String ruta) {
        int[] salida = null;
        try {
            FileInputStream archivoL = new FileInputStream(ruta);
            File archivoT = new File(ruta);
            salida = new int[(int) archivoT.length() + 1];
            int bEntrada = 0, cont = 0;
            while (bEntrada != -1) {
                bEntrada = archivoL.read();
                salida[cont] = bEntrada;
                cont++;
            }
            archivoL.close();
            return salida;
        } catch (IOException e) {
            System.out.println("Se ha producido un error.");
            return null;
        }
    }

    public void escritura(int[] contenido, String ruta) {
        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            for (int elemento : contenido) {
                archivo.write(elemento);
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error.");
        }
    }

    public static void main(String[] args) {
        LecturaEcrituraBytes lecturaEcrituraBytes = new LecturaEcrituraBytes();
        int[] archivo = lecturaEcrituraBytes.leectura("C:\\Users\\drago\\Pictures\\Captura.PNG");
        for (int elemento : archivo) {
            System.out.println(elemento);
        }
        lecturaEcrituraBytes.escritura(archivo, "C:\\Users\\drago\\Pictures\\Captura2.PNG");
    }
}
