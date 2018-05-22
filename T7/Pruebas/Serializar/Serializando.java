package T7.Pruebas.Serializar;

import java.io.*;

public class Serializando {

    public void escribirObjeto(String ruta, Object[] objetos) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ruta));
            objectOutputStream.writeObject(objetos);
            objectOutputStream.close();
        } catch (IOException e) {
            e.getCause();
        }
    }

    public Object[] leerObjeto(String ruta) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ruta));
            Object[] objects = (Object[]) objectInputStream.readObject();
            return objects;
        } catch (IOException e) {
            e.getCause();
        } catch (ClassNotFoundException e) {
            e.getCause();
        }
        return null;
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Pepe", 18, 0);
        Persona persona1 = new Persona("Antonio", 22, 1);
        Persona persona2 = new Persona("Jose", 25, 2);
        Persona[] personas = {persona, persona1, persona2};
        Serializando serializando = new Serializando();
        serializando.escribirObjeto("C:\\Users\\drago\\Desktop\\objeto.dat", personas);
        personas = (Persona[]) serializando.leerObjeto("C:\\Users\\drago\\Desktop\\objeto.dat");
        for (Persona elemento : personas) {
            System.out.println(elemento.toString());
        }
    }
}

class Persona implements Serializable {
    String nombre;
    int edad, codigo;

    public Persona(String nombre, int edad, int codigo) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", codigo=" + codigo +
                '}';
    }
}
