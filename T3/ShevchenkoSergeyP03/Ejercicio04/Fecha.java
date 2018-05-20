package T3.ShevchenkoSergeyP03.Ejercicio04;

import java.util.Scanner;

/**
 * @Author Sergey Shevchenko
 */
/*
Crea una clase Fecha con atributos para el día, el mes y el año de la fecha. Incluye, al
menos, los siguientes métodos:
 Constructor predeterminado con el 1-1-1900 como fecha por defecto.
 Constructor parametrizado con día, mes y año.
 leer(): pedirá al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a 2050).
 bisiesto(): indicará si el año de la fecha es bisiesto o no.
 diasMes(int): devolverá el número de días del mes que se le indique
 (para el año de la fecha).
 valida(): comprobará si la fecha es correcta (entre el 1-1-1900 y el 31-12-2050);
si el día no es correcto, lo pondrá a 1; si el mes no es correcto, lo pondrá a 1; y
si el año no es correcto, lo pondrá a 1900. Será un método auxiliar (privado).
Este método se llamará en el constructor parametrizado y en leer().
 Accedentes y mutadores.
 corta(): mostrará la fecha en formato corto (02-09-2003).
 diasTranscurridos(): devolverá el número de días transcurridos desde el 1-1-
1900 hasta la fecha.
 diaSemana(): devolverá el día de la semana de la fecha (0 para domingo, ..., 6
para sábado). El 1-1-1900 fue domingo. (mentira fue lunes)
 larga(): mostrará la fecha en formato largo, empezando por el día de la semana
(martes 2 de septiembre de 2003).
 fechaTras(long): hará que la fecha sea la correspondiente a haber transcurrido
los días que se indiquen desde el 1-1-1900.
 diasEntre(Fecha): devolverá el número de días entre la fecha y la
proporcionada.
 siguiente(): pasará al día siguiente.
 anterior(): pasará al día anterior.
 copia(): devolverá un clon de la fecha.
 igualQue(Fecha): indica si la fecha es la misma que la proporcionada.
 menorQue(Fecha): indica si la fecha es anterior a la proporcionada.
 mayorQue(Fecha): indica si la fecha es posterior a la proporcionada
 */
public class Fecha {
    int dia, mes, anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.validar();
    }

    public Fecha(Fecha t) {
        this.dia = t.dia;
        this.mes = t.mes;
        this.anio = t.anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            this.dia = dia;
        else
            System.out.println();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    private boolean biciesto(int anio) {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            return true;
        else
            return false;
    }

    private boolean anioValido() {
        if (1900 <= anio && 2050 >= anio)
            return true;
        else
            return false;
    }

    private boolean mesValido() {
        if (mes > 0 && mes < 13)
            return true;
        else
            return false;
    }

    private boolean diaValido() {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia > 0 && dia <= 31)
                    return true;
                else
                    return false;
            case 2:
                if (dia > 0 && dia <= 29 && biciesto(anio))
                    return true;
                if (dia > 0 && dia <= 28)
                    return true;
                else
                    return false;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 0 && dia <= 30)
                    return true;
                else
                    return false;
            default:
                return false;
        }
    }

    private void validar() {
        if (!this.anioValido())
            anio = 1900;
        if (!this.mesValido())
            mes = 1;
        if (!this.diaValido())
            dia = 1;
    }

    public void leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el dia (1 a 31)");
        this.dia = entrada.nextInt();
        System.out.println("Introduzca el mes (1 a 12)");
        this.mes = entrada.nextInt();
        System.out.println("Introduzca el año (1900 a 2050)");
        this.anio = entrada.nextInt();
        validar();
    }

    public int diasMes(int mes) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (biciesto(anio))
                    return 29;
                else
                    return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }

    public int diasAnio(int anio) {
        if (biciesto(anio))
            return 366;
        else
            return 365;
    }

    public String corta() {
        return dia + "-" + mes + "-" + anio;
    }

    public int diasTranscurridos() {
        int dias = 0;
        for (int anio = 1900; anio < this.anio; anio++)
            if (biciesto(anio))
                dias = dias + 366;
            else
                dias = dias + 365;
        for (int mes = 1; mes < this.mes; mes++)
            dias = dias + diasMes(mes);
        return dias + dia - 1;
    }

    public int diaSemana() {
        if (this.diasTranscurridos() == 0)
            return 1;
        else
            return this.diasTranscurridos() % 7 + 1;
    }

    public String larga() {
        String salida = "";
        switch (this.diaSemana()) {
            case 0:
                salida = "Domingo ";
                break;
            case 1:
                salida = "Lunes ";
                break;
            case 2:
                salida = "Martes ";
                break;
            case 3:
                salida = "Miercoles ";
                break;
            case 4:
                salida = "Jueves ";
                break;
            case 5:
                salida = "Viernes ";
                break;
            case 6:
                salida = "Sabado ";
                break;
        }
        salida = salida + dia + " de ";
        switch (this.mes) {
            case 1:
                salida = salida + "enero ";
                break;
            case 2:
                salida = salida + "febrero ";
                break;
            case 3:
                salida = salida + "marzo ";
                break;
            case 4:
                salida = salida + "abril ";
                break;
            case 5:
                salida = salida + "mayo ";
                break;
            case 6:
                salida = salida + "junio ";
                break;
            case 7:
                salida = salida + "julio ";
                break;
            case 8:
                salida = salida + "agosto ";
                break;
            case 9:
                salida = salida + "septiembre ";
                break;
            case 10:
                salida = salida + "octubre ";
                break;
            case 11:
                salida = salida + "noviembre ";
                break;
            case 12:
                salida = salida + "diciembre ";
                break;
        }
        salida = salida + "de " + anio;
        return salida;
    }

    public void fechaTras(long dias) {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
        for (; dias - diasAnio(anio) >= 0; anio++) {
            dias = dias - diasAnio(anio);
        }
        for (; dias - diasMes(mes) >= 0; mes++) {
            dias = dias - diasMes(mes);
        }
        this.dia = (int) (dias + dia);
    }

    public int diasAnioPasados() {
        int dias = 0;
        for (int mes = 1; mes < this.mes; mes++) {
            dias = dias + diasMes(mes);
        }
        return dias + this.dia;
    }

    public long diasEntre(Fecha fecha) {
        Fecha fecha1 = new Fecha(this);
        Fecha fecha2 = new Fecha(fecha);
        if (fecha1.anio > fecha2.anio) {
            fecha1 = fecha;
            fecha2 = this;
        }
        long dias = fecha2.diasAnioPasados() - fecha1.diasAnioPasados();
        if (fecha1.anio == fecha2.anio)
            return (long) Math.pow(Math.pow(dias, 2), 0.5);
        for (; fecha1.anio < fecha2.anio; fecha1.anio++)
            dias = dias + fecha1.diasAnio(fecha1.anio);
        return dias;
    }

    public void siguente() {
        if (dia + 1 > diasMes(mes))
            if (mes + 1 > 12) {
                anio++;
                mes = 1;
                dia = 1;
            } else {
                mes++;
                dia = 1;
            }
        else
            dia++;
    }

    public void anterior() {
        if (dia - 1 < 1)
            if (mes - 1 < 1) {
                anio--;
                mes = 12;
                dia = 31;
            } else {
                mes--;
                diasMes(mes);
            }
        else
            dia--;
    }

    public Fecha copia() {
        Fecha copia = new Fecha(this);
        return copia;
    }

    public boolean igualQue(Fecha fecha) {
        return this.anio == fecha.anio && this.mes == fecha.mes && this.dia == fecha.dia;
    }

    public boolean mayorQue(Fecha fecha) {
        if (this.anio > fecha.anio)
            return true;
        else if (this.mes > fecha.mes && this.anio == fecha.anio)
            return true;
        else if (this.dia > fecha.dia && this.mes == fecha.mes && this.anio == fecha.anio)
            return true;
        return false;
    }

    public boolean menorQue(Fecha fecha) {
        if (this.anio < fecha.anio)
            return true;
        else if (this.anio == fecha.anio && this.mes < fecha.mes)
            return true;
        else if (this.anio == fecha.anio && this.mes == fecha.mes && this.dia < fecha.dia)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Fecha prueba = new Fecha(15, 2, 1996);
        System.out.println("Han transcurrido " + prueba.diasTranscurridos() + " dias desde ");
        System.out.print(prueba.corta() + " o ");
        System.out.println(prueba.larga() + " hasta 1-1-1900");
        prueba.fechaTras(3214);
        System.out.println("Tras 3214 dias transcurridos de 1-1-1900 la fecha sería " + prueba.larga());
        Fecha fecha = new Fecha();
        System.out.println("Introduzca otra fecha para calcular los dias transcurridos entre estas dos.");
        fecha.leer();
        System.out.println("Han transcurrido " + prueba.diasEntre(fecha) + " dias entre estas dos fechas.");
        System.out.println("El dia siguiente a " + prueba.larga() + " será ");
        prueba.siguente();
        System.out.print(prueba.larga() + " y el anterio ");
        prueba.anterior();
        prueba.anterior();
        System.out.println(prueba.larga());
        System.out.println("Introduzca una fecha para comprobar si esta es mayor que " + prueba.larga());
        fecha.leer();
        if (prueba.mayorQue(fecha))
            System.out.println(prueba.larga() + " es mayor que " + fecha.larga());
        else
            System.out.println(prueba.larga() + " no es mayor que " + fecha.larga());
        System.out.println("Introduzca una fecha para comrobar si esta es menor que " + prueba.larga());
        fecha.leer();
        if (prueba.menorQue(fecha))
            System.out.println(prueba.larga() + " es menor que " + fecha.larga());
        else
            System.out.println(prueba.larga() + " no es menor que " + fecha.larga());
        System.out.println("Introduzca una fecha para comprobar si esta es igual que " + prueba.larga());
        fecha.leer();
        if (prueba.igualQue(fecha))
            System.out.println(prueba.larga() + " es igual que " + fecha.larga());
        else
            System.out.println(prueba.larga() + " no es igual que " + fecha.larga());


    }
}
