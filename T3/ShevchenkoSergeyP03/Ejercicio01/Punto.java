package T3.ShevchenkoSergeyP03.Ejercicio01;

/**
 * @Author Sergey Shevchenko
 */
public class Punto {
    double coordenadaX, coordenadaY;

    public Punto() {
        this.coordenadaX = 2;
        this.coordenadaY = 4;
    }

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public Punto(Punto t) {
        this.coordenadaX = t.coordenadaX;
        this.coordenadaY = t.coordenadaY;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "coordenadaX=" + coordenadaX +
                ", coordenadaY=" + coordenadaY +
                '}';
    }

    public double distancia(Punto p) {
        return Math.pow(Math.pow((this.getCoordenadaX() - p.getCoordenadaX()), 2) + Math.pow(this.getCoordenadaY() - p.getCoordenadaY(), 2), 0.5);
    }

    public void moverPunto(double coordenadaX, double coordenadaY) {
        this.setCoordenadaX(this.getCoordenadaX() + coordenadaX);
        this.setCoordenadaY(this.getCoordenadaY() + coordenadaY);
    }
}
