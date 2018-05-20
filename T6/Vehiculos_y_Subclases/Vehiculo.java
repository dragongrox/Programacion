package T6.Vehiculos_y_Subclases;

public abstract class Vehiculo<T> {
    String matricula;
    boolean alquilado;

    public Vehiculo(String matricula, boolean alquilado) {
        this.matricula = matricula;
        this.alquilado = alquilado;
    }

    public Vehiculo() {
        matricula = "35254x";
        alquilado = false;
    }

    abstract String showInfo();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
}
