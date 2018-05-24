package T8.PracticaObligatoriaT8.ejercicio20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PanelPizza extends JPanel {
    JComboBox comboBoxTipoPiza = new JComboBox();
    JButton buttonIngredientes = new JButton("Añadir Ingrediente");
    JButton buttonQuitar = new JButton("Quitar Ingrediente");
    JLabel labelPrecio = new JLabel(0 + " €");
    PanelPizza panelPizza;
    ArrayList<ComboIngredientes> arrayList = new ArrayList<ComboIngredientes>();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    Frame frame = null;

    public PanelPizza(Frame frame) {
        panelPizza = this;
        this.frame = frame;
        this.setLayout(new GridLayout(3, 1, 10, 20));
        add(panel1);
        add(panel2);
        add(panel3);
        comboBoxTipoPiza.addItem("Pequeña");
        comboBoxTipoPiza.addItem("Mediana");
        comboBoxTipoPiza.addItem("Familiar");
        panel1.add(comboBoxTipoPiza);
        panel1.add(buttonIngredientes);
        panel1.add(buttonQuitar);
        panel3.add(labelPrecio);
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
        DecimalFormat df = new DecimalFormat("###.##");
        labelPrecio.setText(df.format(precio) + " €");
    }

    class Evento implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();
            if (botonPulsado == buttonIngredientes) {
                ComboIngredientes comboIngredientes = new ComboIngredientes();
                arrayList.add(comboIngredientes);
                panel2.add(comboIngredientes);
                panelPizza.CalcularPrecio();
                panelPizza.revalidate();
                panelPizza.repaint();
                frame.pack();
            } else if (botonPulsado == buttonQuitar && arrayList.size() > 0) {
                panel2.remove(arrayList.get(arrayList.size() - 1));
                arrayList.remove(arrayList.size() - 1);
                panelPizza.CalcularPrecio();
                panelPizza.revalidate();
                panelPizza.repaint();
                frame.pack();
            } else if (botonPulsado == comboBoxTipoPiza) {
                panelPizza.CalcularPrecio();
                panelPizza.revalidate();
                panelPizza.repaint();
            }
        }

    }
}
