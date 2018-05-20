package T7.Ficheros_de_objeto;

import java.util.GregorianCalendar;

public class Libros extends Publicaciones {
    String isbn, autor;

    public Libros() {
        this.isbn = "algo";
        this.autor = "alguien";
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
        return "Libros{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editor='" + editor + '\'' +
                ", fecha=" + fecha +
                "} " + super.toString();
    }
}
