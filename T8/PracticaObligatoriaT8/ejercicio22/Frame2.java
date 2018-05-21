package T8.PracticaObligatoriaT8.ejercicio22;

import javax.swing.*;
import java.awt.*;

class Frame2 extends JFrame {
    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public int convertirAlto(int porcentaje) {    //metodo que devuelve la altura en px independientemente de la pantalla
        return (int) (porcentaje * screenSize.height / 100f);
    }

    public int convertirAncho(int porcentaje) {    //metodo que devuelve el ancho en px independientemente de la pantalla
        return (int) (porcentaje * screenSize.width / 100f);
    }

    public Frame2(Panel panel, Frame2 frame2) {
        setSize(convertirAncho(25), convertirAlto(25));
        panel2 L1 = new panel2(panel, frame2);
        add(L1);
        setLocationRelativeTo(null);

    }
}
