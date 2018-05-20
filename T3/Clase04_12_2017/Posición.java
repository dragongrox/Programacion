package T3.Clase04_12_2017;

public class Posición {

    private int fila;
    private char columna;

    public Posición(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public String toString() {
        return "Fila = " + this.fila + ", columna = " + this.columna;
    }

}
