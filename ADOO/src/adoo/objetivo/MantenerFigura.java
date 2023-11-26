package adoo.objetivo;

import adoo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class MantenerFigura extends Objetivo {

    private Integer pesoOscila;
    private List<Ejercicio> listaEjercicios;

    private List<Entrenamiento> listaEntrenamientos;

    /**
     * Default constructor
     */
    public MantenerFigura(Integer pesoOscila) {
        listaEjercicios = new ArrayList<>();
        listaEntrenamientos = new ArrayList<>();
        this.pesoOscila = pesoOscila;

        inicializarEjercicios();
    }

    /**
     * @return
     */
    public Boolean estaCumplido() {
        // TODO implement here
        return null;
    }
    private void inicializarEjercicios() {
        // Ejemplos de ejercicios para cada grupo y objetivo
        listaEjercicios.add(new Ejercicio("Aerobico 1", 15, 3, ExigenciaMuscular.BAJA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Aerobico 2", 20, 4, ExigenciaMuscular.BAJA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Aerobico 3", 10, 3, ExigenciaMuscular.MEDIA, GrupoMuscular.PECHO));
        listaEjercicios.add(new Ejercicio("Aerobico 4", 15, 4, ExigenciaMuscular.BAJA, GrupoMuscular.ESPALDA));
        listaEjercicios.add(new Ejercicio("Aerobico 5", 15, 3, ExigenciaMuscular.MEDIA, GrupoMuscular.HOMBROS));
        listaEjercicios.add(new Ejercicio("Aerobico 6", 15, 4, ExigenciaMuscular.BAJA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Aerobico 7", 15, 3, ExigenciaMuscular.BAJA, GrupoMuscular.BRAZOS));
        listaEjercicios.add(new Ejercicio("Aerobico 8", 15, 4, ExigenciaMuscular.MEDIA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Aerobico 9", 15, 3, ExigenciaMuscular.MEDIA, GrupoMuscular.BRAZOS));
        listaEjercicios.add(new Ejercicio("Aerobico 10", 15, 2, ExigenciaMuscular.BAJA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Aerobico 11", 15, 4, ExigenciaMuscular.MEDIA, GrupoMuscular.ESPALDA));
        listaEjercicios.add(new Ejercicio("Aerobico 12", 15, 2, ExigenciaMuscular.MEDIA, GrupoMuscular.BRAZOS));
    }

}