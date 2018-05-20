package T3.Clase16_11_2017;

/*
Constructores:
    .Por defecto (Inicializa la hora a la 13)
    .Constructor de clase
    .Constructor de copia
    .set y get
    .toString
        clasico
        Escribe la hora en la hora
            HH:MM:SS
    Metodos
        .Validar hora
        .Segundo siguiente
        .Segundo anterior

        hora 1
        hora2 hora que quieras
        hora3 = hora2

 */
public class hora {
    private int hora = 13, minuto = 0, segundo = 0;

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {

        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public hora() {
        this.hora = 13;
        this.minuto = 0;
        this.segundo = 0;
    }

    public hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public hora(hora t) {
        this.hora = t.hora;
        this.minuto = t.minuto;
        this.segundo = t.segundo;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public boolean validarHora() {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59)
            return true;
        else
            return false;
    }

    public void segundoSiguiente() {
        setSegundo(getSegundo() + 1);
        if (validarHora() == false) {
            setSegundo(0);
            setMinuto(getMinuto() + 1);
            if (validarHora() == false) {
                setMinuto(0);
                setHora(getHora() + 1);
                if (validarHora() == false)
                    setHora(0);
            }
        }
        return;
    }

    public void segundoAnterior() {
        setSegundo(getSegundo() - 1);
        if (validarHora() == false) {
            setSegundo(59);
            setMinuto(getMinuto() - 1);
            if (validarHora() == false) {
                setMinuto(59);
                setHora(getHora() - 1);
                if (validarHora() == false)
                    setHora(59);
            }
        }
        return;
    }

    public static void main(String[] args) {
        T3.Clase16_11_2017.hora hora1 = new hora();
        T3.Clase16_11_2017.hora hora2 = new hora(14, 56, 21);
        T3.Clase16_11_2017.hora hora3 = new hora(hora2);
        System.out.println(hora1.toString());
    }
}
