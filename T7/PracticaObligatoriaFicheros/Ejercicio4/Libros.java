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

public class Libros extends Publicaciones implements Serializable {

    String isbn, autor;

    public Libros() {
        super();
        this.isbn = "3245648";
        this.autor = "Juan";
    }

    public Libros(String titulo, String editor, GregorianCalendar fecha, String isbn, String autor) {
        super(titulo, editor, fecha);
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return "Libros{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editor='" + editor + '\'' +
                ", fecha=" + sdf.format(fecha.getTime()) +
                '}';
    }
}
