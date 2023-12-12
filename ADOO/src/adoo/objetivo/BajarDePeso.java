package adoo.objetivo;

import adoo.*;

import java.util.*;

/**
 * 
 */
public class BajarDePeso extends Objetivo {

    private double pesoIdeal;
    private int diasEntrenamiento;
    private Entrenamiento entrenamiento;
    private List<Ejercicio> listaEjercicios;
    private List<Entrenamiento> listaEntrenamientos;

    public BajarDePeso() {
        listaEjercicios = new ArrayList<>();
        listaEntrenamientos = new ArrayList<>();

        inicializarEjercicios();
    }
    @Override
    public Boolean estaCumplido(Socio socio) {
        this.trofeoDedicacion = new TrofeoDedicacion(socio);
        return socio.getMediciones().get(socio.getMediciones().size()-1).getPeso() <= this.pesoIdeal;
    }

    private void inicializarEjercicios() {
        // Ejemplos de ejercicios para cada grupo y objetivo
        listaEjercicios.add(new Ejercicio("Sentadillas", 30.0, 5, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Burpees", 20.0, 4, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Flexiones", 15.0, 3, ExigenciaMuscular.MEDIA, GrupoMuscular.PECHO));
        listaEjercicios.add(new Ejercicio("Dominadas", 45.0, 4, ExigenciaMuscular.ALTA, GrupoMuscular.ESPALDA));
        listaEjercicios.add(new Ejercicio("Press militar", 40.0, 3, ExigenciaMuscular.MEDIA, GrupoMuscular.HOMBROS));
        listaEjercicios.add(new Ejercicio("Caminata Ligera", 45.0, 4, ExigenciaMuscular.BAJA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Natación", 30.0, 3, ExigenciaMuscular.BAJA, GrupoMuscular.BRAZOS));
        listaEjercicios.add(new Ejercicio("Jumping Jacks", 20.0, 4, ExigenciaMuscular.MEDIA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Flexiones de tríceps", 25.0, 3, ExigenciaMuscular.ALTA, GrupoMuscular.BRAZOS));
        listaEjercicios.add(new Ejercicio("Zancadas", 35.0, 4, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("Remo con barra", 40.0, 4, ExigenciaMuscular.ALTA, GrupoMuscular.ESPALDA));
        listaEjercicios.add(new Ejercicio("Bíceps curls", 20.0, 3, ExigenciaMuscular.MEDIA, GrupoMuscular.BRAZOS));
    }
    @Override
    public boolean esEjercicioAdecuado(Ejercicio ejercicio) {
        // Verificar si el ejercicio es aeróbico y tiene un nivel igual o mayor a 3
        boolean esAerobico = ejercicio.getNivelAerobico() != null && ejercicio.getNivelAerobico() >= 3;

        // Verificar si la duración del ejercicio está entre 1 y 1.5 horas
        boolean duracionAdecuada = ejercicio.getDuracion() >= 60 && ejercicio.getDuracion() <= 90;

        // El ejercicio es adecuado si es aeróbico y tiene una duración adecuada
        return esAerobico && duracionAdecuada;
    }

}