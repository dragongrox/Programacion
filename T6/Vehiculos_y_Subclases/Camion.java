package T6.Vehiculos_y_Subclases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Camion extends Vehiculo {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
    double precioDia;
    Date diaAlquiler = null, diaDevolucion = null;
    static int numCamiones = 0, numCamAlquilados = 0;

    public Date asignarFecha(String fecha) {
        try {
            return dateFormat.parse(fecha);
        } catch (ParseException a) {
            System.out.println("No es una fecha valida");
            return asignarFecha(fecha);
        }
    }

    public Camion(String matricula, boolean alquilado, double precioDia) {
        this.matricula = matricula;
        this.alquilado = alquilado;
        this.precioDia = precioDia;

        diaAlquiler = asignarFecha("01/01/1999");
        diaDevolucion = asignarFecha("01/01/1999");
        numCamiones++;
    }

    public Camion() {
        matricula = "35254x";
        alquilado = false;
        precioDia = 4d;
        diaAlquiler = asignarFecha("01/01/1999");
        diaDevolucion = asignarFecha("01/01/1999");
    }

    public Camion(Camion a) {
        this.matricula = a.matricula;
        this.precioDia = a.precioDia;
        this.diaAlquiler = a.diaAlquiler;
        this.diaDevolucion = a.diaDevolucion;
    }

    void alquilar(Date diaAlquiler) {
        setAlquilado(true);
        numCamAlquilados++;
        this.diaAlquiler = diaAlquiler;
        System.out.println("Se ha alquilando un camion.");
    }

    void devolver(Date diaDevolucion) throws exeption {
        if (diaDevolucion.after(diaAlquiler)) {
            this.diaDevolucion = diaDevolucion;
            setAlquilado(false);
            System.out.println("Se ha devuelto el camion"
                    + "\nEl coste del alquiler es de " +
                    (((diaDevolucion.getTime() - diaAlquiler.getTime()) / 86400000 * precioDia)));
        } else throw new exeption();
    }

    @Override
    String showInfo() {
        return "El camion con la matricula " + matricula + (isAlquilado() ? " esta alquilado" : " no esta alquilado") +
                "\nPrecio por dia --> " + precioDia +
                "\nNumero total de camiones --> " + numCamiones +
                "\nNumero total de camiones alquilados -->" + numCamAlquilados;
    }


}
