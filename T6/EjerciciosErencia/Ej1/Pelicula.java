package T6.EjerciciosErencia.Ej1;

public class Pelicula extends Multimedia {
    String actorPrincipal, actrizPrincipal;

    public Pelicula(String titulo, String autor, int duracion, Multimedia.formato formato) {
        super(titulo, autor, duracion, formato);
    }

    public Pelicula(String titulo, String autor, int duracion, Multimedia.formato formato, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, duracion, formato);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + "actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'';
    }


}
