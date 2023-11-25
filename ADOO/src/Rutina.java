
import java.util.*;

/**
 * 
 */
public abstract class Rutina {
    public Rutina() {
    }

    private List <Entrenamiento> entrenamiento;
    private String diasEntrenamiento;
    private Integer duracion;

    private Boolean cumplida;

    public Boolean seCumplio() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Boolean seCumplioCompleta() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Boolean entrenamientoCompleto() {
        // TODO implement here
        return null;
    }

    public List<Entrenamiento> getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(List<Entrenamiento> entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    public String getDiasEntrenamiento() {
        return diasEntrenamiento;
    }

    public void setDiasEntrenamiento(String diasEntrenamiento) {
        this.diasEntrenamiento = diasEntrenamiento;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Boolean getCumplida() {
        return cumplida;
    }

    public void setCumplida(Boolean cumplida) {
        this.cumplida = cumplida;
    }
}