package T4.Clase11_01_2018;
/*
Introducir los empleados por teclado.
Capacidad del vector
Cuantos empleados tiene
mostrar sus datos
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Empleado {
    private String nombre, direccion, telefono, nif;
    private Especialidad especialidad;

    public Empleado() {
        nombre = "Juan";
        direccion = "C Murcia 43";
        telefono = "321456897";
        nif = "n32145678k";
        especialidad = Especialidad.MECANICA;
    }

    public Empleado(String nombre, String direccion, String telefono, String nif, Especialidad especialidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nif = nif;
        this.especialidad = especialidad;
    }

    public Empleado(Empleado t) {
        this.nombre = t.nombre;
        this.direccion = t.direccion;
        this.telefono = t.telefono;
        this.nif = t.nif;
        this.especialidad = t.especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nif='" + nif + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }

    public static void main(String[] args) {
        Vector empleados = new Vector(5, 5);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de personas a introducir: ");
        int cont = entrada.nextInt();
        Empleado empleado = new Empleado();
        while (cont > 0) {
            System.out.println("Introduzca el nombre, la direccion, el telefono, el nif:");

        }


    }
}
