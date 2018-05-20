package T4.ShevchenkoSergey2evaluacion.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Alumno {
    String Nombre, Apellidos, NIF, Curso, Correo;
    final static String[] asignaturas = {"ingles", "matematicas", "fisica", "dibujo tecnico", "quimica"};

    public Alumno() {
        Nombre = "Sergey";
        Apellidos = "Shevchenko";
        this.NIF = "12345678x";
        Curso = "matematicas";
        Correo = "dragongrox7@gmail.com";
    }

    public Alumno(Alumno t) {
        Nombre = t.Nombre;
        Apellidos = t.Apellidos;
        this.NIF = t.NIF;
        Curso = t.Curso;
        Correo = t.Correo;
    }

    public Alumno(String nombre, String apellidos, String NIF, String curso, String correo) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.NIF = NIF;
        Curso = curso;
        Correo = correo;
    }

    public static boolean comprobacion(Alumno alumno) {
        boolean a = Pattern.matches("[A-z]+\\s?[A-z]*", alumno.getNombre());
        boolean b = Pattern.matches("[A-z]+\\s?[A-z]*", alumno.getApellidos());
        boolean c = Pattern.matches("[0-9]{8}[a-z]{1}", alumno.getNIF());
        boolean d = Pattern.matches(".+[@].+[.].+", alumno.getCorreo());
        boolean e = false;
        for (int cont = 0; cont < asignaturas.length; cont++) {
            if (alumno.getCurso().contains(asignaturas[cont]))
                e = true;
        }
        if (a & b & c & d & e)
            return true;
        else
            return false;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public static Alumno introducir() {
        Scanner entrada = new Scanner(System.in);
        Alumno persona = new Alumno();
        boolean sw = false;
        do {
            System.out.println("Introduzca el nombre: ");
            entrada = new Scanner(System.in);
            persona.setNombre(entrada.nextLine());
            System.out.println("Introduzca los apellidos: ");
            entrada = new Scanner(System.in);
            persona.setApellidos(entrada.nextLine());
            System.out.println("Introduzca el NIF: ");
            entrada = new Scanner(System.in);
            persona.setNIF(entrada.nextLine());
            System.out.println("Introduzca el email: ");
            entrada = new Scanner(System.in);
            persona.setCorreo(entrada.nextLine());
            System.out.println("Introduzca los cursos (separados por espacios): ");
            entrada = new Scanner(System.in);
            persona.setCurso(entrada.nextLine());
            if (!comprobacion(persona))
                System.out.println("Alguno de los datos introducidos no es valido.");
        } while (!comprobacion(persona));
        return persona;
    }

    @Override
    public String toString() {
        return "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", NIF='" + NIF + " \n";
    }

    public static String filtrarPorCurso(String curso, ArrayList<Alumno> contenedor) {
        String ret = "";
        for (int cont = 0; cont < contenedor.size(); cont++)
            if (contenedor.get(cont).getCurso().contains(curso))
                ret += contenedor.get(cont).toString() + "\n";
        if (ret.isEmpty())
            ret += "No hay alumnos matriculados.";
        return ret;
    }

    public static String filtrarNif(String nif, ArrayList<Alumno> contenedor) {
        String ret = "";
        for (int cont = 0; cont < contenedor.size(); cont++)
            if (contenedor.get(cont).getNIF().contains(nif))
                return contenedor.get(cont).getCurso();
        return "No hay alumnos matriculados.";
    }

    public static String ordenarPorNombreApellido(ArrayList<Alumno> vector) {
        ArrayList<Alumno> vectorCopia = vector;
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

    public static void main(String[] args) {
        ArrayList<Alumno> contenedor = new ArrayList<Alumno>();
        Scanner entrada = new Scanner(System.in);
        int opc = 5;
        do {
            System.out.println("1.Introducir alumno. \n" +
                    "2.Filtrar por curso. \n" +
                    "3.Filtrar por alumno. \n" +
                    "4.Ordenar alumnos \n" +
                    "5.Salir \n" +
                    "Introduzca una opcion:");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    contenedor.add(introducir());
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                    System.out.println("Introduzca el curso a filtrar: ");
                    System.out.println(filtrarPorCurso(entrada.nextLine(), contenedor));
                    break;
                case 3:
                    entrada = new Scanner(System.in);
                    System.out.println("Introduzca el nif del alumno: ");
                    System.out.println(filtrarNif(entrada.nextLine(), contenedor));
                    break;
                case 4:
                    System.out.println("Ordenados serian: " + ordenarPorNombreApellido(contenedor));
                    break;
                case 5:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("No es una opcion valida.");
            }
        } while (opc != 5);

    }
}
