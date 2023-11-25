import java.util.Optional;

/**
 * 
 */
public class LoginAdapter implements IAdapterLogin {

    private String user;
    private String password;
    /**
     * Default constructor
     */
    public LoginAdapter(String user, String password) {

        this.user = user;
        this.password = password;
    }

    /**
     * @return
     */
    public Optional<SocioDTO> login() {
        Optional<SocioDTO> socio = UsersRepository.getInstance().getUser(this.user,this.password);
        return socio;
    }

}