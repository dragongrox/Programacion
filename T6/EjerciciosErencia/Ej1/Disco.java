package T6.EjerciciosErencia.Ej1;

public class Disco extends Multimedia {
    public Disco(String titulo, String autor, int duracion, Multimedia.formato formato, String genero) {
        super(titulo, autor, duracion, formato);
        this.genero = genero;
    }

    String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + "genero=" + genero;
    }

    public static void main(String[] args) {
        Disco disco = new Disco("Algo", "mas de lo mismo", 3, Multimedia.formato.mp3, "Rock");
        System.out.println(disco.toString());
    }
}
