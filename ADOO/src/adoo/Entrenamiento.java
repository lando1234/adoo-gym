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
    public boolean seCompleto() {
        return this.ejerciciosRealizados.size() == this.ejercicios.size();
    }

    public void ejercicioCompletado(Ejercicio ejercicio) {
        EjercicioRealizado ejercicioRealizado = new EjercicioRealizado();
        ejercicioRealizado.setNombre(ejercicio.getNombre());
        ejercicioRealizado.setExigenciaMuscular(ejercicio.getExigenciaMuscular());
        ejercicioRealizado.setNivelAerobico(ejercicio.getNivelAerobico());
        ejercicioRealizado.setDuracion(ejercicio.getDuracion());
        ejercicioRealizado.setPesoAsignado(20.5);
        ejercicioRealizado.setSeries(3);
        ejercicioRealizado.setRepeticiones(10);

        // Agregar el ejercicio realizado a la lista de ejercicios realizados
        this.ejerciciosRealizados.add(ejercicioRealizado);

        // Eliminar el ejercicio de la lista de ejercicios pendientes
        this.ejercicios.remove(ejercicio);
    }

    public Ejercicio comenzarProximo() {
        return this.ejercicios.get(0);
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public List<EjercicioRealizado> getEjerciciosRealizados() {
        return ejerciciosRealizados;
    }

    public void setEjerciciosRealizados(List<EjercicioRealizado> ejerciciosRealizados) {
        this.ejerciciosRealizados = ejerciciosRealizados;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Boolean getCompleto() {
        return completo;
    }

    public void setCompleto(Boolean completo) {
        this.completo = completo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrenamiento that = (Entrenamiento) o;
        return Objects.equals(ejercicios, that.ejercicios) && Objects.equals(ejerciciosRealizados, that.ejerciciosRealizados) && Objects.equals(fecha, that.fecha) && Objects.equals(completo, that.completo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ejercicios, ejerciciosRealizados, fecha, completo);
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }
}