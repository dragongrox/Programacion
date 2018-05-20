package T6.ShevchenkoSergey2evaluacion.Ejercicio1;

public class Complejos implements Racional.Operable {
    int real, imaguinario;

    public Complejos() {
        this.real = 2;
        this.imaguinario = 4;
    }

    public Complejos(Complejos a) {
        this.real = a.real;
        this.imaguinario = a.imaguinario;
    }

    public Complejos(int real, int imaguinario) {
        this.real = real;
        this.imaguinario = imaguinario;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaguinario() {
        return imaguinario;
    }

    public void setImaguinario(int imaguinario) {
        this.imaguinario = imaguinario;
    }

    @Override
    public String toString() {
        return real +
                " + " + imaguinario +
                'i';
    }

    public void invertir() {
        int aux = real;
        real = imaguinario;
        imaguinario = aux;
    }

    @Override
    public int suma() {
        return this.real + this.imaguinario;
    }

    @Override
    public int resta() {
        if (this.real > this.imaguinario)
            return this.real - this.imaguinario;
        else
            return this.imaguinario - this.real;
    }

    @Override
    public int multiplica() {
        return this.real * this.imaguinario * constante;
    }

    @Override
    public int resto() {
        return real % constante;
    }

    public static void main(String[] args) {
        Complejos complejo = new Complejos(5, 6);
        System.out.println("Se creara un numero complejo " + complejo.toString());
        System.out.println("Suma()=" + complejo.suma());
        System.out.println("Resta()=" + complejo.resta());
        System.out.println("Multiplica()=" + complejo.multiplica());
        System.out.println("Resto()=" + complejo.resto());
    }
}
