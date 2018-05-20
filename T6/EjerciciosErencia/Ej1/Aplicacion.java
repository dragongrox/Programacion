package T6.EjerciciosErencia.Ej1;

public class Aplicacion {
    public static void main(String[] args) {
        ListaMultimedia listaMultimedia = new ListaMultimedia(10);
        listaMultimedia.add(new Multimedia("Black Panther", "Ryan Coogler", 135, Multimedia.formato.mpg));
        listaMultimedia.add(new Multimedia("Thor: Ragnarok", "Taika Waititi", 130, Multimedia.formato.mpg));
        listaMultimedia.add(new Multimedia("Guardianes de la Galaxia Vol. 2", "James Gunn", 138, Multimedia.formato.mpg));
        listaMultimedia.add(new Multimedia("Capitán América: Civil War", "Joe Russo, Anthony Russo", 148, Multimedia.formato.mpg));

        System.out.println(listaMultimedia.toString());
    }
}
