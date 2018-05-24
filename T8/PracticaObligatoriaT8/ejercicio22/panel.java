package T8.PracticaObligatoriaT8.ejercicio22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    JButton buttonFechas = new JButton("Introducir Fecha de Nacimiento");
    public JTextField textFieldFechaCorta = new JTextField(5);
    public JTextField textFieldFechaLarga = new JTextField(5);
    public Frame2 frame2 = null;

    public Panel() {
        JPanel jPanel = new JPanel();
        add(jPanel, BorderLayout.CENTER);
        textFieldFechaCorta.setEditable(false);
        textFieldFechaLarga.setEditable(false);
        jPanel.add(buttonFechas);
        jPanel.add(textFieldFechaCorta);
        jPanel.add(textFieldFechaLarga);
        jPanel.setLayout(new GridLayout(3, 1, 20, 20));
        Evento evento = new Evento();
        buttonFechas.addActionListener(evento);
    }

    public class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame2 = new Frame2(Panel.this, frame2);
            frame2.setVisible(true);

        }
    }
}
