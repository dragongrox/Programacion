package T8.PracticaObligatoriaT8.ejercicio22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LectorFechas {
    public static void main(String[] args) {
        frame frame=new frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static class frame extends JFrame {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        public int convertirAlto(int porcentaje){    //metodo que devuelve la altura en px independientemente de la pantalla
            return (int) (porcentaje*screenSize.height/100f);
        }

        public int convertirAncho(int porcentaje){    //metodo que devuelve el ancho en px independientemente de la pantalla
            return (int) (porcentaje*screenSize.width/100f);
        }

        public frame(){
            setSize(convertirAncho(50),convertirAlto(50));
            setTitle("Ejercicio 22");
            panel L1=new panel();
            add(L1);
        }
    }

    static class frame2 extends JFrame {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        public int convertirAlto(int porcentaje){    //metodo que devuelve la altura en px independientemente de la pantalla
            return (int) (porcentaje*screenSize.height/100f);
        }

        public int convertirAncho(int porcentaje){    //metodo que devuelve el ancho en px independientemente de la pantalla
            return (int) (porcentaje*screenSize.width/100f);
        }

        public frame2(){
            setSize(convertirAncho(50),convertirAlto(50));
            panel2 L1=new panel2();
            add(L1);
        }
    }

    public static class panel extends JPanel {
        JButton buttonFechas=new JButton("Introducir Fecha de Nacimiento");
        public JTextField textFieldFechaCorta=new JTextField(5);
        public JTextField textFieldFechaLarga=new JTextField(5);
        public panel(){
            JPanel jPanel=new JPanel();
            add(jPanel,BorderLayout.CENTER);
            textFieldFechaCorta.setEditable(false);
            textFieldFechaLarga.setEditable(false);
            jPanel.add(buttonFechas);
            jPanel.add(textFieldFechaCorta);
            jPanel.add(textFieldFechaLarga);
            jPanel.setLayout(new GridLayout(3,1,20,20));
            Evento evento=new Evento();
            buttonFechas.addActionListener(evento);
        }

        public void setTextFieldFechaCorta(String text){
            textFieldFechaCorta.setText(text);
        }

        public class Evento implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame2 frame2=new frame2();
                frame2.setVisible(true);

            }
        }
    }

    public static class panel2 extends JPanel {
        JLabel label=new JLabel(" / ");
        JLabel label2=new JLabel(" / ");
        JTextField textFieldDia=new JTextField(5);
        JTextField textFieldMes=new JTextField(5);
        JTextField textFieldAnio=new JTextField(5);
        JButton buttonAceptar=new JButton("Aceptar");
        JButton buttonCancelar=new JButton("Cancelar");
        public panel2(){
            JPanel panel3=new JPanel();
            JPanel panel1=new JPanel();
            add(panel3,BorderLayout.NORTH);
            panel1.add(textFieldDia);
            panel1.add(label);
            panel1.add(textFieldMes);
            panel1.add(label2);
            panel1.add(textFieldAnio);
            JPanel panel2=new JPanel();
            panel2.add(buttonAceptar);
            panel2.add(buttonCancelar);
            panel3.setLayout(new GridLayout(2,1,20,20));
            panel3.add(panel1);
            panel3.add(panel2);
            Evento evento=new Evento();
            buttonAceptar.addActionListener(evento);
            buttonCancelar.addActionListener(evento);
        }

        private class Evento extends panel implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object botonPulsado=e.getSource();
                if (botonPulsado==buttonAceptar){
                    String text=textFieldDia.getText()+"/"+
                            textFieldMes.getText()+"/"+textFieldAnio.getText();
                    textFieldFechaCorta.setText(text);
                }else{
                    textFieldDia.setText(null);
                    textFieldMes.setText(null);
                    textFieldAnio.setText(null);
                }
            }
        }

    }
}