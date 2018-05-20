package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e15_multiplicacionCadena {
    public static String convertir(String cad) {
        String ret = "";
        int aux = 0;
        for (; ',' != cad.charAt(aux); aux++) ;
        for (int cont = Integer.valueOf(cad.charAt(cad.length() - 1)) - 48; cont > 0; cont--) {
            ret += cad.substring(0, aux) + " ";
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la sentencia: ");
        System.out.println(convertir(entrada.nextLine()));
    }
}
