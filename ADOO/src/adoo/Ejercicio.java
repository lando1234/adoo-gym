package adoo;

/**
 * 
 */
public class Ejercicio extends Entrenamiento {

    public Ejercicio() {
    }
    private String nombre;
    private double duracion;
    private Integer nivelAerobico;
    private ExigenciaMuscular exigenciaMuscular;
    private GrupoMuscular grupoMuscular;
    private Integer series;
    private Integer repeticiones;
    private Double pesoAsignado;

    public Ejercicio(String nombre, double duracion, Integer nivelAerobico, ExigenciaMuscular exigenciaMuscular, GrupoMuscular grupoMuscular) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelAerobico = nivelAerobico;
        this.exigenciaMuscular = exigenciaMuscular;
        this.grupoMuscular = grupoMuscular;

    }
    @Override
    public String toString() {
        return "Ejercicio{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", nivelAerobico=" + nivelAerobico +
                ", exigenciaMuscular=" + exigenciaMuscular +
                ", grupoMuscular=" + grupoMuscular +
                '}';
    }

        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Integer getNivelAerobico() {
        return nivelAerobico;
    }

    public void setNivelAerobico(Integer nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public ExigenciaMuscular getExigenciaMuscular() {
        return this.exigenciaMuscular;
    }

    public void setExigenciaMuscular(ExigenciaMuscular exigenciaMuscular) {
        this.exigenciaMuscular = exigenciaMuscular;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(Integer repeticiones) {
        this.repeticiones = repeticiones;
    }

    public Double getPesoAsignado() {
        return pesoAsignado;
    }

    public void setPesoAsignado(Double pesoAsignado) {
        this.pesoAsignado = pesoAsignado;
    }

    public GrupoMuscular getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }
}