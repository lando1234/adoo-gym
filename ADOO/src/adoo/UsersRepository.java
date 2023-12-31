package adoo;

import adoo.objetivo.BajarDePeso;
import adoo.objetivo.MantenerFigura;
import adoo.objetivo.TonificarCuerpo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersRepository {
    private static UsersRepository instance;

    private List<SocioDTO> users;

    UsersRepository() {
      this.users = new ArrayList<>();
      this.users.add(new SocioDTO(
              20,
              "M",
              1.8,
              new TonificarCuerpo(80, 5),
              "fran",
              "fran"));

        this.users.add(new SocioDTO(
                22,
                "M",
                1.5,
                new BajarDePeso(),
                "juan",
                "juan"));
        this.users.add(new SocioDTO(
                24,
                "M",
                1.6,
                new MantenerFigura(80,4),
                "mati",
                "mati"));
    }

    public static UsersRepository getInstance() {
        if( instance == null ){
            instance = new UsersRepository();
        }
        return instance;
    }

    public Optional<SocioDTO> getUser(String user, String password) {
        return this.users.stream().filter( u -> u.getUser().equals(user) && u.getPassword().equals(password)).findFirst();
    }


}
