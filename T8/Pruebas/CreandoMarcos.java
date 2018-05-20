package T8.Pruebas;

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
    JButton b1=new JButton("Negro");
    JButton b2=new JButton("Rojo");
    JButton b3=new JButton("Blanco");
    public Lamina(){
        add(b1);
        add(b2);
        add(b3);
        ColorFondo Negro=new ColorFondo(Color.BLACK);
        ColorFondo Rojo=new ColorFondo(Color.RED);
        ColorFondo Blanco=new ColorFondo(Color.WHITE);
        b1.addActionListener(Negro);
        b2.addActionListener(Rojo);
        b3.addActionListener(Blanco);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Ejemplo: ",20,20);

    }

    private class ColorFondo implements ActionListener{
        public ColorFondo(Color c){
            colorDeFonndo=c;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(colorDeFonndo);
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
        setSize(convertirAncho(50),convertirAlto(50));
        setTitle("Marco");
        Lamina L1=new Lamina();
        add(L1);

    }

}
