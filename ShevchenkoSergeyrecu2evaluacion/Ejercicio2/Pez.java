package ShevchenkoSergeyrecu2evaluacion.Ejercicio2;

public class Pez extends Animal implements Mascota {
    @Override
    public void comer() {

    }

    public Pez(int numPatas) throws Exception {
        super(numPatas);
        if (numPatas != 0) throw new Exception("El numero de patas no es valido");
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
