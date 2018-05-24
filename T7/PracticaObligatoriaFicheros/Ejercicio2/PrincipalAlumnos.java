package T7.PracticaObligatoriaFicheros.Ejercicio2;



import java.io.*;

import java.util.Vector;

/**
 * Crear  un  fichero  de  alumnos  con  los  datos  de  los  alumnos  de  un  curso:  nombre,
 * dirección,  edad  y  nota  media.  Crear  los  métodos  para  crear  el  archivo  y  mostrar
 * datos.  Leer  desde  el  teclado  y  escribir  por  pantalla  los  datos  de  cada  uno  de  los
 * alumnos
 */

public class PrincipalAlumnos {

    public void escribirObjeto(String ruta, Vector objetos) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ruta));
            objectOutputStream.writeObject(objetos);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Vector leerObjeto(String ruta) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ruta));
            Vector<Alumno> objects = (Vector) objectInputStream.readObject();
            return objects;
        } catch (IOException e) {
            System.out.println(e.getCause());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getCause());
        }
        return null;
    }

    public static void main(String[] args) {
        int opc=0;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        Vector <Alumno> vector=new Vector();
        PrincipalAlumnos principalAlumnos=new PrincipalAlumnos();
        File file=new File("");
        do {
            System.out.println("0.Introducir alumno nuevo y guardarlo.\n" +
                    "1.Leer alumnos guardados.\n" +
                    "2.Salir.");
            try {
                opc= Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (opc){
                case 0:
                    System.out.println("Introduzca nombre, direccion, edad y nota media");
                    Alumno alumno= null;
                    try {
                        alumno = new Alumno(bufferedReader.readLine(),bufferedReader.readLine(),Integer.valueOf(bufferedReader.readLine()),Float.valueOf(bufferedReader.readLine()));
                    } catch (IOException e) {
                        System.out.println("Se ha producido un error: "+e.getCause());
                    } catch (NumberFormatException e){
                        System.out.println("Se ha producido un error: "+e.getCause());
                    }
                    vector.addElement(alumno);
                    principalAlumnos.escribirObjeto(file.getAbsolutePath()+"\\Alumnos",vector);
                    break;
                case 1:
                    for (int cont=0;cont<principalAlumnos.leerObjeto(file.getAbsolutePath()).size();cont++) {
                        System.out.println();
                        System.out.println();
                        vector=principalAlumnos.leerObjeto(file.getAbsolutePath() + "\\Alumnos");
                        vector.get(cont).toString();
                    }
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    default:
                        System.out.println("No es una opcion valida");
            }
        }while (opc!=2);
    }
}
