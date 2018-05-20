package T7.Ficheros_de_objeto;

import java.util.GregorianCalendar;

public class Publicaciones {

    static long serialVersionUID = 1;
    String titulo, editor;
    GregorianCalendar fecha;

    public Publicaciones() {
        this.titulo = "algo";
        this.editor = "alguien";
        this.fecha.getTime();
    }

    public Publicaciones(String titulo, String editor, GregorianCalendar fecha) {
        this.titulo = titulo;
        this.editor = editor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Publicaciones{" +
                "titulo='" + titulo + '\'' +
                ", editor='" + editor + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
