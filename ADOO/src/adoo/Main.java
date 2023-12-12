package adoo;

import adoo.*;
import adoo.objetivo.BajarDePeso;
import adoo.objetivo.MantenerFigura;
import adoo.objetivo.TonificarCuerpo;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //Dar una bienvenida al sistema
        System.out.println("Bienvenidos a GYMSHARK");
        System.out.println(" ");
        System.out.println("Seleccione la opcion desdeada: 1-Registrarse 2-loguearse");
        int opcion = scanner.nextInt();
        SocioDTO socio = new SocioDTO();
        if(opcion ==1){
            socio = RegistrarSocio();
        }
        else{
            socio = LogInSocio();
        }
        MenuInterno(socio);

    }

    private static SocioDTO RegistrarSocio() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese la edad del socio:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el sexo del socio (M, F o -):");
        String sexo = scanner.next();
        System.out.println("Ingrese la altura del socio (mts):");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese el nombre de usuario del socio:");
        String user = scanner.next();
        System.out.println("Ingrese la contraseña del socio:");
        String password = scanner.next();

        // Crear un objeto SocioDTO con los datos ingresados
        SocioDTO nuevoSocio = new SocioDTO(edad, sexo, altura, user, password);

        // Mostrar información del socio registrado
        System.out.println("Socio registrado exitosamente:");
        System.out.println("Edad: " + nuevoSocio.getEdad());
        System.out.println("Sexo: " + nuevoSocio.getSexo());
        System.out.println("Altura: " + nuevoSocio.getAltura());
        System.out.println("Usuario: " + nuevoSocio.getUser());

        return nuevoSocio;
    }

    private static SocioDTO LogInSocio() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el nombre de usuario:");
        String user = scanner.next();

        System.out.println("Ingrese la contraseña:");
        String password = scanner.next();

        // Verificar la existencia del usuario en el UsersRepository
        UsersRepository UsersRespository = new UsersRepository(); // Asegúrate de tener esta clase implementada
        Optional<SocioDTO> usuarioExiste = UsersRespository.getUser(user, password);

        // Mostrar el resultado del login
        if (usuarioExiste.isPresent()) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + usuarioExiste.get().getUser() + "!");
            return usuarioExiste.get();
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, inténtelo nuevamente.");
            Optional<SocioDTO> usuario = Optional.of(LogInSocio());
            return usuario.get();
        }
    }

    public static void MenuInterno(SocioDTO socio) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle del menú
        while (true) {
            // Mostrar opciones al usuario
            System.out.println("Menú de opciones:");
            System.out.println("1. Medirse");
            System.out.println("2. Elegir objetivo");
            System.out.println("3. Entrenar");
            System.out.println("4. Salir");
            System.out.println("Ingrese el número de la opción deseada:");

            // Obtener la opción del usuario
            opcion = scanner.nextInt();

            // Realizar acciones según la opción seleccionada
            switch (opcion) {
                case 1:
                    RegistrarMedicion(socio);
                    break;
                case 2:
                    ElegirObjetivo(socio);
                    break;
                case 3:
                    MenuEntrenar(socio);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0); // Salir del programa
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }
    public static void MenuEntrenar(SocioDTO socio2){
        Socio socio = convertirSocioDTO(socio2);
        Scanner scanner = new Scanner(System.in);
        int opcionEntrenar;

        // Bucle del menú de entrenamiento
        while (true) {
            // Mostrar opciones de entrenamiento al usuario
            System.out.println("Menú de entrenamiento:");
            System.out.println("1. Entrenar");
            System.out.println("2. Ingresar datos de ejercicio");
            System.out.println("3. Reforzar ejercicio");
            System.out.println("4. Seleccionar entrenamiento");
            System.out.println("5. Volver al menú principal");
            System.out.println("Ingrese el número de la opción deseada:");

            // Obtener la opción del usuario
            opcionEntrenar = scanner.nextInt();

            // Realizar acciones de entrenamiento según la opción seleccionada
            switch (opcionEntrenar) {
                case 1:
                    socio.entrenar();
                    break;
                case 2:
                    socio.ingresarDatosDeEjercicio();
                    break;
                case 3:
                    socio.reforzarEjercicio();
                    break;
                case 4:
                    return; // Volver al menú principal

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }


    public static void RegistrarMedicion(SocioDTO socio) {
        Socio socioNormal = convertirSocioDTO(socio);
        socioNormal.registrarMedicion();
    }

    public static void ElegirObjetivo(SocioDTO socio) {
        Socio socioNormal = convertirSocioDTO(socio);

        System.out.println("Objetivos disponibles:");
        System.out.println("1. Tonificar Cuerpo");
        System.out.println("2. Mantener Figura");
        System.out.println("3. Bajar de Peso");

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.print("Elige un objetivo (1-3): ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 3);

        // Asigna el objetivo seleccionado al socio (reemplaza "socio" con el nombre de tu clase o instancia)
        switch (opcion) {
            case 1:
                TonificarCuerpo obj = new TonificarCuerpo();
                socioNormal.setObjetivo(obj);
                break;
            case 2:
                MantenerFigura obj2 = new MantenerFigura();
                socioNormal.setObjetivo(obj2);
                break;
            case 3:
                BajarDePeso obj3 = new BajarDePeso();
                socioNormal.setObjetivo(obj3);
                break;
            default:
                System.out.println("Opción no válida");
        }

        System.out.println("Objetivo seleccionado: " + socio.getObjetivo());
    }




    public static Socio convertirSocioDTO(SocioDTO socioDto){
        Socio socioNormal = new Socio();
        socioNormal.setEdad(socioDto.getEdad());
        socioNormal.setAltura(socioDto.getAltura());
        socioNormal.setSexo(socioDto.getSexo());
        socioNormal.setObjetivo(socioDto.getObjetivo());
        socioNormal.setPassword(socioDto.getPassword());
        socioNormal.setUser(socioDto.getUser());

        return socioNormal;
    }

}


