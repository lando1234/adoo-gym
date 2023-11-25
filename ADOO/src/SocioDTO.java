import java.util.ArrayList;
import java.util.List;

public class SocioDTO {
    private int edad;
    private String sexo;
    private Double altura;
    private Objetivo objetivo;
    private String user;
    private String password;

    public SocioDTO(int edad, String sexo, Double altura, Objetivo objetivo,String user, String password) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.objetivo = objetivo;
        this.user = user;
        this.password = password;

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

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
