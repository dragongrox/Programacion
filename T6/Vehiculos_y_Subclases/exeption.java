package T6.Vehiculos_y_Subclases;

public class exeption extends Exception {
    public exeption() {
        super("Los valores proporcionados no son validos.");
    }

    public exeption(String message) {
        super(message);
    }
}
