package T6.EjerciciosErencia.Ej2;

public class Empleado {
    String nombre, cedula;
    int edad;
    boolean casado;
    double salario;

    public Empleado() {
        this.nombre = "Juan";
        this.cedula = "14672354d";
        this.edad = 18;
        this.casado = false;
        this.salario = 1200;
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) throws Exception {
        if (edad < 18 || edad > 45)
            throw new Exception("No es una edad valida.");
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String Clasificacion() {
        if (edad <= 21)
            return "Principiante";
        else if (edad >= 22 & edad <= 35)
            return "Intermedio";
        if (edad > 35)
            return "Senior";
        return null;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\n" +
                ", cedula=" + cedula + "\n" +
                ", edad=" + edad + "\n" +
                ", casado=" + casado + "\n" +
                ", salario=" + salario + "\n";
    }

    public void aumentarSalario(float porcentaje) {
        salario = salario + salario * porcentaje / 100;
        System.out.println("El nuevo salario es de " + salario);
    }
}
