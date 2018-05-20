package T4.PracticaArrayListYVector;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Author Sergey Shevchenko
 */
/*
a)Mostrar en pantalla todos los alumnos que se encuentren en la asignatura.
b)Mostrar en pantalla los alumnos que se encuentren en semipresencial y su cantidad.
c)Ordenar los alumnos de acuerdo a su nota (de mayor a menor) y mostrarlo en pantalla.
d)Ordenar los alumnos de acuerdo a su nota (de menor a mayor) y mostrarlo en pantalla.
e)Ordenar los alumnos por nombre y apellido y mostrarlo en pantalla
 */
public class ej2 {
    static Vector<Alumno> vector = new Vector<Alumno>();

    public static Vector ordenarPorNota(Vector vector) {
        Vector<Alumno> vectorCopia = vector;
        for (int cont = 0; cont < vectorCopia.size(); cont++) {
            for (int aux = 0; aux < vectorCopia.size(); aux++)
                if (vectorCopia.get(cont).getNotaFinal() < vectorCopia.get(aux).getNotaFinal()) {
                    Alumno alumno = new Alumno(vectorCopia.get(cont));
                    vectorCopia.set(cont, vectorCopia.get(aux));
                    vectorCopia.set(aux, alumno);
                }
        }
        return vectorCopia;
    }

    public static String ordenarPorNombreApellido(Vector vector) {
        Vector<Alumno> vectorCopia = vector;
        for (int cont = 0; cont < vectorCopia.size(); cont++) {
            for (int aux = 0; aux < vectorCopia.size(); aux++)
                if (vectorCopia.get(cont).getNombre().charAt(0) < vectorCopia.get(aux).getNombre().charAt(0)) {
                    Alumno alumno = new Alumno(vectorCopia.get(cont));
                    vectorCopia.set(cont, vectorCopia.get(aux));
                    vectorCopia.set(aux, alumno);
                }
        }
        for (int cont = 0; cont < vectorCopia.size(); cont++) {
            for (int aux = 0; aux < vectorCopia.size(); aux++)
                if (vectorCopia.get(cont).getApellidos().charAt(0) < vectorCopia.get(aux).getApellidos().charAt(0) &&
                        vectorCopia.get(cont).getNombre().charAt(0) == vectorCopia.get(aux).getNombre().charAt(0)) {
                    Alumno alumno = new Alumno(vectorCopia.get(cont));
                    vectorCopia.set(cont, vectorCopia.get(aux));
                    vectorCopia.set(aux, alumno);
                }
        }
        String ret = "";
        for (int cont = 0; cont < vectorCopia.size(); cont++)
            ret += vectorCopia.get(cont).toString();
        return ret;
    }

    public static String notaMenorMayor() {
        Vector<Alumno> vectorCopia = ordenarPorNota(vector);

        String ret = "";
        for (int cont = 0; cont < vectorCopia.size(); cont++)
            ret += vectorCopia.get(cont).toString();
        return ret;
    }

    public static String notaMayorMenor() {
        Vector<Alumno> vectorCopia = ordenarPorNota(vector);
        String ret = "";
        for (int cont = vectorCopia.size() - 1; cont >= 0; cont--)
            ret += vectorCopia.get(cont).toString();
        return ret;
    }

    public static String alumnosSemipresencial() {
        String ret = "";
        int aux = 0;
        for (int cont = 0; cont < vector.size(); cont++)
            if (vector.get(cont).getCondición().equals("semipresencial")) {
                ret += vector.get(cont).toString();
                aux++;
            }
        ret += "En total hay " + aux + " alumnos.";
        return ret;
    }

    public static Alumno ingresar() {
        Scanner entrada = new Scanner(System.in);
        Alumno alumno = new Alumno();
        System.out.println("Introduzca el nombre: ");
        alumno.setNombre(entrada.nextLine());
        entrada = new Scanner(System.in);
        System.out.println("Introduzca el apellido: ");
        alumno.setApellidos(entrada.nextLine());
        entrada = new Scanner(System.in);
        System.out.println("Introduzca el DNI: ");
        alumno.setDNI(entrada.next());
        entrada = new Scanner(System.in);
        System.out.println("Introduzca el sexo(H/M): ");
        alumno.setSexo(entrada.next());
        entrada = new Scanner(System.in);
        System.out.println("Introduzca la condicion (presencia/semipresencial): ");
        alumno.setCondición(entrada.next());
        entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota final: ");
        alumno.setNotaFinal(entrada.nextInt());
        return alumno;
    }

    public static String mostrarAlumnos() {
        String ret = "";
        for (int cont = 0; cont < vector.size(); cont++)
            ret += vector.get(cont).toString();
        return ret;
    }

    public static void main(String[] args) {
        vector.add(new Alumno());
        vector.add(new Alumno("Miguel Angel", "Lopez Sanchez", "321456897a", "H", "semipresencial", 9));
        vector.add(new Alumno("Miguel Angel", "Aguirrez", "111456897a", "H", "semipresencial", 9));

        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("1.Introducir alumno.\n" +
                    "2.Mostrar todos los alumnos.\n" +
                    "3.Alumnos de semipresencial.\n" +
                    "4.Ordenar alumnos de mayor a menor.\n" +
                    "5.Ordenar alumnos de menor a mayor.\n" +
                    "6.Ordenar por nombre y apellido.\n" +
                    "0.Salir.\n" +
                    "Seleccione una opcion:");
            opc = entrada.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Programa realizado por Sergey Shevchenko.");
                    break;
                case 1:
                    vector.add(ingresar());
                    break;
                case 2:
                    System.out.println(mostrarAlumnos());
                    break;
                case 3:
                    System.out.println(alumnosSemipresencial());
                    break;
                case 4:
                    System.out.println(notaMayorMenor());
                    break;
                case 5:
                    System.out.println(notaMenorMayor());
                    break;
                case 6:
                    System.out.println(ordenarPorNombreApellido(vector));
                    break;
                default:
                    System.out.println("No es una opcion valida.");
            }
        } while (opc != 0);
    }
}
