package T5.Manejo_de_Exepciones.Ejercicio5;

import java.util.Scanner;

/**
 * Crear una clase que llamaremos Silo con los atributos nivel y MAX_NIVEL
 * (constante) y todos los métodos que creas necesarios para su
 * tratamiento. Entre ellos debemos incluir los métodos:
 * • llenaSilo(double):voidque añade al silo la cantidad especificada de
 * grano.
 * • vaciaSilo(double):void que quita del silo la cantidad especificada de
 * grano.
 * Controlar todas las posibles excepciones tanto estándar como aquellas no
 * controladas por Java.
 * Escribir un programa main para probar el programa y el funcionamiento y
 * tratamiento de excepciones
 */
public class Silo {
    double nivel;
    final double MAX_NIVEL = 100d;

    public Silo(double nivel) throws exeption {
        if (nivel <= MAX_NIVEL) {
            this.nivel = nivel;
        } else throw new exeption("Es mayor que el maximo del silo");
    }

    public void llenaSilo(double cantidad) {
        try {
            if (nivel + cantidad <= MAX_NIVEL) {
                nivel = nivel + cantidad;
            } else throw new exeption("La cantidad resultante exede la capacidad del silo (Añada menos cantidad)");
        } catch (Exception e) {
            System.out.println("No es una cantidad valida");
        }
    }

    public void vaciaSilo(double cantidad) {
        try {
            if (nivel - cantidad >= 0) {
                nivel = nivel - cantidad;
            } else throw new exeption("No hay suficiente cantidad en el silo para realizar esta accion");
        } catch (Exception e) {
            System.out.println("No es una cantidad valida");
        }
    }

    @Override
    public String toString() {
        return "Silo{" +
                "nivel=" + nivel +
                '}';
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Silo silo = null;
        do {
            try {
                System.out.println("Introduzca la cantidad inicial del silo (Max 100):");
                silo = new Silo(entrada.nextDouble());
            } catch (Exception e) {
                System.out.println("No es una cantidad valida");
            }
        } while (silo == null);

        int opc = 0;
        do {
            System.out.println("0.Mostrar\n" +
                    "1.Añadir\n" +
                    "2.Quitar\n" +
                    "3.Salir\n");
            opc = entrada.nextInt();
            switch (opc) {
                case 0:
                    System.out.println(silo.toString());
                    break;
                case 1:
                    System.out.println("Introduzca la cantidad a añadir: ");
                    silo.llenaSilo(entrada.nextInt());
                    break;
                case 2:
                    System.out.println("Introduzca la cantidad a quitar: ");
                    silo.vaciaSilo(entrada.nextInt());
                    break;
                case 3:
                    System.out.println("Cerrando el programa...");
                default:
                    System.out.println("No es una opcion valida.");
            }

        } while (opc != 3);

    }
}
