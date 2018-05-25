package T8.PracticaObligatoriaT8.ejercicio29;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class Panel extends JPanel {
    JFileChooser fileChooser = new JFileChooser();
    Persona[] personas = new Persona[0];
    ManejoFichero manejoFichero = new ManejoFichero();
    int selection = 0;
    JButton buttonCargar = new JButton("Cargar Fichero");
    JButton buttonGuardar = new JButton("Guardar Fichero");
    JPanel panel = null;
    JLabel labelNumPersonas = new JLabel();
    JTextField textFieldNombre = new JTextField(10);
    JTextField textFieldApellidos = new JTextField(10);
    JTextField textFieldTelefono = new JTextField(10);
    JButton buttonGuardarPersona = new JButton("Guargar persona");
    JComboBox comboBoxPersonas = new JComboBox();
    JButton buttonEliminarPersona = new JButton("Eliminar persona");
    JLabel labelNombreMostrado = new JLabel();
    JLabel labelApellidoMostrado = new JLabel();
    JLabel labelTelefonoMostrado = new JLabel();

    public Panel() {
        panel = this;
        add(buttonCargar);
        add(buttonGuardar);
        add(labelNumPersonas);
        add(new JLabel("Nombre:"));
        add(textFieldNombre);
        add(new JLabel("Apellidos:"));
        add(textFieldApellidos);
        add(new JLabel("Telefono:"));
        add(textFieldTelefono);
        add(buttonGuardarPersona);
        add(buttonEliminarPersona);
        add(new JLabel("Seleccionar personas"));
        add(comboBoxPersonas);
        add(new JLabel("Nombre:"));
        add(labelNombreMostrado);
        add(new JLabel("Appelidos:"));
        add(labelApellidoMostrado);
        add(new JLabel("Telefono:"));
        add(labelTelefonoMostrado);

        Evento evento = new Evento();
        buttonCargar.addActionListener(evento);
        buttonGuardar.addActionListener(evento);
        buttonGuardarPersona.addActionListener(evento);
        buttonEliminarPersona.addActionListener(evento);
        comboBoxPersonas.addActionListener(evento);
    }

    public void RellenarComboBoxPeronas() {
        comboBoxPersonas.removeAllItems();
        for (Persona elemento : personas) {
            comboBoxPersonas.addItem(elemento.nombre);
        }
    }

    class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object object = e.getSource();
            if (object == buttonCargar) {
                selection = fileChooser.showOpenDialog(new PanelSeleccion());
                if (selection == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    personas = manejoFichero.leerObjeto(file.getAbsolutePath());
                    panel.revalidate();
                    panel.repaint();
                    labelNumPersonas.setText(personas.length + " personas almacenadas");
                    RellenarComboBoxPeronas();
                    labelNombreMostrado.setText(personas[comboBoxPersonas.getSelectedIndex()].nombre);
                    labelApellidoMostrado.setText(personas[comboBoxPersonas.getSelectedIndex()].apellidos);
                    labelTelefonoMostrado.setText(personas[comboBoxPersonas.getSelectedIndex()].telefono);
                }
            } else if (object == buttonGuardar) {
                selection = fileChooser.showOpenDialog(new PanelSeleccion());
                if (selection == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    manejoFichero.escribirObjeto(file.getAbsolutePath(), personas);
                    panel.revalidate();
                    panel.repaint();
                    RellenarComboBoxPeronas();
                    labelNumPersonas.setText(personas.length + " personas almacenadas");
                }
            } else if (object == buttonGuardarPersona) {
                if (!textFieldNombre.getText().equals("") &&
                        !textFieldApellidos.getText().equals("") &&
                        !textFieldTelefono.getText().equals("") &&
                        textFieldNombre.getText().length() < 10 &&
                        textFieldApellidos.getText().length() < 20 &&
                        textFieldTelefono.getText().length() < 8) {
                    Persona[] personas1 = personas;
                    personas = new Persona[personas1.length + 1];
                    for (int cont = 0; cont < personas1.length; cont++) {
                        personas[cont] = personas1[cont];
                    }
                    personas[personas.length - 1] = new Persona(textFieldNombre.getText(), textFieldApellidos.getText(), textFieldTelefono.getText());
                    RellenarComboBoxPeronas();
                    labelNumPersonas.setText(personas.length + " personas almacenadas");
                    textFieldNombre.setText("");
                    textFieldApellidos.setText("");
                    textFieldTelefono.setText("");
                } else {
                    JOptionPane.showMessageDialog(panel, "Uno de los campos no es valido.");
                }
            } else if (object == buttonEliminarPersona && personas.length != 0) {
                Persona[] personas1 = new Persona[personas.length];
                for (int cont = 0; cont < personas.length; cont++)
                    personas1[cont] = personas[cont];
                personas = new Persona[personas1.length - 1];
                for (int cont = 0, cont2 = 0; cont < personas1.length; cont++) {
                    if (cont != comboBoxPersonas.getSelectedIndex()) {
                        personas[cont2] = personas1[cont];
                        cont2++;
                    }
                }
                RellenarComboBoxPeronas();
                labelNumPersonas.setText(personas.length + " personas almacenadas");
                if (personas.length != 0)
                    comboBoxPersonas.setSelectedIndex(0);
            } else if (object == comboBoxPersonas) {
                /*labelNombreMostrado.setText(personas[comboBoxPersonas.getSelectedIndex()].nombre);
                labelApellidoMostrado.setText(personas[comboBoxPersonas.getSelectedIndex()].apellidos);
                labelTelefonoMostrado.setText(personas[comboBoxPersonas.getSelectedIndex()].telefono);*/
            }
        }
    }

}

class PanelSeleccion extends JPanel {
    public PanelSeleccion() {
    }
}

public class InterfazGrafica extends JFrame {
    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public int convertirAlto(int porcentaje) {    //metodo que devuelve la altura en px independientemente de la pantalla
        return (int) (porcentaje * screenSize.height / 100f);
    }

    public int convertirAncho(int porcentaje) {    //metodo que devuelve el ancho en px independientemente de la pantalla
        return (int) (porcentaje * screenSize.width / 100f);
    }

    public InterfazGrafica() {
        setSize(convertirAncho(50), convertirAlto(50));
        setTitle("Ejercicio 29");
        Panel L1 = new Panel();
        add(L1);
        setLocationRelativeTo(null);
    }
}

