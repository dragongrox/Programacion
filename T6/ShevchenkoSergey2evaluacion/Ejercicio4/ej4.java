package T6.ShevchenkoSergey2evaluacion.Ejercicio4;

public class ej4 {
    static String root(double a, double b, double c) throws IllegalArgumentException {
        String ret = "";
        if (a == 0) {
            throw new IllegalArgumentException("A no puede ser cero. ");
        } else {
            double disc = b * b - 4 * a * c;
            if (disc < 0)
                throw new IllegalArgumentException("Discriminante < cero.");
            ret = (-b + Math.sqrt(disc)) / (2 * a) + "\n";
            ret = ret + (-b - Math.sqrt(disc)) / (2 * a) + "";
        }

        return ret;
    }

    public static void main(String[] args) {
        try {
            System.out.println(root(2, 10, 5));

        } catch (Exception a) {
            System.out.println("Los valores no son validos. ");
        }
    }
}
