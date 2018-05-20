package T3.Clase22_11_2017;

/**
 * @Author Sergey Shevchenko
 */
/*
Punto
    cordenadaX:null
    cordenadaY:null
    ----------------
    Punto()
    Punto(int,int)
    Punto(Punto)
    setCoordenadaX(int):void
    setCoordenadaY(int):void
    getCoordenadaX():int
    getCoordenadaY():int
    toString():String
    distancia(Punto):double
        RaizCuadrada:(x-x1)^2+(y-y1)^2
    puntoMedio(Punto):Punto
        x->(x+x1)/2
        y->(y+y1)/2
    Crear la clase
        PrincipalPunto pruebe los metodos
 */
public class Punto {
    int coordenadaX, coordenadaY;

    public Punto() {
        this.coordenadaX = 2;
        this.coordenadaY = 4;
    }

    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public Punto(Punto t) {
        this.coordenadaX = t.coordenadaX;
        this.coordenadaY = t.coordenadaY;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
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

    public Punto puntoMedio(Punto p) {
        p.setCoordenadaX((this.getCoordenadaX() + p.getCoordenadaX()) / 2);
        p.setCoordenadaY((this.getCoordenadaY() + p.getCoordenadaY()) / 2);
        return p;
    }

    public void cuadrante() {
        if (this.getCoordenadaX() == 0 && this.getCoordenadaY() == 0)
            if (this.getCoordenadaX() > 0)
                if (this.getCoordenadaY() > 0)
                    System.out.println("cuadrante 1");
                else
                    System.out.println("cuadrante 4");
            else if (this.getCoordenadaY() > 0)
                System.out.println("cuadrante 2");
            else
                System.out.println("cuadrante 3");

    }
}
