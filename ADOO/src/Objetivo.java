
import java.util.*;

/**
 * 
 */
public abstract class Objetivo implements ObjetivoStrategy {


    private String nombre;
    private Integer duracionMax;
    private Boolean cumplido;
    private Integer duracionMin;
    private Rutina rutina;
    private int diasEntrenamiento;

    public List<Ejercicio> getListaEjercicios() {
        return listaEjercicios;
    }

    public List<Entrenamiento> getListaEntrenamientos() {
        return getListaEntrenamientos();
    }

    private List<Ejercicio> listaEjercicios;
    public Objetivo() {
    }
    public Rutina armarRutina() {
        return null;
    }

    public Boolean estaCumplido() {
        // TODO implement here
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracionMax() {
        return duracionMax;
    }

    public void setDuracionMax(Integer duracionMax) {
        this.duracionMax = duracionMax;
    }

    public Boolean getCumplido() {
        return cumplido;
    }

    public void setCumplido(Boolean cumplido) {
        this.cumplido = cumplido;
    }

    public Integer getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public int getDiasEntrenamiento() {
        return diasEntrenamiento;
    }

    public void setDiasEntrenamiento(int diasEntrenamiento) {
        this.diasEntrenamiento = diasEntrenamiento;
    }
}