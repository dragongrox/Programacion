package T8.PracticaObligatoriaT8.ejercicio22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class panel extends JPanel {
    JButton buttonFechas = new JButton("Introducir Fecha de Nacimiento");
    public JTextField textFieldFechaCorta = new JTextField(5);
    public JTextField textFieldFechaLarga = new JTextField(5);
    private Frame2 frame2;

    public panel() {
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
        frame2 = new Frame2(this);
    }

    public void setTextFieldFechaCorta(String text) {
        textFieldFechaCorta.setText(text);
    }

    public void rellenarFechaCorta(String fecha) {
        textFieldFechaCorta.setText(fecha);
    }

    public void rellenarFechaLarga(String fecha) {

    }

    public void cerrarFrame2() {
        frame2.dispose();
    }

    public class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame2.setVisible(true);

        }
    }
}
