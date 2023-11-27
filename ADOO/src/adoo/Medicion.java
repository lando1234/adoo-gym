package adoo;

import java.time.LocalDate;

/**
 * 
 */
public class Medicion implements IAdapterMedicion {

    private double peso;
    private int masaMuscular;
    private double porcentajeGrasa;
    private LocalDate fecha;

    private MedicionAdapter medicionAdapter;

    public Medicion() {
    }

    public Medicion(double peso, int masaMuscular, double porcentajeGrasa, LocalDate fecha) {
        this.fecha = fecha;
        this.peso = peso;
        this.masaMuscular = masaMuscular;
        this.porcentajeGrasa = porcentajeGrasa;
    }

    public Medicion obtenerMedicion() {
        Medicion medi = medicionAdapter.obtenerMedicion();
        return medi;
    }

    /**
     * 
     */
    public void obtenerTrofeoSocio() {
        // TODO implement here
    }

    public double getPeso() {
        return peso;
    }

    public int getMasaMuscular() {
        return masaMuscular;
    }

    public double getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public MedicionAdapter getMedicionAdapter() {
        return medicionAdapter;
    }
}