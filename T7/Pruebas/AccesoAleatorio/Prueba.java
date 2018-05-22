package T7.Pruebas.AccesoAleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Prueba {
    public static void main(String[] args) {
        String s="3424",s1="sd",s2="asd4";

        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile("C:\\Users\\drago\\Desktop\\prueba.txt","rw");
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.writeBytes(s);
            randomAccessFile.writeBytes(s1);
            randomAccessFile.writeBytes(s2+"\n");
            randomAccessFile.seek(0);
            System.out.println(randomAccessFile.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
