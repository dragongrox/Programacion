package T8.PracticaObligatoriaT8.ejercicio22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class panel2 extends JPanel {
    JLabel label = new JLabel(" / ");
    JLabel label2 = new JLabel(" / ");
    JTextField textFieldDia = new JTextField(5);
    JTextField textFieldMes = new JTextField(5);
    JTextField textFieldAnio = new JTextField(5);
    JButton buttonAceptar = new JButton("Aceptar");
    JButton buttonCancelar = new JButton("Cancelar");

    panel panel = null;

    public panel2(panel panel) {
        JPanel panel3 = new JPanel();
        JPanel panel1 = new JPanel();
        add(panel3, BorderLayout.NORTH);
        panel1.add(textFieldDia);
        panel1.add(label);
        panel1.add(textFieldMes);
        panel1.add(label2);
        panel1.add(textFieldAnio);
        JPanel panel2 = new JPanel();
        panel2.add(buttonAceptar);
        panel2.add(buttonCancelar);
        panel3.setLayout(new GridLayout(2, 1, 20, 20));
        panel3.add(panel1);
        panel3.add(panel2);
        Evento evento = new Evento();
        buttonAceptar.addActionListener(evento);
        buttonCancelar.addActionListener(evento);
        this.panel = panel;
    }

    private class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();
            if (botonPulsado == buttonAceptar) {
                String text = textFieldDia.getText() + "/" +
                        textFieldMes.getText() + "/" + textFieldAnio.getText();
                panel.rellenarFechaCorta(text);
                panel.cerrarFrame2();
            } else {
                limpiarTexto();
            }
        }
    }

    private void limpiarTexto() {
        textFieldDia.setText(null);
        textFieldMes.setText(null);
        textFieldAnio.setText(null);
    }

}
