package T4.PracticaArrayListYVector;

/**
 * @Author Sergey Shevchenko
 */
/*
programa pide por teclado los datos de los coches y los almacena en memoria.
Los datos a introducir son:
•matrícula
•marca
•modelo
•tipo de combustible
•Km
Queremos conocer:
a)Información sobre todos los coches que se han introducido.
b)Todos los coches de una marca determinada,escribiremos la información de estos coches y el número total de coches.
c)Todos los coches con menos de un número determinado de Kilómetros, escribiremos la información de estos coches y
  el número total de coches.
d)El coche ocoches con mayor número de Kilómetros.Escribiremos la matriculamarcay modelo de los que cumplen esta condición.
e)Dado un tipo de combustible, todos los coches que consumen dicho combustible(información delvehículoy número de vehículos)
f)Todos los coches ordenados por número dekilómetros de menor a mayor.
 */
public class Coche {
    String matricula, marca, modelo, tipoDeCombustible;
    int km;

    public Coche() {
        this.matricula = "xhz4567";
        this.marca = "citroen";
        this.modelo = "c4";
        this.tipoDeCombustible = "diesel";
        this.km = 34567;
    }

    public Coche(Coche t) {
        this.matricula = t.matricula;
        this.marca = t.marca;
        this.modelo = t.modelo;
        this.tipoDeCombustible = t.tipoDeCombustible;
        this.km = t.km;
    }

    public Coche(String matricula, String marca, String modelo, String tipoDeCombustible, int km) {
        this.matricula = matricula.toLowerCase();
        this.marca = marca.toLowerCase();
        this.modelo = modelo.toLowerCase();
        this.tipoDeCombustible = tipoDeCombustible.toLowerCase();
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoDeCombustible='" + tipoDeCombustible + '\'' +
                ", km=" + km +
                '}';
    }
}
