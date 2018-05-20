package T5.Manejo_de_Exepciones.Ejercicio3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ej3 {
    SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
    SimpleDateFormat format = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
    Date fecha = null;

    public Date asignarFecha(String fecha) {
        try {
            if (diaValido(Integer.valueOf(fecha.substring(1, 2)), Integer.valueOf(fecha.substring(3, 4)), Integer.valueOf(fecha.substring(5))))
                return dateFormat.parse(fecha);
            else throw new exeption();
        } catch (Exception a) {
            System.out.println("No es una fecha valida");
            return null;
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String escribirFecha(int fecha) {
        this.fecha = asignarFecha(String.valueOf(fecha));
        return format.format(this.getFecha());

    }

    public String mes(int mes) {
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
        }
        return "";
    }

    private boolean biciesto(int anio) {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            return true;
        else
            return false;
    }

    private boolean diaValido(int dia, int mes, int anio) {
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
                if (dia > 0 && dia <= 29 && biciesto(anio))
                    return true;
                if (dia > 0 && dia <= 28)
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
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Introduzca la fecha para convertirla: ");
            Scanner entrada = new Scanner(System.in);
            System.out.println(new ej3().escribirFecha(entrada.nextInt()));
        } catch (Exception e) {
            System.out.println("No es una fecha valida.");
        }
    }
}
