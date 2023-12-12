package adoo;

import adoo.objetivo.Objetivo;

/**
 * 
 */
public class TrofeoDedicacion extends ITrofeoObserver {


    public TrofeoDedicacion(Socio socio) {
        super(socio);
        this.descripcion = "Trofeo otorgado por cumplir el objetivo!";
        this.nombre = "Trofeo a la dedicación";
    }

    /**
     * @return
     */
    public void chequearPremio() {
        // TODO implement here

    }

}