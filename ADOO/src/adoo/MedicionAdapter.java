package adoo;

import java.time.LocalDate;

public class MedicionAdapter implements IAdapterMedicion {

    private Balanza balanza;
    private double peso;
    private int masaMuscular;
    private double porcentajeGrasa;
    private LocalDate fecha;

    public MedicionAdapter(Balanza balanza, double peso, int masaMuscular, double porcentajeGrasa, LocalDate fecha) {
        this.balanza = balanza;
        this.peso = peso;
        this.masaMuscular = masaMuscular;
        this.porcentajeGrasa = porcentajeGrasa;
        this.fecha = fecha;
    }

    public Balanza getBalanza() {
        return balanza;
    }

    public void setBalanza(Balanza balanza) {
        this.balanza = balanza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(int masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public double getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    public void setPorcentajeGrasa(double porcentajeGrasa) {
        this.porcentajeGrasa = porcentajeGrasa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Medicion obtenerMedicion() {
        double peso = balanza.medirPeso();
        int masaMuscular = balanza.medirMasaMuscular();
        double porcentajeGrasa = balanza.medirPorcentajeGrasa();
        LocalDate fecha = LocalDate.now();

        Medicion medi = new Medicion(peso, masaMuscular, porcentajeGrasa, fecha);

        return medi;
    }
}
