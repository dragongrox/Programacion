package T8.PracticaObligatoriaT8.ejercicio25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

class Panel extends JPanel {

    JComboBox jComboBox = new JComboBox();
    JTextField textField = new JTextField(10);
    JButton buttonAceptar = new JButton("Aceptar");
    JTextArea textAreaSolucion = new JTextArea("Equivalente");

    JButton buttonEuros = new JButton("Euros");
    JButton buttonYenes = new JButton("Yenes");
    JButton buttonDolares = new JButton("Dolares");
    JButton buttonLibras = new JButton("Libras");

    int convertirA = 0;

    Frame frame = null;

    public Panel(Frame frame) {
        JPanel panelInterno1 = new JPanel();
        this.frame = frame;
        jComboBox.addItem("Euros");
        jComboBox.addItem("Yenes");
        jComboBox.addItem("Dolares");
        jComboBox.addItem("Libras");
        panelInterno1.add(new JLabel("Moneda Origen"));
        panelInterno1.add(jComboBox);
        panelInterno1.add(textField);
        panelInterno1.add(buttonAceptar);

        add(panelInterno1, BorderLayout.NORTH);

        JPanel panelInterior2 = new JPanel();
        panelInterior2.add(buttonEuros);
        panelInterior2.add(buttonYenes);
        panelInterior2.add(buttonDolares);
        panelInterior2.add(buttonLibras);
        add(panelInterior2, BorderLayout.CENTER);
        add(textAreaSolucion);
        Evento evento = new Evento();
        buttonAceptar.addActionListener(evento);
        buttonEuros.addActionListener(evento);
        buttonYenes.addActionListener(evento);
        buttonDolares.addActionListener(evento);
        buttonLibras.addActionListener(evento);
        JPanel panel = new JPanel();
        this.setLayout(new GridLayout(3, 1));
        buttonEuros.setBackground(Color.green);
    }

    public void resetearColor() {
        buttonLibras.setBackground(Color.WHITE);
        buttonEuros.setBackground(Color.WHITE);
        buttonDolares.setBackground(Color.WHITE);
        buttonYenes.setBackground(Color.WHITE);
    }

    private class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] array = {"Euros", "Yenes", "Dolares", "Libras"};
            Double[] factor1 = {1d, 0.00755, 0.849329d, 1.1428d};
            Object botonPulsado = e.getSource();
            if (botonPulsado == buttonAceptar) {
                for (int cont = 0; cont < array.length; cont++) {
                    if (array[cont] == jComboBox.getSelectedItem()) {
                        try {
                            DecimalFormat df = new DecimalFormat("###.##");
                            textAreaSolucion.setText(df.format(Double.parseDouble(textField.getText()) * factor1[cont] / factor1[convertirA]) + "");
                        } catch (NumberFormatException a) {
                            frame.setTitle("ERROR " + a.getMessage());
                        }
                    }
                }
            } else if (botonPulsado == buttonEuros) {
                resetearColor();
                convertirA = 0;
                buttonEuros.setBackground(Color.GREEN);
            } else if (botonPulsado == buttonYenes) {
                resetearColor();
                convertirA = 1;
                buttonYenes.setBackground(Color.GREEN);
            } else if (botonPulsado == buttonDolares) {
                resetearColor();
                convertirA = 2;
                buttonDolares.setBackground(Color.GREEN);
            } else if (botonPulsado == buttonLibras) {
                resetearColor();
                convertirA = 3;
                buttonLibras.setBackground(Color.GREEN);
            }

        }
    }
}
