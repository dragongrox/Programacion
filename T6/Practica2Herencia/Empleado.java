package T6.Practica2Herencia;

class Empleado {
    private String nombre;

    public Empleado() {
        this.nombre = "Sergey";
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
