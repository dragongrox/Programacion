package T7.Ficheros_de_objeto;

import java.util.GregorianCalendar;

public class Revistas extends Publicaciones {

    int numerosPorAnyo;
    long circulacion;

    public Revistas() {
        this.numerosPorAnyo = 33;
        this.circulacion = 34;
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
        return "Revistas{" +
                "numerosPorAnyo=" + numerosPorAnyo +
                ", circulacion=" + circulacion +
                ", titulo='" + titulo + '\'' +
                ", editor='" + editor + '\'' +
                ", fecha=" + fecha +
                "} " + super.toString();
    }
}
