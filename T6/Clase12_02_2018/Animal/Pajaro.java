package T6.Clase12_02_2018.Animal;

public class Pajaro implements Animal {
    @Override
    public String comida() {
        return "Homnivoro";
    }

    @Override
    public String desplazamiento() {
        return "Aereo";
    }

    @Override
    public String sonido() {
        return "Canturreo";
    }
}
