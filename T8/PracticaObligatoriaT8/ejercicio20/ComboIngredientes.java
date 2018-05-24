package T8.PracticaObligatoriaT8.ejercicio20;

import javax.swing.*;

public class ComboIngredientes extends JComboBox {

    public ComboIngredientes() {
        InicializeComboBox();
    }

    public void InicializeComboBox() {
        String[] ingedientes = {"Queso", "Champiñon", "Cebolla", "Bacon", "Pimiento", "Pollo", "Anchoas", "Piña", "Miel"};
        for (String elemento : ingedientes) {
            this.addItem(elemento);
        }
    }
}
