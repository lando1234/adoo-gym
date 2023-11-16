
import java.util.*;

/**
 * 
 */
public abstract class Objetivo implements ObjetivoStrategy {

    /**
     * Default constructor
     */
    public Objetivo() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Integer duracionMax;


    /**
     * 
     */
    private Boolean cumplido;

    /**
     * 
     */
    private Integer duracionMin;

    /**
     * 
     */
    private Rutina rutina;


    /**
     * @return
     */
    public Rutina armarRutina() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Boolean estaCumplido() {
        // TODO implement here
        return null;
    }

}