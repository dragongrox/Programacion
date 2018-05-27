/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package T7.PracticaObligatoriaFicheros.Ejercicio4;

import java.util.GregorianCalendar;

public class Publicaciones {
    String titulo, editor;
    GregorianCalendar fecha;

    public Publicaciones() {
        this.titulo = "Ejemplo";
        this.editor = "Ejemplo";
        this.fecha = new GregorianCalendar(1996, 2, 15);
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
