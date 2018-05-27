/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package T7.PracticaObligatoriaFicheros.Ejercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new Libros());
        arrayList.add(new Revistas());
        Main main = new Main();
        int opc = 0;
        do {
            System.out.println("1.Crear  fichero  \n" +
                    "2.Añadir  publicaciones  \n" +
                    "3.Mostrar  datos.\n" +
                    "4.Salir  del  programa");
            try {
                opc = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (opc) {
                case 1:
                    main.escribirObjeto("C:\\Ficheros\\Publicaciones.obj", arrayList);
                    break;
                case 2:
                    System.out.println("1.Añadir libro\n" +
                            "2.Añadir Revista\n");
                    try {
                        opc = Integer.parseInt(bufferedReader.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    switch (opc) {
                        case 1:
                            try {
                                System.out.println("Introduzca titulo,  editor, fecha, isbn y autor");
                                arrayList.add(new Libros(bufferedReader.readLine(), bufferedReader.readLine(), main.crearFecha(), bufferedReader.readLine(), bufferedReader.readLine()));
                                main.escribirObjeto("C:\\Ficheros\\Publicaciones.obj", arrayList);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 2:
                            try {
                                System.out.println("Introduzca titulo,  editor, fecha, numero por año y circulacion");
                                arrayList.add(new Revistas(bufferedReader.readLine(), bufferedReader.readLine(), main.crearFecha(), Integer.parseInt(bufferedReader.readLine()), Long.parseLong(bufferedReader.readLine())));
                                main.escribirObjeto("C:\\Ficheros\\Publicaciones.obj", arrayList);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        default:
                            System.out.println("No es una opcion valida.");
                    }
                    break;
                case 3:
                    for (Object e : main.leerObjeto("C:\\Ficheros\\Publicaciones.obj")) {
                        System.out.println(e.toString());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo.");
                    break;
                default:
                    System.out.println("No es una opcion valida.");
            }
        } while (opc != 4);
    }

    public void escribirObjeto(String ruta, ArrayList objetos) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ruta));
            objectOutputStream.writeObject(objetos);
            objectOutputStream.close();
        } catch (IOException e) {
            e.getCause();
        }
    }

    public ArrayList leerObjeto(String ruta) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ruta));
            return (ArrayList) objectInputStream.readObject();
        } catch (IOException e) {
            e.getCause();
        } catch (ClassNotFoundException e) {
            e.getCause();
        }
        return null;
    }

    public GregorianCalendar crearFecha() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduzca el dia");
            int dia = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Introduzca el mes");
            int mes = Integer.parseInt(bufferedReader.readLine());
            System.out.println("introduzca el año");
            int anio = Integer.parseInt(bufferedReader.readLine());
            return new GregorianCalendar(anio, mes, dia);
        } catch (IOException e) {
            System.out.println("Se produjo un error");
        }
        return crearFecha();
    }
}
