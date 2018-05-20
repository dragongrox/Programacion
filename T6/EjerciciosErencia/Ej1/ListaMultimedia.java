package T6.EjerciciosErencia.Ej1;

import java.util.Vector;

public class ListaMultimedia {
    Multimedia[] multimedia;
    int numObjetos;

    public ListaMultimedia(int numObjetosMaximos) {
        this.multimedia
                = new Multimedia[numObjetosMaximos];
        this.numObjetos = 0;
    }

    public ListaMultimedia() {
        this.multimedia
                = new Multimedia[3];
        this.numObjetos = 0;
    }

    int size() {
        return numObjetos;
    }

    boolean add(Multimedia m) {
        boolean sw = true;
        for (int cont = 0; cont < multimedia.length; cont++) {
            if (multimedia[cont] == null) {
                multimedia[cont] = m;
                sw = false;
                cont = multimedia.length;
            }
        }
        return sw;
    }

    Multimedia get(int posicion) {
        return multimedia[posicion];
    }

    public String toString() {
        String ret = "";
        for (int cont = 0; cont < multimedia.length; cont++) {
            if (multimedia[cont] != null)
                ret = ret + multimedia[cont].toString() + "\n";
        }
        return ret;
    }


}
