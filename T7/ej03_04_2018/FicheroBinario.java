package T7.ej03_04_2018;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroBinario {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\drago\\Documents\\GitHub\\programacion\\src\\T7\\ej03_04_2018\\fich_binario.ddr", true))) {//Escribimos un numero
            dos.writeInt(23);//Escribimos una cadena
            dos.writeUTF("Fernando");//Escribimos un numero
            dos.writeInt(1990);
            dos.writeFloat(3.14f);
        } catch (IOException e) {
            System.out.println("Error E/S");
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\drago\\Documents\\GitHub\\programacion\\src\\T7\\ej03_04_2018\\fich_binario.ddr"));) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
        } catch (IOException e) {
            System.out.println("Error E/S");

        }
    }
}