package adoo.objetivo;

import adoo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class TonificarCuerpo extends Objetivo {
    private double masaMuscularIdeal;
    private double grasaCorporalIdeal;
    private List<Ejercicio> listaEjercicios;

    private List<Entrenamiento> listaEntrenamientos;



    /**
     * Default constructor
     */
    public TonificarCuerpo(double masaMuscularIdeal, double grasaCorporalIdeal) {
        listaEjercicios = new ArrayList<>();
        listaEntrenamientos = new ArrayList<>();
        this.masaMuscularIdeal = masaMuscularIdeal;
        this.grasaCorporalIdeal = grasaCorporalIdeal;
        inicializarEjercicios();
    }


    /**
     * @return
     */
    @Override
    public Boolean estaCumplido(Socio socio) {

        Medicion medicion = socio.getMediciones().get(socio.getMediciones().size()-1);

        return this.masaMuscularIdeal <= medicion.getMasaMuscular() && this.grasaCorporalIdeal >= medicion.getPorcentajeGrasa();
    }
    private void inicializarEjercicios() {
        // Ejemplos de ejercicios para cada grupo y objetivo
        listaEjercicios.add(new Ejercicio("tc 1", 30, 3, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("tc 2", 30, 4, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("tc 3", 30, 3, ExigenciaMuscular.ALTA, GrupoMuscular.PECHO));
        listaEjercicios.add(new Ejercicio("tc 4", 30, 4, ExigenciaMuscular.ALTA, GrupoMuscular.ESPALDA));
        listaEjercicios.add(new Ejercicio("tc 5", 30, 3, ExigenciaMuscular.ALTA, GrupoMuscular.HOMBROS));
        listaEjercicios.add(new Ejercicio("tc 6", 30, 4, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("tc 7", 30, 3, ExigenciaMuscular.ALTA, GrupoMuscular.BRAZOS));
        listaEjercicios.add(new Ejercicio("tc 8", 30, 4, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("tc 9", 30, 3, ExigenciaMuscular.ALTA, GrupoMuscular.BRAZOS));
        listaEjercicios.add(new Ejercicio("tc 10", 30, 2, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        listaEjercicios.add(new Ejercicio("tc 11", 30, 4, ExigenciaMuscular.ALTA, GrupoMuscular.ESPALDA));
        listaEjercicios.add(new Ejercicio("tc 12", 30, 2, ExigenciaMuscular.ALTA, GrupoMuscular.BRAZOS));
    }
}