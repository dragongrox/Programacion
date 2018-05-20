package ShevchenkoSergeyrecu2evaluacion.Ejercicio2;

public class Gato extends Animal implements Mascota {
    @Override
    public void comer() {

    }

    public Gato(int numPatas) throws Exception {
        super(numPatas);

        if (numPatas != 4) throw new Exception("El numero de patas no es valido");
    }

    @Override
    public void setNombre(String nombre) {

    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public void jugar() {

    }
}
