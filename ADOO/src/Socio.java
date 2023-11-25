import java.util.ArrayList;
import java.util.List;

public class Socio {
    private int edad;
    private String sexo;
    private Double altura;
    private Objetivo objetivo;
    private List<ITrofeoObserver> trofeos = new ArrayList<ITrofeoObserver>();
    private List<Medicion> mediciones = new ArrayList<Medicion>();
    private String user;
    private String password;
    private List<ITrofeoObserver> observers = new ArrayList<ITrofeoObserver>();



    public void registrarMedicion(Medicion medicion) {
        this.mediciones.add(medicion);
    }

    public void cambiarObjetivo(Objetivo objetivo){
        this.objetivo = objetivo;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public List<ITrofeoObserver> getTrofeos() {
        return trofeos;
    }

    public List<Medicion> getMediciones() {
        return mediciones;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public List<ITrofeoObserver> getObservers() {
        return observers;
    }
}
