package adoo;

/**
 * 
 */
public class TrofeoCreido extends ITrofeoObserver {
    public TrofeoCreido(Socio socio) {
        super(socio);
        this.descripcion = "Trofeo otorgado por pesarse muchas veces!";
        this.nombre = "Trofeo al creído";
    }
}