package T8.PracticaObligatoriaT8.ejercicio6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Panel extends JPanel {
    JTextField campo1, campo2;
    JButton button1, button2;
    JLabel resultado;

    public Panel() {
        setLayout(new BorderLayout());

        JPanel lamina = new JPanel();
        lamina.setLayout(new GridLayout(3, 2));

        campo1 = new JTextField(10);
        campo2 = new JTextField(10);

        lamina.add(campo1);
        lamina.add(campo2);

        button1 = new JButton("Sumar");
        button2 = new JButton("Restar");

        lamina.add(button1);
        lamina.add(button2);

        resultado = new JLabel("Resultado");

        lamina.add(resultado);

        add(lamina, BorderLayout.CENTER);

        Evento mievento = new Evento();
        button1.addActionListener(mievento);
        button2.addActionListener(mievento);
    }

    private class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();
            try {
                if (botonPulsado == button1) {
                    resultado.setText((Integer.valueOf(campo1.getText()) + Integer.valueOf(campo2.getText())) + "");
                } else if (botonPulsado == button2) {
                    resultado.setText((Integer.valueOf(campo1.getText()) - Integer.valueOf(campo2.getText())) + "");
                }
            } catch (Exception a) {
                resultado.setText("Se produjo un error: " + a.getLocalizedMessage());
            }
        }
    }
}
