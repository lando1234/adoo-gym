package adoo;

/**
 * 
 */
public class TrofeoConstancia extends ITrofeoObserver {
    public TrofeoConstancia(Socio socio) {
        super(socio);
        this.descripcion = "Trofeo otorgado por cumplir la rutina a la perfección!";
        this.nombre = "Trofeo al constante";
    }
}