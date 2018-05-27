/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package T7.PracticaObligatoriaFicheros.Ejercicio4;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Revistas extends Publicaciones implements Serializable {
    int numerosPorAnyo;
    long circulacion;


    public Revistas() {
        super();
        this.numerosPorAnyo = 2;
        this.circulacion = 3;
    }

    public Revistas(String titulo, String editor, GregorianCalendar fecha, int numerosPorAnyo, long circulacion) {
        super(titulo, editor, fecha);
        this.numerosPorAnyo = numerosPorAnyo;
        this.circulacion = circulacion;
    }

    public int getNumerosPorAnyo() {
        return numerosPorAnyo;
    }

    public void setNumerosPorAnyo(int numerosPorAnyo) {
        this.numerosPorAnyo = numerosPorAnyo;
    }

    public long getCirculacion() {
        return circulacion;
    }

    public void setCirculacion(long circulacion) {
        this.circulacion = circulacion;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return "Revistas{" +
                "numerosPorAnyo=" + numerosPorAnyo +
                ", circulacion=" + circulacion +
                ", titulo='" + titulo + '\'' +
                ", editor='" + editor + '\'' +
                ", fecha=" + sdf.format(fecha.getTime()) +
                '}';
    }
}
