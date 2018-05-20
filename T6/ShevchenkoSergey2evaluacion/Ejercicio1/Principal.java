package T6.ShevchenkoSergey2evaluacion.Ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal extends Racional implements Racional.Operable {
    Racional contenedor[];

    public String mostrar(Racional[] contenedor) {
        String ret = "";
        for (int cont = 0; cont < contenedor.length; cont++) {
            ret = ret + contenedor[cont].toString() + "\n";
        }
        return ret;
    }

    @Override
    public int suma() {
        return this.numerador + this.denominador;
    }

    @Override
    public int resta() {
        if (this.numerador > this.denominador)
            return this.numerador - this.denominador;
        else
            return this.denominador - this.numerador;
    }

    @Override
    public int multiplica() {
        return this.numerador * this.denominador * constante;
    }

    @Override
    public int resto() {
        return numerador % constante;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        do {
            System.out.println("Introduzca el tamaño del array: ");
            entrada = new Scanner(System.in);
            try {
                num = entrada.nextInt();
            } catch (Exception a) {
                System.out.println("No es un valor valido");
                num = 0;
            }
            if (num < 1) {
                System.out.println("No es un numero valido.");
            }
        } while (num < 1);
        Racional[] contenedor = new Racional[num];
        for (int cont = 0; cont < contenedor.length; cont++) {
            contenedor[cont] = new Racional(0, 0);
            do {
                try {
                    System.out.println("Introduzca el numerador: ");
                    entrada = new Scanner(System.in);
                    contenedor[cont].numerador = entrada.nextInt();
                    System.out.println("Introduzca el denominador: ");
                    entrada = new Scanner(System.in);
                    contenedor[cont].denominador = entrada.nextInt();
                } catch (Exception a) {
                    System.out.println("alguno de los valores no son validos.");
                    contenedor[cont].denominador = 0;
                }
                if (contenedor[cont].denominador == 0)
                    System.out.println("No es un valor valido.");
            } while (contenedor[cont].denominador == 0);
        }
        Principal principal = new Principal();
        System.out.println("El Array se ha rellenado con los siguientes numeros: \n" + principal.mostrar(contenedor));
        for (int cont = 0; cont < contenedor.length; cont++) {
            principal.numerador = contenedor[cont].numerador;
            principal.denominador = contenedor[cont].denominador;
            System.out.println("Se van a realizar operaciones con el racional: " + principal.toString());
            System.out.println("Suma()=" + principal.suma());
            System.out.println("Resta()=" + principal.resta());
            System.out.println("Multiplica()=" + principal.multiplica());
            System.out.println("Resto()=" + principal.resto());
        }

    }
}
