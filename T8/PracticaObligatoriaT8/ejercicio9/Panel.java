package T8.PracticaObligatoriaT8.ejercicio9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Panel extends JPanel {
    JButton b1 = new JButton("Azul");
    JButton b2 = new JButton("Amarillo");
    JButton b3 = new JButton("Rojo");
    JButton b4 = new JButton("Verde");

    public Panel() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 2, 10, 20));
        jPanel.add(b1);
        jPanel.add(b2);
        jPanel.add(b3);
        jPanel.add(b4);
        add(jPanel, BorderLayout.NORTH);
        ColorFondo Azul = new ColorFondo(Color.BLUE);
        ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo Rojo = new ColorFondo(Color.RED);
        ColorFondo Verde = new ColorFondo(Color.GREEN);
        b1.addActionListener(Azul);
        b2.addActionListener(Amarillo);
        b3.addActionListener(Rojo);
        b4.addActionListener(Verde);
    }

    private class ColorFondo implements ActionListener {
        public ColorFondo(Color c) {
            colorDeFonndo = c;
        }

        public void actionPerformed(ActionEvent e) {
            JButton botonPulsado = (JButton) e.getSource();
            botonPulsado.setBackground(colorDeFonndo);
        }

        private Color colorDeFonndo;
    }
}
