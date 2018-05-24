package SergeyShevchenkoRecuperacion3evaluacion.Ejercicio2;

public class Portero extends Teoria.Jugador {

    private int golpesRecibidos, penaltisParados;

    public Portero(String n, String d, int p, int g, int a, int r, int golpesRecibidos, int penaltisParados) {
        super(n, d, p, g, a, r);
        this.golpesRecibidos = golpesRecibidos;
        this.penaltisParados = penaltisParados;
    }

    public Portero() {
        this("Juan", "algo", 1, 2, 3, 4, 6, 7);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Golpes Recibidos: " + golpesRecibidos);
        System.out.println("Penaltis Parados: " + penaltisParados);
    }
}
