package adoo.objetivo;

import adoo.Ejercicio;
import adoo.Entrenamiento;
import adoo.Rutina;
import adoo.Socio;

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

    public void armarRutina(Integer dias) {
        Integer tiempoMin = this.duracionMin;
        Integer tiempoMax = this.duracionMax;
        List<Entrenamiento> entrenamientos = new ArrayList<>();
        Integer aux = 0;
        List<Ejercicio> listAux = new ArrayList<>();
        for(Ejercicio ejercicio : this.listaEjercicios) {
            if( aux + ejercicio.getDuracion() < tiempoMax ) {
                listAux.add(ejercicio);
            } else {
                if( aux > tiempoMin){
                    entrenamientos.add(new Entrenamiento(listAux, null));
                    listAux = new ArrayList<>();
                    aux = 0;
                }
            }
        }



        this.rutina = new Rutina(entrenamientos, dias);
    }

    @Override
    public void execute(Socio socio) {

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