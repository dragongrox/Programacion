package T6.Clase12_02_2018.Animal;

public class Perro implements Animal {
    @Override
    public String comida() {
        return "Homnivoro";
    }

    @Override
    public String desplazamiento() {
        return "terrestre";
    }

    @Override
    public String sonido() {
        return "Guau!!";
    }
}
