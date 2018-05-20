package T5.Clase07_02_2018;

public class exepcionRange extends Exception {
    public exepcionRange() {
        super("El numero no se encuentra en el rango.");
    }

    public exepcionRange(String mensaje) {
        super(mensaje);
    }

}
