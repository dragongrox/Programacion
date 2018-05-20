package T3.ShevchenkoSergeyP03.Ejercicio03;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Crea una clase NIF que se usará para mantener DNIs con su correspondiente letra. Los
atributos serán el número de DNI (entero largo) y la letra que le corresponde. La clase
dispondrá de los siguientes métodos:
 Constructor predeterminado que inicialice el nº de DNI a 0 y la letra a espacio
en blanco (será un NIF no válido).
 Constructor que reciba el DNI y establezca la letra que le corresponde.
 Accedentes y mutador para el número de DNI (que ajuste automáticamente la
letra).
 leer(): que pida el número de DNI (ajustando automáticamente la letra)
 Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en
mayúscula; por ejemplo: 00395469-F)
 La letra se calculará con un método auxiliar (privado) de la siguiente forma: se
obtiene el resto de la división entera del número de DNI entre 23 y se usa la
siguiente tabla para obtener la letra que corresponde:
0 - T 1 - R 2 - W 3 - A 4 - G 5 - M 6 – Y 7 - F 8 - P 9 - D 10 - X 11 - B 12 - N 13 – J 14 - Z 15 -
S 16 - Q 17 - V 18 - H 19 - L 20 – C 21 - K 22 – E
 */
public class NIF {
    int numero;
    char letra;

    public NIF() {
        this.numero = 0;
        this.letra = ' ';
    }

    public NIF(int numero) {
        this.numero = numero;
        this.calcularLetra();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void leer(int num) {
        setNumero(num);
        this.calcularLetra();
    }

    @Override
    public String toString() {
        return String.format("%08d", numero) + "-" + letra;
    }

    private void calcularLetra() {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        this.letra = letra.charAt(numero % 23);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por defecto el dni es ");
        NIF porDefecto = new NIF();
        System.out.println(porDefecto + "\n Introduzca el numero de dni ");
        int num = 0;
        do {
            num = entrada.nextInt();
            if (num <= 0 || num > 99999999)
                System.out.println("No es un numero valido");
        } while (num <= 0 || num > 99999999);
        NIF dni = new NIF(num);
        System.out.println("El numero introduciod correspode al DNI " + dni);
        System.out.println("Introduzca otro numero.");
        do {
            num = entrada.nextInt();
            if (num <= 0 || num > 99999999)
                System.out.println("No es un numero valido");
        } while (num <= 0 || num > 99999999);
        dni.leer(num);
        System.out.println("El numero introduciod correspode al DNI " + dni);
    }

}
