package T3.ExamenPT.EJERCICIO2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AparatoElectrico {
    static int consumo = 0, potencia = 1000;
    int consumoPropio;
    Estado estado;

    public AparatoElectrico() {
        this.estado = Estado.APAGADO;
        consumoPropio = 50;
    }

    public AparatoElectrico(int consumo) {
        this.estado = Estado.APAGADO;
        consumoPropio = consumo;
    }

    public void setEstado(Boolean estado) {
        if (estado == true && getEstado() == Estado.APAGADO) {
            this.estado = Estado.ENCENDIDO;
            if (potencia - consumoPropio > 0) {
                potencia = potencia - consumoPropio;
                consumo = consumo + consumoPropio;
            } else {
                this.estado = Estado.APAGADO;
                System.out.println("Falta potencia");
            }
        } else if (estado = false && this.getEstado() == Estado.ENCENDIDO) {
            this.estado = Estado.APAGADO;
            potencia = potencia + consumoPropio;
            consumo = consumo - consumoPropio;
        }

    }

    public Estado getEstado() {
        return this.estado;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        if (potencia - consumo > 0 && getEstado() == Estado.ENCENDIDO) {
            potencia = potencia - consumo;
        } else {
            System.out.println("Falta potencia");

        }
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return "Instalacion Electrica{" +
                "consumo=" + consumo +
                ", potencia=" + potencia +
                '}';
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AparatoElectrico ap1 = new AparatoElectrico();
        System.out.println("Introduzca la potencia del aparato 2");
        AparatoElectrico ap2 = new AparatoElectrico(entrada.nextInt());
        System.out.println("Introduzca la potencia del aparato 3");
        AparatoElectrico ap3 = new AparatoElectrico(entrada.nextInt());
        System.out.println(ap3.toString());
        int menu = 1;
        do {
            System.out.println("Elija el aparato que quiere encender o apagar(1,2 o 3)(4 para salir)");
            menu = entrada.nextInt();
            System.out.println("Introduzca el estado(True=Encendido, False=Apagado)");
            switch (menu) {
                case 1:
                    ap1.setEstado(entrada.nextBoolean());
                    break;
                case 2:
                    ap2.setEstado(entrada.nextBoolean());
                    break;
                case 3:
                    ap3.setEstado(entrada.nextBoolean());
                    break;
            }
            System.out.println(ap1.toString());
        } while (menu != 4);
    }
}
