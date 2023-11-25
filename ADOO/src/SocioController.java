import java.util.Optional;

/**
 * 
 */
public class SocioController {

    /**
     * Default constructor
     */
    public SocioController() {
    }

    /**
     * @param Socio 
     * @return
     */
    public void crearSocio(SocioDTO Socio) {

    }

    /**
     * @param peso 
     * @param masaMuscular 
     * @param porcentajeGrasa 
     * @return
     */
    public Medicion obtenerMedicionInicial(Double peso, int masaMuscular, Double porcentajeGrasa) {
        // TODO implement here
        return null;
    }

    /**
     * @param user
     * @param password
     * @return
     */
    public void login(String user, String password) {
        LoginAdapter loginAdapter = new LoginAdapter(user,password);

        Optional<SocioDTO> socioDTO = loginAdapter.login();

        socioDTO.ifPresent( socio -> LoggedUsersRepository.getInstance().login( extractSocio(socio) ));

    }

    private Socio extractSocio(SocioDTO socio) {
        // obtener Trofeos
        // obtener Mediciones
        return null;
    }

}