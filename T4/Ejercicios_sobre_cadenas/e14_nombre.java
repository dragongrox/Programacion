package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e14_nombre {
    public static String cambiarNombre(String nombre) {
        String ret = "";
        for (int cont = nombre.length() - 1, aux = 0, c = 0; cont >= 0; cont--) {
            c++;
            if (' ' == nombre.charAt(cont)) {
                ret += nombre.substring(cont + 1, cont + c);
                c = 0;
                if (' ' != ret.charAt(ret.length() - 1))
                    ret += " ";
            }
            if (cont == 0)
                ret += nombre.substring(cont, cont + c);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println("Introduzca su nombre: ");
        Scanner entrada = new Scanner(System.in);
        System.out.println(cambiarNombre(entrada.nextLine()));
    }
}
