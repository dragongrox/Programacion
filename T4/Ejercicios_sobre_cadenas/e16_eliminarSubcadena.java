package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e16_eliminarSubcadena {
    public static String eliminar(String cadena, String subcadena) {
        for (int cont = 0; cont < cadena.length(); cont++) {
            for (int sub = 0; subcadena.charAt(sub) == cadena.charAt(cont) &&
                    sub < subcadena.length() &&
                    cont < cadena.length(); sub++, cont++) {
                if (sub == subcadena.length() - 1) {
                    cadena = cadena.substring(0, cont - sub) + cadena.substring(cont + sub);
                    cont = cont - sub;
                }
            }
        }
        return cadena;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la frase");
        String cadena = entrada.nextLine();
        System.out.println("Introduzca la palabra a eliminar");
        System.out.println(eliminar(cadena, entrada.nextLine()));
    }
}
