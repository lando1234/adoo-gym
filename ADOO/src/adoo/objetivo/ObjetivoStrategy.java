package adoo.objetivo;

import adoo.Socio;

import java.util.*;

/**
 * 
 */
public interface ObjetivoStrategy {

    /**
     * @return
     */
    public Boolean estaCumplido(Socio socio);
    public void execute(Socio socio);

}