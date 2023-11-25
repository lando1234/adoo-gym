
import java.util.*;

/**
 * 
 */
public class BajarDePeso extends Objetivo {

    private double pesoIdeal;
    private Medicion medicionInicial;
    private Socio socio;
    private Rutina rutina;
    private int diasEntrenamiento;
    private Entrenamiento entrenamiento;
    private List<Ejercicio> listaEjercicios;
    private List<Entrenamiento> listaEntrenamientos;

    public BajarDePeso() {
        listaEjercicios = new ArrayList<>();
        listaEntrenamientos = new ArrayList<>();

        inicializarEjercicios();
    }

    public Boolean estaCumplido() {
        // TODO implement here
        return null;
    }
    public void obtenerRutinaObjetivo(){
        List<Entrenamiento> entrenamientos = new ArrayList<>();
        entrenamientos.add(entrenamiento.armarEntrenamientoPiernasHombros(listaEjercicios));
        entrenamientos.add(entrenamiento.armarEntrenamientoEspaldaBicep(listaEjercicios));
        entrenamientos.add(entrenamiento.armarEntrenamientoPechoBrazos(listaEjercicios));

        Rutina rutinaElaborada = new Rutina(entrenamientos,this.diasEntrenamiento);
        this.rutina= rutinaElaborada;
    }

    public void calcularPesoIdeal(Socio socio){

    }

    private List<Ejercicio> obtenerEjercicios() {
        return listaEjercicios;
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
}