package adoo;

import java.util.*;

/**
 * 
 */
public class Rutina {


    private List <Entrenamiento> entrenamientos;
    private List<Entrenamiento> completados;
    private int diasEntrenamiento;
    private int duracion;

    private TrofeoConstancia trofeoConstancia;

    public Rutina(List<Entrenamiento> entrenamientos, int diasEntrenamiento, Socio socio) {
        this.entrenamientos=entrenamientos;
        this.diasEntrenamiento= diasEntrenamiento;
        this.duracion=4;
        this.completados = new ArrayList<>();
        this.trofeoConstancia = new TrofeoConstancia(socio);
    }
    public Boolean seCumplio() {
        return this.entrenamientos.isEmpty();
    }

    /**
     * @return
     */
    public void completar(Entrenamiento entrenamiento) {
        entrenamiento.comenzarProximo();
        if(entrenamiento.seCompleto()){
            this.entrenamientos.remove(entrenamiento);
            this.completados.add(entrenamiento);
        }
        if (this.entrenamientos.isEmpty()) {
            this.trofeoConstancia.cumplirObjetivo();
        }
    }

    public void reforzar(Integer repeticiones, double peso) {
        this.entrenamientos.forEach( entrenamiento -> {
            entrenamiento.getEjercicios().forEach( ejercicio -> ejercicio.setReforzado(new EjercicioReforzado(peso,repeticiones)));
        });
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

    public List<Entrenamiento> getEntrenamientos(){
        return this.entrenamientos;
    }

}