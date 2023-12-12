package adoo;

import adoo.objetivo.Objetivo;
import adoo.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Socio implements Observer {
    private int edad;
    private String sexo;
    private Double altura;
    private Objetivo objetivo;
    private List<ITrofeoObserver> trofeos = new ArrayList<ITrofeoObserver>();
    private List<Medicion> mediciones = new ArrayList<Medicion>();
    private String user;
    private String password;
    private List<ITrofeoObserver> observers = new ArrayList<ITrofeoObserver>();
    private IAdapterMedicion medidor;




    public void registrarMedicion() {
        Medicion medicion = medidor.obtenerMedicion();
        this.mediciones.add(medicion);
    }

    public IAdapterMedicion getMedidor() {
        return medidor;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public void setTrofeos(List<ITrofeoObserver> trofeos) {
        this.trofeos = trofeos;
    }

    public void setMediciones(List<Medicion> mediciones) {
        this.mediciones = mediciones;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setObservers(List<ITrofeoObserver> observers) {
        this.observers = observers;
    }

    public void setMedidor(IAdapterMedicion medidor) {
        this.medidor = medidor;
    }

    public void cambiarObjetivo(Objetivo objetivo){
        this.objetivo = objetivo;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public List<ITrofeoObserver> getTrofeos() {
        return trofeos;
    }

    public List<Medicion> getMediciones() {
        return mediciones;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public List<ITrofeoObserver> getObservers() {
        return observers;
    }

    @Override
    public void update() {
    }
    public void ingresarDatosEjercicio(Ejercicio ejercicio) {
        // Verificar que el ejercicio es adecuado para el objetivo del socio
        if (objetivo.esEjercicioAdecuado(ejercicio)) {
            // Agregar el ejercicio a la lista de entrenamientos del objetivo del socio
            objetivo.agregarEntrenamiento(ejercicio);
        } else {
            // Imprimir un mensaje o lanzar una excepción si el ejercicio no es adecuado para el objetivo
            System.out.println("El ejercicio no es adecuado para el objetivo del socio.");
        }
    }

    public void marcarEntrenamientoCompleto(Entrenamiento entrenamiento) {
        entrenamiento.setCompleto(true);
    }

    public int setEdad(int i) {
        return edad;
    }

    public void entrenar(){
        this.objetivo.getRutina().completar(this.objetivo.getRutina().getEntrenamientos().getFirst());


        }

    public void ingresarDatosDeEjercicio() {
        Scanner scanner = new Scanner(System.in);
        List<Ejercicio> ejercicios = this.objetivo.getRutina().getEntrenamientos().getFirst().getEjercicios();
        int i = 1;
        for (Ejercicio ej : ejercicios){
            System.out.println(i + ej.getNombre());
            i += 1;
        }

        System.out.println("seleccione el ejercicio que desea ingresar los datos: ");
        int opcion = scanner.nextInt();
        Ejercicio ejercicioAIngresar = ejercicios.get(opcion-1);
        System.out.println("ingrese cantidad de series: ");
        int cantSeries = scanner.nextInt();
        System.out.println("ingrese cantidad de repeticiones: ");
        int cantRepes = scanner.nextInt();
        System.out.println("ingrese peso asignado: ");
        double cantPeso = scanner.nextDouble();

        ejercicioAIngresar.setPesoAsignado(cantPeso);
        ejercicioAIngresar.setRepeticiones(cantRepes);
        ejercicioAIngresar.setSeries(cantSeries);


    }

    public void reforzarEjercicio() {
        Scanner scanner = new Scanner(System.in);
        List<Ejercicio> ejercicios = this.objetivo.getRutina().getEntrenamientos().getFirst().getEjercicios();
        int i = 1;
        for (Ejercicio ej : ejercicios){
            System.out.println(i + ej.getNombre());
            i += 1;
        }

        System.out.println("seleccione el ejercicio que desea reforzar: ");
        int opcion = scanner.nextInt();
        Ejercicio ejercicioAIngresar = ejercicios.get(opcion-1);
        System.out.println("ingrese cantidad de series: ");
        int cantSeries = scanner.nextInt();
        System.out.println("ingrese cantidad de repeticiones: ");
        int cantRepes = scanner.nextInt();
        System.out.println("ingrese peso asignado: ");
        double cantPeso = scanner.nextDouble();

        ejercicioAIngresar.setPesoAsignado(cantPeso);
        ejercicioAIngresar.setRepeticiones(cantRepes);
        ejercicioAIngresar.setSeries(cantSeries);
    }
}


