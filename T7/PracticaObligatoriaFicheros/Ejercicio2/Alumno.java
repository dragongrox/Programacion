package T7.PracticaObligatoriaFicheros.Ejercicio2;

import java.io.Serializable;

public class Alumno implements Serializable {
    String nombre, direccion;
    int edad;
    float notaMedia;

    public Alumno(String nombre, String direccion, int edad, float notaMedia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.notaMedia = notaMedia;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                ", notaMedia=" + notaMedia +
                '}';
    }
}
