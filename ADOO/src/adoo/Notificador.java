package adoo;

/**
 * 
 */
public class Notificador implements EstrategiaNotificacion {

    /**
     * Default constructor
     */
    public Notificador() {
    }

    /**
     * 
     */
    private Notificacion notificacion;

    /**
     * 
     */
    private EstrategiaNotificacion estrategia;

    /**
     * @param estrategia_nueva 
     * @return
     */
    public void cambiarEstrategia(EstrategiaNotificacion estrategia_nueva) {
        // TODO implement here
    }

    /**
     * @param notificacion 
     * @return
     */
    public void enviar(Notificacion notificacion) {
        //TODO notificar
    }

    @Override
    public void enviar(Socio socio, String nombre, String descripcion) {
        Notificacion noti = new Notificacion(descripcion,nombre,socio);
        this.enviar(notificacion);
    }

}