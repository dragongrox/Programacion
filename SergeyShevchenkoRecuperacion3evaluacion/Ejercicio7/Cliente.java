package SergeyShevchenkoRecuperacion3evaluacion.Ejercicio7;

import java.io.*;
import java.util.Scanner;

public class Cliente implements Serializable {

    static Cliente[] clientes;

    protected static void tratamientoDatos(int opc, String ruta) {
        int cont = 0;
        float deuda = 0;
        switch (opc) {
            case 1:
                for (Cliente elemento : leerObjeto(ruta)) {
                    if (elemento.sexo == 'H')
                        cont++;
                }
                System.out.println("Hay " + cont + " hombres.");
                break;
            case 2:
                for (Cliente elemento : leerObjeto(ruta)) {
                    if (elemento.sexo == 'M')
                        cont++;
                }
                System.out.println("Hay " + cont + " mujeres.");
                break;
            case 3:
                System.out.println("Hay " + leerObjeto(ruta).length + " clientes");
                break;
            case 4:
                for (Cliente elemento : leerObjeto(ruta)) {
                    if (elemento.sexo == 'H')
                        deuda += elemento.deuda;
                }
                System.out.println("La deuda de los hombre es de " + deuda);
                break;
            case 5:
                for (Cliente elemento : leerObjeto(ruta)) {
                    if (elemento.sexo == 'M')
                        deuda += elemento.deuda;
                }
                System.out.println("La deuda de las mujeres es de " + deuda);
                break;
            case 6:
                for (Cliente elemento : leerObjeto(ruta)) {
                    deuda += elemento.deuda;
                }
                System.out.println("La deuda total es de  " + deuda);
                break;
            case 7:
                for (Cliente elemento : leerObjeto(ruta)) {
                    if (elemento.sexo == 'H') {
                        deuda += elemento.deuda;
                        cont++;
                    }
                }
                System.out.println("La deuda media de los hombres es de " + (deuda / cont));
                break;
            case 8:
                for (Cliente elemento : leerObjeto(ruta)) {
                    if (elemento.sexo == 'M') {
                        deuda += elemento.deuda;
                        cont++;
                    }
                }
                System.out.println("La deuda media de las mujeres es de " + (deuda / cont));
                break;
            case 9:
                for (Cliente elemento : leerObjeto(ruta)) {
                    deuda += elemento.deuda;
                }
                System.out.println("La deuda media de las mujeres es de " + (deuda / leerObjeto(ruta).length));
                break;
            case 10:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduzca el numero del NIF a buscar.");
                int nif = scanner.nextInt();
                for (Cliente elemento : leerObjeto(ruta)) {
                    if (elemento.NIF.substring(1).matches(String.valueOf(nif))) {
                        System.out.println("Se ha encontrado el cliente.");
                        cont++;
                    }
                }
                if (cont == 0) {
                    System.out.println("No se encontro el elemento");
                }
                break;
            default:
                System.out.println("No es una opcion valida.");
        }
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int opc = 1;
        try {
            clientes = new Cliente[]{new Cliente("y45678912", "Antonio", "321456789", "Almeria C Murcia 53", 'H', 23.56f),
                    new Cliente("y34258697", "Maria", "789456321", "Almeria C Murcia 53", 'M', 25.45f),
                    new Cliente("g95184726", "Antonia", "789456321", "Almeria C Murcia 53", 'M', 100.45f),
                    new Cliente("d98745613", "Antonio", "789456321", "Almeria C Murcia 53", 'H', 10.45f)};
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File("");
        String ruta = file.getAbsolutePath() + "\\clientes.dat";
        escribirObjeto(ruta, clientes);
        do {
            System.out.println("1.Listar clientes.\n" +
                    "2.Buscar clientes.\n" +
                    "3.Borrar cliente.\n" +
                    "4.Borrar fichero de clientes completamente.\n" +
                    "5.Tratamiento de datos.\n" +
                    "6.Salir de la aplicacion.");
            try {
                opc = Integer.valueOf(bufferedReader.readLine());
            } catch (IOException e) {
                System.out.println("Se ha producido el siguiente error: " + e.getCause());
            } catch (NumberFormatException e) {
                System.out.println("Se ha producido el siguiente error: " + e.getCause());
            }
            switch (opc) {
                case 1:
                    try {
                        for (Cliente elemento : leerObjeto(ruta))
                            System.out.println(elemento.toString());
                    } catch (NullPointerException e) {
                        System.out.println("No se encuentra el archivo clientes.dat");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el NIF a buscar: ");
                    String nif = "";
                    try {
                        nif = bufferedReader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (buscarCliente(ruta, nif))
                        System.out.println("Se encontro el Cliente");
                    else System.out.println("No se encontro el cliente");
                    break;
                case 3:
                    System.out.println("Introduzca el NIF a borrar: ");
                    String nif1 = "";
                    try {
                        nif1 = bufferedReader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    int cont = 0;
                    Cliente[] clientesCopia = new Cliente[leerObjeto(ruta).length - 1];
                    if (buscarCliente(ruta, nif1)) {
                        for (Cliente elemento : leerObjeto(ruta)) {
                            if (!elemento.NIF.matches(nif1)) {
                                clientesCopia[cont] = elemento;
                                cont++;
                            }
                        }
                    } else System.out.println("El cliente no existe");
                    escribirObjeto(ruta, clientesCopia);
                    break;
                case 4:
                    File file1 = new File(ruta);
                    file1.delete();
                    break;
                case 5:
                    System.out.println("1.Nº de hombres\n" +
                            "2.Nº de mujeres\n" +
                            "3.Nº de clientes\n" +
                            "4.Total deuda acumulada por clientes hombres\n" +
                            "5.Total deuda acumulada por clientes mujeres\n" +
                            "6.Total deuda acumulada\n" +
                            "7.Deuda media de los hombres\n" +
                            "8.Deuda media de las mujeres\n" +
                            "9.Deuda media\n" +
                            "10.Busqueda de un cliente por su numero de HIF");
                    try {
                        tratamientoDatos(Integer.valueOf(bufferedReader.readLine()), ruta);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("No es una opcion valida.");
            }
        } while (opc != 6);
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean buscarCliente(String ruta, String nif) {
        for (Cliente elemento : leerObjeto(ruta))
            if (elemento.NIF.matches(nif)) {
                return true;
            }
        return false;
    }

    String NIF, nombre, telefono, direccion;
    char sexo;
    float deuda;

    public Cliente(String NIF, String nombre, String telefono, String direccion, char sexo, float deuda) throws Exception {
        this.NIF = NIF;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;

        if (sexo == 'H' || sexo == 'M')
            this.sexo = sexo;
        else throw new Exception("No es un caracter valido");
        this.deuda = deuda;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "NIF=" + NIF +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", sexo=" + sexo +
                ", deuda=" + deuda +
                '}';
    }

    public static void escribirObjeto(String ruta, Cliente[] objetos) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ruta));
            objectOutputStream.writeObject(objetos);
            objectOutputStream.close();
        } catch (IOException e) {
            e.getCause();
        }
    }

    public static Cliente[] leerObjeto(String ruta) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ruta));
            Cliente[] objects = (Cliente[]) objectInputStream.readObject();
            return objects;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.getCause();
        }
        return null;
    }
}
