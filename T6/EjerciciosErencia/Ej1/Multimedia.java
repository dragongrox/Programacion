package T6.EjerciciosErencia.Ej1;

import java.util.Objects;

public class Multimedia {
    String titulo, autor;
    int duracion;

    enum formato {
        wav, mp3, midi, avi, mov, mpg, cdAudio, dvd;
    }

    static formato formato;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Multimedia.formato getFormato() {
        return formato;
    }

    public void setFormato(Multimedia.formato formato) {
        this.formato = formato;
    }

    public Multimedia(String titulo, String autor, int duracion, Multimedia.formato formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", duracion=" + duracion +
                ", formato=" + formato + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return duracion == that.duracion &&
                Objects.equals(titulo, that.titulo) &&
                Objects.equals(autor, that.autor) &&
                formato == that.formato;
    }


}
