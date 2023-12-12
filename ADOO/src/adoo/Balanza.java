package adoo;

/**
 * 
 */
public class Balanza {

    public Balanza() {
    }

    public double medirPeso() {
        double pesoPersona= 100*Math.random();
        return pesoPersona;
    }

    public int medirMasaMuscular() {
        //TODO agregar el random
        int masa = 10;
        return masa;
    }

    public double medirPorcentajeGrasa() {
        //TODO random
        double grasa= 5;
        return grasa;
    }



}