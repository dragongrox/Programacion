package T3.ExamenPT.EJERCICIO1;

public class Tragaperras {
    private int monedas;
    private char fig1, fig2, fig3;

    public Tragaperras() {
        monedas = 10;
        fig1 = generaFigura();
        fig2 = generaFigura();
        fig3 = generaFigura();
    }

    public Tragaperras(int monedas) {
        this.monedas = monedas;
    }

    public char generaFigura() {
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                return '*';
            case 2:
                return '@';
            case 3:
                return '#';
            case 4:
                return '$';
            case 5:
                return '&';
            default:
                return '&';
        }
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public char getFig1() {
        return fig1;
    }

    public void setFig1(char fig1) {
        this.fig1 = fig1;
    }

    public char getFig2() {
        return fig2;
    }

    public void setFig2(char fig2) {
        this.fig2 = fig2;
    }

    public char getFig3() {
        return fig3;
    }

    public void setFig3(char fig3) {
        this.fig3 = fig3;
    }

    public String toString() {
        return "Tragaperras{" +
                "monedas=" + monedas +
                ", fig1=" + fig1 +
                ", fig2=" + fig2 +
                ", fig3=" + fig3 +
                '}';
    }

    public void apuesta() {
        setFig1(generaFigura());
        setFig2(generaFigura());
        setFig3(generaFigura());
        if (monedas > 0)
            if (fig1 == fig2 && fig2 == fig3 && fig1 == fig3) {
                System.out.println("¡¡¡ENHORABUENA!!! HA GANADO 10 MONEDAS");
                setMonedas(monedas + 9);
            } else if (fig1 != fig2 && fig1 != fig3 && fig2 != fig3) {
                System.out.println("¡ LO SIENTO HA PERDIDO SU MONEDA!");
                setMonedas(monedas - 1);
            } else
                System.out.println("¡¡¡BIEN!!!. RECUPERARAS TU MONEDA");
        else
            System.out.println("No hay monedas suficientes.");
    }

    public static void main(String[] args) {
        Tragaperras juego = new Tragaperras();
        for (int cont = 0; cont < 5; cont++) {
            juego.apuesta();
        }
        Tragaperras juegofinal = new Tragaperras(20);
        System.out.println();
        int cont = 0, antes, uno = 0, diez = 0;
        for (; juegofinal.getMonedas() > 0; cont++) {
            antes = juegofinal.getMonedas();
            juegofinal.apuesta();
            if (juegofinal.getMonedas() - antes == 0)
                uno++;
            if (juegofinal.getMonedas() - antes == 9)
                diez++;
        }
        System.out.println("Se jugaron " + cont + " partidas de las cuales se ganaron " + uno + " veces monedas de 1 y " + diez + " veces monedas de 10.");
    }
}
