package T6.ShevchenkoSergey2evaluacion.Ejercicio1;

public class Racional {
    int numerador, denominador;

    public Racional() {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racional(Racional r) {
        this.numerador = r.numerador;
        this.denominador = r.denominador;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + " / " + denominador;
    }

    public void invertir() {
        int aux = numerador;
        numerador = denominador;
        denominador = aux;
    }

    interface Operable {
        final int constante = 3;

        public int suma();

        public int resta();

        public int multiplica();

        public int resto();
    }
}
