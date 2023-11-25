import java.util.ArrayList;
import java.util.List;

public class LoggedUsersRepository {
    private static LoggedUsersRepository instance;

    private List<Socio> logged;

    private LoggedUsersRepository()  {
        this.logged = new ArrayList<>();
    }

    public static LoggedUsersRepository getInstance() {
        if(instance == null ){
            instance = new LoggedUsersRepository();
        }
        return instance;
    }

    public boolean isLogged( String user ){
        return this.logged.stream().anyMatch(socio -> socio.getUser().equals(user));
    }

    public void login(Socio socio) {
        this.logged.add(socio);
    }

    public void logout(Socio socio) {
        this.logged = this.logged.stream().filter( s -> s.getUser().equals(socio.getUser())).toList();
    }

}
