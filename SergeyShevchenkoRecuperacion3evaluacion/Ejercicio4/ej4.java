package SergeyShevchenkoRecuperacion3evaluacion.Ejercicio4;

import java.io.*;

public class ej4 {

    public String metodo2() {
        String resultado = "";
        File fichero = new File("fichero.dat");
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero, true));
            dos.writeInt(4);
            dos.writeInt(6);
            dos.close();
            dos.writeInt(8);
        } catch (IOException e) {
            resultado = "Vaya, algo fallo";
        }
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(fichero));
            int b;
            b = dis.readInt();
            b = +dis.readInt();
            return resultado + String.valueOf(b);
        } catch (IOException e) {
            System.out.println("Otro error de E\\S");
        }
        return resultado;
    }

    public static void main(String[] args) {
        ej4 ej4 = new ej4();
        System.out.println(ej4.metodo2());
    }
}
