package T8.PracticaObligatoriaT8.ejercicio22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class panel2 extends JPanel {
    JLabel label = new JLabel(" / ");
    JLabel label2 = new JLabel(" / ");
    JComboBox comboBoxDia = new JComboBox();
    JComboBox comboBoxMes = new JComboBox();
    JComboBox comboBoxAnio = new JComboBox();
    JButton buttonAceptar = new JButton("Aceptar");
    JButton buttonCancelar = new JButton("Cancelar");
    Panel panel = null;
    Frame2 frame2 = null;

    public panel2(Panel panel, Frame2 frame2) {
        comboBoxDia.addItem("  ");
        comboBoxMes.addItem("  ");
        comboBoxAnio.addItem("    ");
        for (int cont = 1; cont <= 31; cont++) comboBoxDia.addItem(cont);
        for (int cont = 1; cont <= 12; cont++) comboBoxMes.addItem(cont);
        for (int cont = 1900; cont <= 2018; cont++) comboBoxAnio.addItem(cont);
        this.panel = panel;
        this.frame2 = frame2;
        JPanel panel3 = new JPanel();
        JPanel panel1 = new JPanel();
        add(panel3, BorderLayout.NORTH);
        panel1.add(comboBoxDia);
        panel1.add(label);
        panel1.add(comboBoxMes);
        panel1.add(label2);
        panel1.add(comboBoxAnio);
        JPanel panel2 = new JPanel();
        panel2.add(buttonAceptar);
        panel2.add(buttonCancelar);
        panel3.setLayout(new GridLayout(2, 1, 20, 20));
        panel3.add(panel1);
        panel3.add(panel2);
        Evento evento = new Evento();
        buttonAceptar.addActionListener(evento);
        buttonCancelar.addActionListener(evento);
    }

    public void setTextFieldFechaCorta(Panel panel, int dia, int mes, int anio) {
        panel.textFieldFechaCorta.setText(dia + " / " + mes + " / " + anio);

    }

    public void setTextFieldFechaLarga(Panel panel, int dia, int mes, int anio) {
        panel.textFieldFechaLarga.setText(dia + " de ");
    }

    public void cerrarVentana(Frame2 frame2) {
        frame2.setVisible(false);
    }

    class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();
            if (botonPulsado == buttonAceptar) {
                setTextFieldFechaCorta(panel,
                        Integer.valueOf((Integer) comboBoxDia.getSelectedItem()),
                        Integer.valueOf((Integer) comboBoxMes.getSelectedItem()),
                        Integer.valueOf((Integer) comboBoxAnio.getSelectedItem()));
                cerrarVentana(frame2);
            } else {
                comboBoxDia.setSelectedItem(1);
                comboBoxMes.setSelectedItem(1);
                comboBoxAnio.setSelectedItem(1);
            }
        }
    }

}
