package T8.PracticaObligatoriaT8.ejercicio29;

import javax.swing.*;
import java.io.*;

public class ManejoFichero {
    public void escribirObjeto(String ruta, Persona[] objetos) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ruta));
            objectOutputStream.writeObject(objetos);
            objectOutputStream.close();
        } catch (IOException e) {
            e.getCause();
        }
    }

    public Persona[] leerObjeto(String ruta) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ruta));
            Persona[] objects = (Persona[]) objectInputStream.readObject();
            return objects;
        } catch (IOException e) {
            e.getCause();
        } catch (ClassNotFoundException e) {
            e.getCause();
        }
        return null;
    }

    public static void main(String[] args) {
        InterfazGrafica interfazGrafica = new InterfazGrafica();
        interfazGrafica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfazGrafica.setVisible(true);
    }
}
