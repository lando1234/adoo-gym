package adoo;

import java.util.*;

/**
 * 
 */
public class Notificacion {

    /**
     * Default constructor
     */

    private String mensaje;
    private String nombre;
    private Socio socio;

    public Notificacion(String mensaje, String nombre, Socio socio) {
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.socio = socio;
    }
}