package T6.EjerciciosErencia.Ej2;

public class Programador extends Empleado {
    int lineasDeCodigoPorHora;
    String lenguajeDominante;

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador() throws Exception {
        nombre = "Juan";
        cedula = "12345678s";
        edad = 18;
        casado = false;
        salario = 1200;
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }


}
