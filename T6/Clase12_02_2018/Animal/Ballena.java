package T6.Clase12_02_2018.Animal;

public class Ballena implements Animal {
    @Override
    public String comida() {
        return "Plancton";
    }

    @Override
    public String desplazamiento() {
        return "Acuatico";
    }

    @Override
    public String sonido() {
        return "Canto de ballena";
    }
}
