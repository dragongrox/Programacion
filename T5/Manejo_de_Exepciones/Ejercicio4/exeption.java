package T5.Manejo_de_Exepciones.Ejercicio4;

class exeption extends Exception {
    public exeption() {
        super("Se produjo un error");
    }

    public exeption(String message) {
        super(message);
    }
}
