package T8.PracticaObligatoriaT8.ejercicio6;

import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame {
    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public int convertirAlto(int porcentaje) {    //metodo que devuelve la altura en px independientemente de la pantalla
        return (int) (porcentaje * screenSize.height / 100f);
    }

    public int convertirAncho(int porcentaje) {    //metodo que devuelve el ancho en px independientemente de la pantalla
        return (int) (porcentaje * screenSize.width / 100f);
    }

    public Marco() {
        setSize(convertirAncho(25), convertirAlto(25));
        setTitle("Panel");
        Panel L1 = new Panel();
        add(L1);
        setVisible(true);


    }
}
