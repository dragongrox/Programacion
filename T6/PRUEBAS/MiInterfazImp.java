package T6.PRUEBAS;

public class MiInterfazImp implements MiInterfaz {
    @Override
    public int sumar(int arg1, int arg2) {
        return arg1 + arg2;
    }

    @Override
    public int restar(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static void main(String[] args) {
        MiInterfaz interfaz = new MiInterfazImp();
        System.out.println(interfaz.sumar(2, 5));
    }
}
