package T4.EjercicioArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * @Author Sergey Shevchenko
 */
public class PruebaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(1, 7);
        Vector vector = new Vector();
        vector.add(0);
        vector.add(11);
        for (int elemento : array) {
            System.out.println(elemento);
        }
        System.out.println();
        array.addAll(vector);
        System.out.println();
        array.trimToSize();
        for (int cont = 0; array.size() > cont; cont++) {
            System.out.println(array.get(cont));
        }
        System.out.println();
        Iterator iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        array.clear();
        System.out.println();
        for (int elemento : array) {
            System.out.println(elemento);
        }

    }
}
