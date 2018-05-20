package T4.TrabajandoConExpresionesRegulares;

/**
 * @Author Sergey Shevchenko
 */
/*
•Nombrecadena de caracteres.
•Apellidoscadena de caracteres
•NIF 8 digito y una letra
•Fecha de nacimientoen el formato dd/mm/aaaa
•Email con formato adecuado
•Teléfono fijo
•Teléfonomóvil
 */
public class Persona {
    String nombre, apellidos, NIF, fechaDeNacimiento, email, telefonoFijo, telefonoMovil;

    public Persona(String nombre, String apellidos, String NIF, String fechaDeNacimiento, String email, String telefonoFijo, String telefonoMovil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
    }

    public Persona() {
        this.nombre = "Sergey";
        this.apellidos = "Shevchenko";
        this.NIF = "12345678x";
        this.fechaDeNacimiento = "15/02/1996";
        this.email = "dragongrox7@gmail.com";
        this.telefonoFijo = "987654321";
        this.telefonoMovil = "987456321";
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

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", NIF='" + NIF + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", email='" + email + '\'' +
                ", telefonoFijo='" + telefonoFijo + '\'' +
                ", telefonoMovil='" + telefonoMovil + '\'' +
                '}';
    }
}
