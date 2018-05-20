package T4.Clase15_01_2018;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Clase15_01_2018 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(12);
        vector.add(15);
        vector.add("r");

        ArrayList arrayList = new ArrayList();
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(17);

        Iterator it = arrayList.iterator();
        while (it.hasNext())
            System.out.println(it.next());


        Enumeration en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
