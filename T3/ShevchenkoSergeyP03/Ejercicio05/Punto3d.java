package T3.ShevchenkoSergeyP03.Ejercicio05;

/**
 * @Author Sergey Shevchenko
 */
public class Punto3d {

    private double coordenadaX, coordenadaY, coordenadaZ;

    public Punto3d() {
        this.coordenadaX = 0;
        this.coordenadaY = 0;
        this.coordenadaZ = 0;
    }

    public Punto3d(Punto3d t) {
        this.coordenadaX = t.coordenadaX;
        this.coordenadaY = t.coordenadaY;
        this.coordenadaZ = t.coordenadaZ;
    }

    public Punto3d(double coordenadaX, double coordenadaY, double coordenadaZ) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaZ() {
        return coordenadaZ;
    }

    public void setCoordenadaZ(double coordenadaZ) {
        this.coordenadaZ = coordenadaZ;
    }

    public void definirPunto(double coordenadaX, double coordenadaY, double coordenadaZ) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
    }

    public void desplazarPunto(double coordenadaX, double coordenadaY, double coordenadaZ) {
        this.coordenadaX = this.coordenadaX + coordenadaX;
        this.coordenadaY = this.coordenadaY + coordenadaY;
        this.coordenadaZ = this.coordenadaZ + coordenadaZ;
    }

    public void trasladar(double x) {
        this.setCoordenadaX(this.getCoordenadaX() + x);
    }

    public void trasladar(double x, double y) {
        this.setCoordenadaX(this.getCoordenadaX() + x);
        this.setCoordenadaY(this.getCoordenadaY() + y);
    }

    public void trasladar(double x, double y, double z) {
        this.setCoordenadaX(this.getCoordenadaX() + x);
        this.setCoordenadaY(this.getCoordenadaY() + y);
        this.setCoordenadaZ(this.getCoordenadaZ() + z);
    }

    @Override
    public String toString() {
        return "(" + coordenadaX +
                ", " + coordenadaY +
                ", " + coordenadaZ +
                ')';
    }
}
