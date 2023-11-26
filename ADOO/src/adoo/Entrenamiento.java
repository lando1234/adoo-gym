package adoo;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Entrenamiento {

    public Entrenamiento() {
    }

    private List<Ejercicio> ejercicios;
    private List<EjercicioRealizado> ejerciciosRealizados;
    private LocalDate fecha;
    private Boolean completo;

    public Entrenamiento(List<Ejercicio> ejercicios, LocalDate fecha){
        this.ejercicios = ejercicios;
        this.fecha = fecha;
        this.ejerciciosRealizados = new ArrayList<>();
    }
    public void seCompleto() {
        // TODO implement here
    }
    public Boolean ejercicioCompletado() {
        // TODO implement here
        return null;
    }
    public void comenzar() {
        // TODO implement here
    }

    public Entrenamiento armarEntrenamientoEspaldaBicep(List<Ejercicio> ejerciciosPermitidos){
        List<Ejercicio> ejercicios = new ArrayList<>();
        for (Ejercicio ejercicio : ejerciciosPermitidos) {
            GrupoMuscular grupoMuscular = ejercicio.getGrupoMuscular();
            // Filtrar por ESPALDA o BRAZOS
            if (grupoMuscular == GrupoMuscular.ESPALDA || grupoMuscular == GrupoMuscular.BRAZOS) {
                ejercicios.add(ejercicio);
            }
        }
        Entrenamiento entrenamientoEspaldaBicep = new Entrenamiento(ejercicios,LocalDate.now());
        return entrenamientoEspaldaBicep;
    }

    public Entrenamiento armarEntrenamientoPechoBrazos(List<Ejercicio> ejerciciosPermitidos) {
        List<Ejercicio> ejercicios = new ArrayList<>();
        for (Ejercicio ejercicio : ejerciciosPermitidos) {
            GrupoMuscular grupoMuscular = ejercicio.getGrupoMuscular();
            // Filtrar por PECHO o BRAZOS
            if (grupoMuscular == GrupoMuscular.PECHO || grupoMuscular == GrupoMuscular.BRAZOS) {
                ejercicios.add(ejercicio);
            }
        }
        Entrenamiento entrenamientoPechoBrazos = new Entrenamiento(ejercicios, LocalDate.now());
        return entrenamientoPechoBrazos;
    }

    public Entrenamiento armarEntrenamientoPiernasHombros(List<Ejercicio> ejerciciosPermitidos) {
        List<Ejercicio> ejercicios = new ArrayList<>();
        for (Ejercicio ejercicio : ejerciciosPermitidos) {
            GrupoMuscular grupoMuscular = ejercicio.getGrupoMuscular();
            // Filtrar por PIERNAS o HOMBROS
            if (grupoMuscular == GrupoMuscular.PIERNAS || grupoMuscular == GrupoMuscular.HOMBROS) {
                ejercicios.add(ejercicio);
            }
        }
        Entrenamiento entrenamientoPiernasHombros = new Entrenamiento(ejercicios, LocalDate.now());
        return entrenamientoPiernasHombros;
    }

    public void ejercicioCompletado(EjercicioRealizado ejercicio){
        this.ejerciciosRealizados.add(ejercicio);
    }

    public void completarEjercicio(Ejercicio ejercicioARealizar){
        EjercicioRealizado ejercicioRealizado = new EjercicioRealizado();
        ejercicioRealizado.setNombre(ejercicioARealizar.getNombre());
        ejercicioRealizado.setExigenciaMuscular(ejercicioARealizar.getExigenciaMuscular());
        ejercicioRealizado.setNivelAerobico(ejercicioARealizar.getNivelAerobico());
        ejercicioRealizado.setDuracion(ejercicioARealizar.getDuracion());
        ejercicioRealizado.setPesoAsignado(20.5);
        ejercicioRealizado.setSeries(3);
        ejercicioRealizado.setRepeticiones(10);

        ejercicioCompletado(ejercicioRealizado);
    }



}