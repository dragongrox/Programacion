package T4.ShevchenkoSergey2evaluacion.Ejercicio1;

/**
 * @author Sergey Shevchenko
 */
public class Ejercicio1 {
    public static int[] fusion(int[] array1, int[] array2) {
        int cont1 = 0, cont2 = 0;
        int[] ret = new int[array1.length + array2.length];
        for (int cont = 0; cont < ret.length; cont++) {
            if (array1[cont1] < array2[cont2]) {
                ret[cont] = array1[cont1];
                if (cont1 + 1 < array1.length)
                    cont1++;
            } else {
                ret[cont] = array2[cont2];
                if (cont2 + 1 < array2.length)
                    cont2++;
            }


        }
        return ret;
    }

    public static String Mostrar(int[] array) {
        String ret = "";
        for (int cont = 0; cont < array.length; cont++)
            ret += array[cont] + " ";
        return ret;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println("Los dos array que se vana  fusionar son " + Mostrar(array1) + " y " + Mostrar(array2));
        System.out.println("Fusionados serian: ");
        int[] array3 = fusion(array1, array2);
        System.out.println(Mostrar(array3));
    }
}
