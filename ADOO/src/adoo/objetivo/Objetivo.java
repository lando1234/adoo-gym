package adoo.objetivo;

import adoo.*;

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

    protected TrofeoDedicacion trofeoDedicacion;



    public void armarRutina(Integer dias, Socio socio) {
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



        this.rutina = new Rutina(entrenamientos, dias, socio);
    }

    @Override
    public void execute(Socio socio) {
        if( this.rutina.seCumplio()) {
            this.trofeoDedicacion.cumplirObjetivo();
        }
    }
    public boolean esEjercicioAdecuado(Ejercicio ejercicio) {
        // Implementa la lógica según los criterios del objetivo
        // Puedes verificar el tipo de objetivo (BajarDePeso, MantenerFigura, TonificarCuerpo) y aplicar criterios específicos
        // Por ejemplo, en BajarDePeso, podría verificar el nivel aeróbico, exigencia muscular, etc.
        // Retorna true si el ejercicio es adecuado, false en caso contrario.

        // Ejemplo simple para cualquier objetivo (puedes ajustar según tus necesidades)
        return ejercicio.getNivelAerobico() <= 3 && ejercicio.getExigenciaMuscular() == ExigenciaMuscular.ALTA;
    }
    public void agregarEntrenamiento(Entrenamiento entrenamiento) {
        // Agrega la lógica para agregar el entrenamiento específico del objetivo
        // En este caso, agrega el ejercicio a la lista de ejercicios del objetivo
        if (entrenamiento instanceof Ejercicio) {
            listaEjercicios.add((Ejercicio) entrenamiento);
        } else {
            // Manejar otro tipo de entrenamiento si es necesario
        }
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