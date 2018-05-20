package ShevchenkoSergeyrecu2evaluacion.Ejercicio2;

public abstract class Animal {
    int numPatas;

    public Animal(int numPatas) {
        this.numPatas = numPatas;
    }

    public void caminar() {
        System.out.println("Este animal se desplaza usando " + numPatas + " patas");
    }

    public abstract void comer();

}
