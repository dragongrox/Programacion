package T7;

class CalseA {
    public CalseA(int x) {
        System.out.println("ClaseA-" + x);
    }
}

class ClaseB extends CalseA {
    public ClaseB() {
        super(6);
        System.out.println("ClaseB-");
    }
}

public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseB objB1 = new ClaseB();
        ClaseB objB2;
        System.out.println(" FIN");
    }
}
