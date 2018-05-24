package T8.PracticaObligatoriaT8.ejercicio20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelPizza extends JPanel {
    JComboBox comboBoxTipoPiza = new JComboBox();
    JButton buttonIngredientes = new JButton("Añadir Ingrediente");
    JButton buttonQuitar = new JButton("Quitar Ingrediente");
    JLabel labelPrecio = new JLabel(0 + " €");
    PanelPizza panelPizza;
    ArrayList<ComboIngredientes> arrayList = new ArrayList<ComboIngredientes>();

    public PanelPizza() {
        panelPizza = this;
        this.setLayout(new GridLayout(1, 3, 10, 20));
        JPanel panel1 = new JPanel();
        comboBoxTipoPiza.addItem("Pequeña");
        comboBoxTipoPiza.addItem("Mediana");
        comboBoxTipoPiza.addItem("Familiar");
        add(comboBoxTipoPiza);
        add(buttonIngredientes);
        add(buttonQuitar);
        add(labelPrecio);
        Evento evento = new Evento();
        buttonIngredientes.addActionListener(evento);
        buttonQuitar.addActionListener(evento);
        comboBoxTipoPiza.addActionListener(evento);
    }

    public void CalcularPrecio() {
        float p = 5.5f, m = 9f, f = 14f, precio = 0;

        switch (comboBoxTipoPiza.getSelectedIndex()) {
            case 0:
                precio = p;
                break;
            case 1:
                precio = m;
                break;
            case 2:
                precio = f;
        }
        if (arrayList.size() > 2) {
            precio += 0.50f * (arrayList.size() - 3);
        }
        precio = precio * 1.21f;
        labelPrecio.setText(precio + " €");
    }

    class Evento implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();
            if (botonPulsado == buttonIngredientes) {
                ComboIngredientes comboIngredientes = new ComboIngredientes();
                arrayList.add(comboIngredientes);
                panelPizza.add(comboIngredientes);
                panelPizza.CalcularPrecio();
                panelPizza.revalidate();
                panelPizza.repaint();

            } else if (botonPulsado == buttonQuitar && arrayList.size() > 0) {
                panelPizza.remove(arrayList.get(arrayList.size() - 1));
                arrayList.remove(arrayList.size() - 1);
                panelPizza.CalcularPrecio();
                panelPizza.revalidate();
                panelPizza.repaint();
            } else if (botonPulsado == comboBoxTipoPiza) {
                panelPizza.CalcularPrecio();
                panelPizza.revalidate();
                panelPizza.repaint();
            }
        }

    }
}
