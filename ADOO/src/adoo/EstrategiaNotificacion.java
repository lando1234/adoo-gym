package adoo;

/**
 * 
 */
public interface EstrategiaNotificacion {

    /**
     * @param notificacion 
     * @return
     */
    public void enviar(Notificacion notificacion);

    void enviar(Socio socio, String nombre, String descripcion);
}