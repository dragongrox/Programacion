package T5.Manejo_de_Exepciones;

class exeption extends Exception {
    public exeption() {
        super("Los numeros no son validos.");
    }

    public exeption(String message) {
        super(message);
    }
}
