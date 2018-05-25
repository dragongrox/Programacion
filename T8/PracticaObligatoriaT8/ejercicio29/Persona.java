/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package T8.PracticaObligatoriaT8.ejercicio29;

import java.io.Serializable;

/**
 * Realiza  un  programa  que  almacene  y  recupere  un  objeto  persona  en  un  Fichero.  La  clase  persona  contiene  los
 * siguientes  atributos:
 *  Nombre.  Campo  alfanumérico.
 *  Apellidos.  Campo  alfanumérico.
 *  Teléfono.  Campo  numérico.
 * Utiliza,  para  ello,  un  fichero  de  objetos  persona  y  una  clase  serializable.
 * Intenta  ser  ordenado  y  crea  3  paquetes:  uno  para  los  métodos  y  clases
 * de  la  interfaz  gráfica  Swing,  otro  paquete  para  la  clase  serializable,  y  otro
 * paquete  para  el  manejo  del  fichero. Ten  en  cuenta  también  que  el  campo  Nombre
 * tendrá  10  caracteres  como  máximo,  el  campo  Apellido  tendrá  20
 * caracteres  como  máximo  y  el  Nif 7  u  8  números  seguidos  de  una  letra
 * mayúscula.  En  caso  de  que  no  se  cumplan  estas  condiciones,  una  ventana  emergente  (Cuadro  de  dialogo)
 * nos  avisará  de  nuestros  errores  y  no  se  volcará  la  información  al  fichero.
 */
public class Persona implements Serializable {
    String nombre, apellidos, telefono;

    public Persona(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
