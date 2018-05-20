package T8.PracticaObligatoriaT8.ejercicio25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertidorMonedas {

    public static void main(String[] args) {
        Marco1 marco1 = new Marco1();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true);
    }
}

class Panel1 extends JPanel {

    JComboBox jComboBox = new JComboBox();
    JTextField textField = new JTextField(10);
    JButton buttonAceptar = new JButton("Aceptar");
    JTextArea textAreaSolucion = new JTextArea("Equivalente");

    JButton buttonEuros = new JButton("Euros");
    JButton buttonYenes = new JButton("Yenes");
    JButton buttonDolares = new JButton("Dolares");
    JButton buttonLibras = new JButton("Libras");

    int convertirA = 0;

    public Panel1() {
        JPanel panelInterno1 = new JPanel();
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
                        textAreaSolucion.setText((Double.parseDouble(textField.getText()) * factor1[cont] / factor1[convertirA]) + "");
                    }
                }
            } else if (botonPulsado == buttonEuros)
                convertirA = 0;
            else if (botonPulsado == buttonYenes)
                convertirA = 1;
            else if (botonPulsado == buttonDolares)
                convertirA = 2;
            else if (botonPulsado == buttonLibras)
                convertirA = 3;

        }
    }
}

class Marco1 extends JFrame {

    public Marco1() {
        setTitle("Conversor de Monedas");
        Panel1 L1 = new Panel1();
        add(L1);
        pack();

    }

}
