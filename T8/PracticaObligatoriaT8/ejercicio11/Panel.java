package T8.PracticaObligatoriaT8.ejercicio11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Panel extends JPanel {
    JLabel label1 = new JLabel("Boton 1:0 veces");
    JLabel label2 = new JLabel("Boton 2:0 veces");
    JButton button1 = new JButton("Boton 1");
    JButton button2 = new JButton("Boton 2");
    int cont1 = 0, cont2 = 0;

    public Panel() {
        JPanel jPanel1 = new JPanel();
        jPanel1.add(label1);
        jPanel1.add(label2);
        jPanel1.add(button1);
        jPanel1.add(button2);
        jPanel1.setLayout(new GridLayout(2, 1));
        add(jPanel1, BorderLayout.NORTH);
        Evento evento = new Evento();
        button1.addActionListener(evento);
        button2.addActionListener(evento);
    }

    private class Evento implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();
            if (botonPulsado == button1) {
                cont1++;
                label1.setText("Boton 1:" + cont1 + " veces");
            } else {
                cont2++;
                label2.setText("Boton 2:" + cont2 + " veces");
            }
        }
    }
}
