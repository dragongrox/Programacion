package ShevchenkoSergeyrecu2evaluacion.Ejercicio2;

public class Araña extends Animal {
    @Override
    public void comer() {

    }

    public Araña(int numPatas) throws Exception {
        super(numPatas);

        if (numPatas != 8) throw new Exception("El numero de patas no es valido");
    }
}
