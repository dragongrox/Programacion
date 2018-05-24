package T8.PracticaObligatoriaT8.ejercicio11;

import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {
    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public int convertirAlto(int porcentaje) {    //metodo que devuelve la altura en px independientemente de la pantalla
        return (int) (porcentaje * screenSize.height / 100f);
    }

    public int convertirAncho(int porcentaje) {    //metodo que devuelve el ancho en px independientemente de la pantalla
        return (int) (porcentaje * screenSize.width / 100f);
    }

    public Frame() {
        setSize(convertirAncho(50), convertirAlto(50));
        setTitle("Ejercicio 11");
        Panel L1 = new Panel();
        add(L1);

    }
}
