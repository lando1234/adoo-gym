
import java.util.*;

/**
 * 
 */
public class Rutina {
    public Rutina(List<Entrenamiento> entrenamientos, int diasEntrenamiento) {
        this.entrenamientos=entrenamientos;
        this.diasEntrenamiento= diasEntrenamiento;
        this.duracion=4;
        this.cumplida = false;
    }

    private List <Entrenamiento> entrenamientos;
    private int diasEntrenamiento;
    private int duracion;
    private Boolean cumplida;
    private Entrenamiento entrenamiento;

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

    public int getDiasEntrenamiento() {
        return diasEntrenamiento;
    }

    public void setDiasEntrenamiento(int diasEntrenamiento) {
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