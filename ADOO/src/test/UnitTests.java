package test;

import adoo.*;
import adoo.objetivo.BajarDePeso;
import adoo.objetivo.Objetivo;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class UnitTests {

    @Test
    public void socioEligeUnObjetivo() {
        // Crear un socio de prueba
        Socio socio = new Socio();
        socio.setEdad(25);
        socio.setSexo("Masculino");
        socio.setAltura(1.75);
        socio.setUser("user1");
        socio.setPassword("1234");


        // Crear un objetivo de prueba
        Objetivo objetivo = new BajarDePeso();
        socio.cambiarObjetivo(objetivo);

        // Imprimir información por consola
        System.out.println("Socio: " + socio);
        System.out.println("Objetivo: " + socio.getObjetivo());

        // Verificar que el socio tenga el objetivo correcto
        assertEquals(objetivo, socio.getObjetivo());
    }


    @Test

    public void socioRegistraMedicion() {
        // Crear un socio de prueba
        Socio socio = new Socio();
        socio.setEdad(25);
        socio.setSexo("Masculino");
        socio.setAltura(1.75);
        socio.setUser("user1");


        // Crear una instancia de Balanza
        Balanza balanza = new Balanza();

        // Crear una medición de prueba (puedes ajustar los valores según tus necesidades)
        MedicionAdapter medicionAdapter = new MedicionAdapter(balanza, 70.5, 25, 15.5, LocalDate.now());

        // Establecer el medidor del socio
        socio.setMedidor(medicionAdapter);

        // Registrar la medición
        socio.registrarMedicion();

        // Imprimir información del socio y la medición
        System.out.println("Información del Socio:");
        System.out.println("Edad: " + socio.getEdad());
        System.out.println("Sexo: " + socio.getSexo());
        System.out.println("Altura: " + socio.getAltura());
        System.out.println("Usuario: " + socio.getUser());
        System.out.println("Mediciones del Socio: " + socio.getMediciones());

        System.out.println("\nInformación de la Medición:");
        System.out.println("Peso: " + medicionAdapter.getPeso());
        System.out.println("Masa Muscular: " + medicionAdapter.getMasaMuscular());
        System.out.println("Porcentaje Grasa: " + medicionAdapter.getPorcentajeGrasa());
        System.out.println("Fecha de la Medición: " + LocalDate.now());
        System.out.println("Medición obtenida: " + medicionAdapter.obtenerMedicion());
    }

    @Test

    public void socioIngresaDatosEjercicio() {
        // Crear un socio de prueba con un objetivo específico
        Socio socio = new Socio();
        socio.setEdad(25);
        socio.setSexo("Masculino");
        socio.setAltura(1.75);
        socio.setUser("user1");
        socio.setPassword("1234");

        // Crear un objetivo específico (puedes ajustar según tus necesidades)
        Objetivo objetivo = new BajarDePeso();
        socio.cambiarObjetivo(objetivo);

        // Crear una instancia de Ejercicio (puedes ajustar según tus necesidades)
        Ejercicio ejercicio = new Ejercicio("Sentadillas", 30.0, 5, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS);

        // Socio ingresa datos del ejercicio si es adecuado para el objetivo
        if (socio.getObjetivo().esEjercicioAdecuado(ejercicio)) {
            socio.ingresarDatosEjercicio(ejercicio);

        }
        System.out.println(ejercicio);
    }
 @Test
    public void socioMarcaEntrenamientoCompleto() {
        // Crear un socio de prueba con un objetivo específico
        Socio socio = new Socio();
        socio.setEdad(25);
        socio.setSexo("Masculino");
        socio.setAltura(1.75);
        socio.setUser("user1");
        socio.setPassword("1234");

        // Crear un objetivo específico (puedes ajustar según tus necesidades)
        Objetivo objetivo = new BajarDePeso();
        socio.cambiarObjetivo(objetivo);

        // Crear una lista de ejercicios para el entrenamiento
        List<Ejercicio> ejerciciosEntrenamiento = new ArrayList<>();
        ejerciciosEntrenamiento.add(new Ejercicio("Sentadillas", 30.0, 5, ExigenciaMuscular.ALTA, GrupoMuscular.PIERNAS));
        ejerciciosEntrenamiento.add(new Ejercicio("Flexiones", 15.0, 3, ExigenciaMuscular.MEDIA, GrupoMuscular.PECHO));

        // Crear una instancia de Entrenamiento
        Entrenamiento entrenamiento = new Entrenamiento(ejerciciosEntrenamiento, LocalDate.now());

        // Marcar cada ejercicio como completado
        for (Ejercicio ejercicio : ejerciciosEntrenamiento) {
            entrenamiento.ejercicioCompletado(ejercicio);
        }

        // Marcar el entrenamiento como completo
        socio.marcarEntrenamientoCompleto(entrenamiento);
     System.out.println("Entrenamiento marcado como completo");
    }



    @Test
    public void socioRecibeTrofeo(){
        //que sea cualquier trofeo y que lo otorgue
    }

}
