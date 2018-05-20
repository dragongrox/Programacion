package T4.TrabajandoConExpresionesRegulares;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ej6 {
    public static boolean comprobacion(Persona persona) {
        boolean a = Pattern.matches("[A-z]+\\s?[A-z]*", persona.getNombre());
        boolean b = Pattern.matches("[A-z]+\\s?[A-z]*", persona.getApellidos());
        boolean c = Pattern.matches("[0-9]{8}[a-z]{1}", persona.getNIF());
        boolean d = Pattern.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}", persona.getFechaDeNacimiento());
        boolean e = Pattern.matches(".+[@].+[.].+", persona.getEmail());
        boolean f = Pattern.matches("[0-9]{9}", persona.getTelefonoFijo());
        boolean g = Pattern.matches("[0-9]{9}", persona.getTelefonoMovil());
        if (a & b & c & d & e & f & g)
            return true;
        else
            return false;
    }

    public static Persona introducir() {
        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona();
        boolean sw = false;
        do {
            System.out.println("Introduzca el nombre: ");
            entrada = new Scanner(System.in);
            persona.setNombre(entrada.nextLine());
            System.out.println("Introduzca los apellidos: ");
            entrada = new Scanner(System.in);
            persona.setApellidos(entrada.nextLine());
            System.out.println("Introduzca el NIF: ");
            entrada = new Scanner(System.in);
            persona.setNIF(entrada.nextLine());
            System.out.println("Introduzca la fecha de nacimiento (dd/mm/aaaa): ");
            entrada = new Scanner(System.in);
            persona.setFechaDeNacimiento(entrada.nextLine());
            System.out.println("Introduzca el email: ");
            entrada = new Scanner(System.in);
            persona.setEmail(entrada.nextLine());
            System.out.println("Introduzca el telefono fijo");
            entrada = new Scanner(System.in);
            persona.setTelefonoFijo(entrada.next());
            System.out.println("Introduzca el telefono movil");
            entrada = new Scanner(System.in);
            persona.setTelefonoMovil(entrada.next());
            sw = comprobacion(persona);
            if (!comprobacion(persona))
                System.out.println("Alguno de los datos introducidos no es valido.");
        } while (!sw);
        return persona;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList personas = new ArrayList();
        char opc = 's';
        do {
            personas.add(introducir());
            System.out.println("'n' para terminar la introduccion o cualquier otro caracter para continuar");
            opc = entrada.next().toLowerCase().charAt(0);
        } while (opc != 'n');

    }
}
