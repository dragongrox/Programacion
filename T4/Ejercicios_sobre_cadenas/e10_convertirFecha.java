package T4.Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class e10_convertirFecha {
    public static boolean fechaCorrecta(String fecha) {
        int anio = Integer.valueOf(fecha.substring(6, 10)), mes = Integer.valueOf(fecha.substring(3, 5)), dia = Integer.valueOf(fecha.substring(0, 2));
        boolean swBis = false;
        if (anio >= 0) { //comprobamos la validez del año
            if (((anio % 4) == 0) && ((anio % 100) != 0 || (anio % 400) == 0)) //comprobamos si el año es biciesto
                swBis = true;
            if (mes > 0 && mes <= 12)
                switch (mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (dia > 0 && dia <= 31)
                            return true;
                        else
                            return false;
                    case 2:
                        if ((dia > 0 && dia <= 28) || (dia > 0 && dia <= 29 && swBis == true))
                            return true;
                        else
                            return false;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dia > 0 && dia <= 30)
                            return true;
                        else
                            return false;
                }
            else
                return false;
        } else
            return false;
        return false;
    }

    public static String convertirFecha(String fecha) {
        String ret = "" + fecha.substring(0, 2) + " de ";
        if (fechaCorrecta(fecha)) {
            int mes = Integer.valueOf(fecha.substring(3, 5));
            switch (mes) {
                case 1:
                    ret += "Enero";
                    break;
                case 2:
                    ret += "Febrero";
                    break;
                case 3:
                    ret += "Marzo";
                    break;
                case 4:
                    ret += "Abril";
                    break;
                case 5:
                    ret += "Mayo";
                    break;
                case 6:
                    ret += "Junio";
                    break;
                case 7:
                    ret += "Julio";
                    break;
                case 8:
                    ret += "Agosto";
                    break;
                case 9:
                    ret += "Septiembre";
                    break;
                case 10:
                    ret += "Octubre";
                    break;
                case 11:
                    ret += "Noviembre";
                    break;
                case 12:
                    ret += "Diciembre";
                    break;
            }
            return ret + " de " + fecha.substring(6, 10);
        } else
            return "No es una fecha valida.";
    }

    public static void main(String[] args) {
        System.out.println("Introduzca la fecha en formato DD:MM:AAAA: ");
        Scanner entrada = new Scanner(System.in);
        String fecha = entrada.next();
        System.out.println("La fecha transformada es " + convertirFecha(fecha));
    }


}
