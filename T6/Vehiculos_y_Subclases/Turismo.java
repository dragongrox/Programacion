package T6.Vehiculos_y_Subclases;

public class Turismo extends Vehiculo {

    double precioKm;
    int kmAlquiler;
    int kmDevolucion;
    static int numTurismo = 0, numTurAlquilados = 0;

    public Turismo(String matricula, boolean alquilado, double precioKm) {
        this.matricula = matricula;
        this.alquilado = alquilado;
        this.precioKm = precioKm;
        this.kmAlquiler = 0;
        this.kmDevolucion = 0;
        numTurismo++;
    }

    public Turismo() {
        this.precioKm = 4;
        this.kmAlquiler = 0;
        this.kmDevolucion = 0;
    }

    public Turismo(Turismo t) {
        this.matricula = t.matricula;
        this.alquilado = t.alquilado;
        this.precioKm = t.precioKm;
        this.kmAlquiler = t.kmAlquiler;
        this.kmDevolucion = t.kmDevolucion;
    }

    void alquilar(int kmAlquiler) {
        setAlquilado(true);
        this.kmAlquiler = kmAlquiler;
        numTurAlquilados++;
        System.out.println("Se ha alquilando un turismo.");
    }

    void devolver(int kmDevolucion) throws exeption {
        if (kmAlquiler < kmDevolucion) {
            setAlquilado(false);
            this.kmDevolucion = kmDevolucion;
            System.out.println("Se ha devuelto el camion"
                    + "\nEl coste del alquiler es de " +
                    ((kmDevolucion - kmAlquiler) * precioKm));
        } else throw new exeption();
    }

    @Override
    String showInfo() {
        return "El turismo con la matricula " + matricula + (isAlquilado() ? " esta alquilado" : " no esta alquilado") +
                "\nPrecio por km --> " + precioKm +
                "\nNumero total de turismos --> " + numTurismo +
                "\nNumero total de turismos alquilados -->" + numTurAlquilados;
    }
}
