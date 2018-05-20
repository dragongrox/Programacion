package T6.Vehiculos_y_Subclases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
El programa principal, definido en la clase AgenciaAlquilar, realiza las siguientes funciones:
Crea 4 objetos de las clases Camion y Turismo pasándole al constructor los argumentos necesarios.
    Dichos datos se leen desde teclado y se comprobará cualquier tipo de inconsistencia
Se alquilan dos de los vehículos creados.
Se hace un listado de la situación todos los vehículos de la empresa.
Se devuelven los vehículos creados anteriormente.
 */
public class AgenciaAlquilar {
    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static boolean convertidor() throws IOException {
        String ret = entrada.readLine().toLowerCase();
        try {
            if (ret.matches("alquilado"))
                return true;
            else if (ret.matches("no alquilado"))
                return false;
            else throw new exeption("No es un dato valido");
        } catch (exeption a) {
            return convertidor();
        }
    }

    public static void main(String[] args) {
        boolean sw = true;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Camion camion = new Camion();
        Turismo turismo = new Turismo();
        Utilitarios utilitarios = new Utilitarios();
        Familiares familiares = new Familiares();
        do {
            try {
                System.out.println("Introduzca los datos del camion(matricula, alquilado/no alquilado,precio por dia");
                camion.setMatricula(entrada.readLine());
                camion.setAlquilado(convertidor());
                camion.precioDia = Double.parseDouble(entrada.readLine());
                sw = true;
            } catch (Exception a) {
                System.out.println("No es un dato valido");
                sw = false;
            }
        } while (sw == false);
        sw = true;
        do {
            try {
                System.out.println("Introduzca los datos del turismo(matricula, alquilado/no alquilado,precio del km");
                turismo.setMatricula(entrada.readLine());
                turismo.setAlquilado(convertidor());
                turismo.precioKm = Double.parseDouble(entrada.readLine());
                sw = true;
            } catch (Exception a) {
                System.out.println("No es un dato valido");
                sw = false;
            }
        } while (sw == false);
        sw = true;
        do {
            try {
                System.out.println("Introduzca los datos del turismo utilitario(matricula, alquilado/no alquilado,precio del km");
                utilitarios.setMatricula(entrada.readLine());
                utilitarios.setAlquilado(convertidor());
                utilitarios.precioKm = Double.parseDouble(entrada.readLine());
                sw = true;
            } catch (Exception a) {
                System.out.println("No es un dato valido");
                sw = false;
            }
        } while (sw == false);
        sw = true;
        do {
            try {
                System.out.println("Introduzca los datos del turismo utilitario(matricula, alquilado/no alquilado,precio del km");
                familiares.setMatricula(entrada.readLine());
                familiares.setAlquilado(convertidor());
                familiares.precioKm = Double.parseDouble(entrada.readLine());
                sw = true;
            } catch (Exception a) {
                System.out.println("No es un dato valido");
                sw = false;
            }
        } while (sw == false);
        int opc = 0;
        for (int cont = 0; cont < 2; cont++) {
            do {
                System.out.println("Introduzca uno que tipo de vehiculo quiere alquilar:\n" +
                        "1.Camion\n" +
                        "2.Turismo\n" +
                        "3.Turismo utilitario\n" +
                        "4.Turismo familiar\n");
                try {
                    opc = Integer.parseInt(entrada.readLine());
                } catch (IOException e) {
                    System.out.println("No es un valor valido");
                }
                try {
                    switch (opc) {
                        case 1:
                            System.out.println("Introduzca la fecha(dd/mm/aaaa): ");
                            String fecha = entrada.readLine();
                            Date calendar = dateFormat.parse(fecha);
                            camion.alquilar(calendar);
                            break;
                        case 2:
                            System.out.println("Introduzca los km recorridos: ");
                            turismo.alquilar(Integer.valueOf(entrada.readLine()));
                            break;
                        case 3:
                            System.out.println("Introduzca los km recorridos: ");
                            utilitarios.alquilar(Integer.valueOf(entrada.readLine()));
                            break;
                        case 4:
                            System.out.println("Introduzca los km recorridos: ");
                            familiares.alquilar(Integer.valueOf(entrada.readLine()));
                            break;
                        default:
                            System.out.println("No es una opcion valida.");
                    }
                } catch (IOException a) {
                    System.out.println("No es un valor valido.");
                } catch (ParseException u) {
                    System.out.println("No es un valor valido.");
                }

            } while (opc < 0 || opc > 5);
        }

        System.out.println("Estado de todos los vehiculos de la empresa: \n" +
                camion.showInfo() + "\n" + turismo.showInfo() + "\n" + utilitarios.showInfo() + "\n" + familiares.showInfo() + "\n");
        if (camion.alquilado) {
            System.out.println("Introduzca la fecha de devolucion(dd/mm/aaaa): ");
            String fecha = null;
            try {
                fecha = entrada.readLine();
                camion.devolver(camion.asignarFecha(fecha));
            } catch (IOException e) {
                System.out.println("No es un valor valido.");
            } catch (T6.Vehiculos_y_Subclases.exeption exeption) {
                exeption.printStackTrace();
            }
        }
        if (turismo.alquilado) {
            System.out.println("Introduzca el km de devolucion: ");
            try {
                turismo.devolver(Integer.parseInt(entrada.readLine()));
            } catch (IOException e) {
                System.out.println("No es un valor valido.");
            } catch (exeption s) {
                System.out.println("El km de devolucion no puede ser menor al km que se alquilo.");
            }
        }

        if (utilitarios.alquilado) {
            System.out.println("Introduzca el km de devolucion: ");
            try {
                utilitarios.devolver(Integer.parseInt(entrada.readLine()));
            } catch (IOException e) {
                System.out.println("No es un valor valido.");
            } catch (exeption s) {
                System.out.println("El km de devolucion no puede ser mayor al km que se alquilo.");
            }
        }

        if (familiares.alquilado) {
            System.out.println("Introduzca el km de devolucion: ");
            try {
                familiares.devolver(Integer.parseInt(entrada.readLine()));
            } catch (IOException e) {
                System.out.println("No es un valor valido.");
            } catch (exeption s) {
                System.out.println("El km de devolucion no puede ser mayor al km que se alquilo.");
            }
        }
    }
}
