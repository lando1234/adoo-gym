package adoo;

import java.time.LocalDate;

public class MedicionAdapter implements IAdapterMedicion{

    private Balanza balanza;
    private double peso;
    private int masaMuscular;
    private double porcentajeGrasa;
    private LocalDate fecha;


    public MedicionAdapter(double peso, int masaMuscular, double porcentajeGrasa, LocalDate fecha){
        this.peso=peso;
        this.masaMuscular=masaMuscular;
        this.porcentajeGrasa=porcentajeGrasa;
        this.fecha=fecha;
    }
    public Medicion obtenerMedicion() {
        double peso = balanza.medirPeso();
        int masaMuscular = balanza.medirMasaMuscular();
        double porcentajeGrasa = balanza.medirPorcentajeGrasa();
        LocalDate fecha = LocalDate.parse("2023-11-25");

        Medicion medi = new Medicion(peso, masaMuscular, porcentajeGrasa, fecha);

        return medi;
    }
}
