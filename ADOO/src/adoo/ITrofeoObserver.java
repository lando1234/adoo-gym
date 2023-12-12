package adoo;

/**
 * 
 */
public abstract class ITrofeoObserver {

    public ITrofeoObserver() {
    }
    protected String nombre;
    protected String descripcion;
    private Notificador notificador;

    private Socio socio;

    public ITrofeoObserver(Socio socio) {
        this.socio = socio;
        this.notificador = new Notificador();
    }

    public void cumplirObjetivo() {
        this.notificador.enviar(socio, nombre, descripcion);
    }
}