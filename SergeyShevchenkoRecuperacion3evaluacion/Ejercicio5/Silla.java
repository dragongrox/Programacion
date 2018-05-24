package SergeyShevchenkoRecuperacion3evaluacion.Ejercicio5;

import java.io.Serializable;

public class Silla extends Teoria.Mueble implements Teoria.Numerable, Serializable {

    public Silla(String nombre, int numero) {
        super(nombre);
    }

    public Silla(String nombre) {
        super(nombre);
    }

    @Override
    public int establecerNumero(int numero) {
        return 0;
    }

    @Override
    public int devolverNumero() {
        return 0;
    }

    @Override
    public void incrementarNumero() {

    }
}
