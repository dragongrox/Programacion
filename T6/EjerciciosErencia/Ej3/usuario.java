package T6.EjerciciosErencia.Ej3;

public class usuario {
    int numMensajes;
    String correoElectronico, nick;

    public usuario(int numMensajes, String correoElectronico, String nick) {
        this.numMensajes = numMensajes;
        this.correoElectronico = correoElectronico;
        this.nick = nick;
    }

    public int getNumMensajes() {
        return numMensajes;
    }

    public void setNumMensajes(int numMensajes) {
        this.numMensajes = numMensajes;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "usuario " +
                " nick=" + nick +
                " numMensajes=" + numMensajes +
                ", correoElectronico=" + correoElectronico + "\n";
    }


}
