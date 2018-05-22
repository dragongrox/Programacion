package T7.Pruebas;

import java.io.File;

public class Pruebas_rutas {
    public static void main(String[] args) {
        File file = new File("C:\\ProgramacionDragon");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        String[] lista = file.list();
        for (String elemento : lista) {
            System.out.println(elemento);
            File f = new File(file.getAbsolutePath(), elemento);
            if (f.isDirectory()) {
                String[] archivos = f.list();
                for (String element : archivos) {
                    System.out.println("\t" + element);
                }
            }
        }
    }
}
