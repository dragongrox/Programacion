package T8.PracticaObligatoriaT8.ejercicio22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Panel2 extends JPanel {
    JLabel label = new JLabel(" / ");
    JLabel label2 = new JLabel(" / ");
    JComboBox comboBoxDia = new JComboBox();
    JComboBox comboBoxMes = new JComboBox();
    JComboBox comboBoxAnio = new JComboBox();
    JButton buttonAceptar = new JButton("Aceptar");
    JButton buttonCancelar = new JButton("Cancelar");
    public Panel panel = null;
    public Frame2 frame2 = null;

    public Panel2(Panel panel, Frame2 frame2) {
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
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, anio);
        calendar.set(Calendar.MONTH, mes);
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        panel.textFieldFechaLarga.setText(sdf.format(calendar.getTime()).replace("/", " de "));
    }

    public class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object botonPulsado = e.getSource();
            try {
                if (botonPulsado == buttonAceptar) {
                    setTextFieldFechaCorta(panel,
                            Integer.valueOf((Integer) comboBoxDia.getSelectedItem()),
                            Integer.valueOf((Integer) comboBoxMes.getSelectedItem()),
                            Integer.valueOf((Integer) comboBoxAnio.getSelectedItem()));
                    setTextFieldFechaLarga(panel,
                            Integer.valueOf((Integer) comboBoxDia.getSelectedItem()),
                            Integer.valueOf((Integer) comboBoxMes.getSelectedItem()),
                            Integer.valueOf((Integer) comboBoxAnio.getSelectedItem()));
                    panel.frame2.dispose();
                } else {
                    comboBoxDia.setSelectedIndex(0);
                    comboBoxMes.setSelectedIndex(0);
                    comboBoxAnio.setSelectedIndex(0);
                }
            } catch (ClassCastException a) {
                panel.frame2.setTitle("Error. Fecha no valida");
            }
        }
    }

}
