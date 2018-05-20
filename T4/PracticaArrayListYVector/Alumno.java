package T4.PracticaArrayListYVector;

/**
 * @Author Sergey Shevchenko
 */
/*
Se necesita implementar un sistema en el que se puedancargar alumnos,
a los cuales los caracterizan el nombre y apellido, el DNI, el sexo,
condición (Presencial o semipresencial) y la notafinal.
 */
public class Alumno {
    String nombre, apellidos, DNI, sexo, condición;
    int notaFinal;

    public Alumno() {
        nombre = "Sergey";
        apellidos = "Shevchenko";
        this.DNI = "y0240287c";
        this.sexo = "h";
        this.condición = "presencial";
        this.notaFinal = 10;
    }

    public Alumno(Alumno t) {
        nombre = t.nombre;
        apellidos = t.apellidos;
        this.DNI = t.DNI;
        this.sexo = t.sexo;
        this.condición = t.condición;
        this.notaFinal = t.notaFinal;
    }

    public Alumno(String nombre, String apellidos, String DNI, String sexo, String condición, int notaFinal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI.toLowerCase();
        this.sexo = sexo.toLowerCase();
        this.condición = condición.toLowerCase();
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondición() {
        return condición;
    }

    public void setCondición(String condición) {
        this.condición = condición;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return " Nombre " + nombre +
                ", Apellidos " + apellidos +
                ", DNI " + DNI +
                ", Sexo " + sexo +
                ", Condición " + condición +
                ", Nota Final " + notaFinal + "\n";
    }
}
