package T8.PracticaObligatoriaT8.ejercicio10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreandoMarcos {

    public static void main(String[] args) {
        miMarco marco=new miMarco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}

class Lamina extends JPanel{
    JButton b1=new JButton("Azul");
    JButton b2=new JButton("Amarillo");
    JButton b3=new JButton("Rojo");
    JButton b4=new JButton("Verde");
    JPanel panel=new JPanel();
    public Lamina(){
        panel.setLayout(new GridLayout(2,2,10,20));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        add(panel,BorderLayout.NORTH);
        ColorFondo Azul=new ColorFondo(Color.BLUE);
        ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
        ColorFondo Rojo=new ColorFondo(Color.RED);
        ColorFondo Verde=new ColorFondo(Color.GREEN);
        b1.addActionListener(Azul);
        b2.addActionListener(Amarillo);
        b3.addActionListener(Rojo);
        b4.addActionListener(Verde);
    }

    private class ColorFondo implements ActionListener{
        public ColorFondo(Color c){
            colorDeFonndo=c;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(colorDeFonndo);
            panel.setBackground(colorDeFonndo);
        }

        private Color colorDeFonndo;
    }
}


class miMarco extends JFrame{

    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public int convertirAlto(int porcentaje){    //metodo que devuelve la altura en px independientemente de la pantalla
        return (int) (porcentaje*screenSize.height/100f);
    }

    public int convertirAncho(int porcentaje){    //metodo que devuelve el ancho en px independientemente de la pantalla
        return (int) (porcentaje*screenSize.width/100f);
    }

    public miMarco(){
        setSize(convertirAncho(25),convertirAlto(25));
        setTitle("Ejercicio 10");
        Lamina L1=new Lamina();
        add(L1);
    }

}
