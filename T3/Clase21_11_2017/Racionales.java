package T3.Clase21_11_2017;

/**
 * @Author Sergey Shevchenko
 */
/*
Clase Racionales
    Declarar atributos
    Constructores
        Por defecto
        De clase
        De copia
    setter y getter
    toString
    Metodo para operaciones automaticas
        suma
        resta
        producto
        division

    AgenciaAlquilar
    Declarar 3 objetos
        racional1(por defecto)
        racional2(de clase)
        racional3(de copia)
    Realizar y escribir las siguientes operaciones:
        racional1+racional2
        racional2+racional3
        racional3/racional2
    En cualquier caso simplificar el racional resultante
 */
public class Racionales {

    private int numerador, denominador;

    public Racionales(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racionales(Racionales t) {
        this.numerador = t.numerador;

        this.denominador = t.denominador;
    }

    public Racionales() {
        this.numerador = 1;
        this.denominador = 2;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Racionales{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

    public static Racionales suma(Racionales num1, Racionales num2) {
        Racionales salida = new Racionales();
        salida.setNumerador(num1.getNumerador() * num2.getDenominador() + num2.getNumerador() * num1.getDenominador());
        salida.setDenominador(num1.getDenominador() * num2.getDenominador());
        return salida;
    }

    public static Racionales resta(Racionales num1, Racionales num2) {
        Racionales salida = new Racionales();
        salida.setNumerador(num1.getNumerador() * num2.getDenominador() - num2.getNumerador() * num1.getDenominador());
        salida.setDenominador(num1.getDenominador() * num2.getDenominador());
        return salida;
    }

    public static Racionales division(Racionales num1, Racionales num2) {
        Racionales salida = new Racionales();
        salida.setNumerador(num1.getNumerador() * num2.getDenominador());
        salida.setDenominador(num1.getDenominador() * num2.getNumerador());
        return salida;
    }

    public static Racionales producto(Racionales num1, Racionales num2) {
        Racionales salida = new Racionales();
        salida.setNumerador(num1.getNumerador() * num2.getNumerador());
        salida.setDenominador(num1.getDenominador() * num2.getDenominador());
        return salida;
    }

    public static Racionales simplificar(Racionales num) {
        boolean sw = false;
        for (int cont = 2; num.getDenominador() > 1 && num.getNumerador() > 1 && cont < num.getNumerador() && cont < num.getDenominador(); )
            if (num.getNumerador() % cont == 0 && num.getDenominador() % cont == 0) {
                num.setNumerador(num.getNumerador() / cont);
                num.setDenominador(num.getDenominador() / cont);
            } else
                cont++;
        return num;
    }

    public static void main(String[] args) {
        Racionales racional1 = new Racionales();
        Racionales racional2 = new Racionales(3, 4);
        Racionales racional3 = new Racionales(racional2);
        System.out.println(simplificar(suma(racional1, racional2)));
        System.out.println(simplificar(suma(racional2, racional3)));
        System.out.println(simplificar(producto(racional3, racional1)));
        System.out.println(simplificar(division(racional1, racional2)));
    }
}
