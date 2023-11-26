package adoo;

import adoo.objetivo.Objetivo;

import java.util.ArrayList;

/**
 * 
 */
public class ISocioObserverMedicion implements IAdapterLogin {

    /**
     * Default constructor
     */
    public ISocioObserverMedicion() {
    }

    /**
     * 
     */
    private Integer edad;

    /**
     * 
     */
    private String sexo;

    /**
     * 
     */
    private Double altura;

    /**
     * 
     */
    private Objetivo objetivo;


    /**
     * 
     */
    private ArrayList<ITrofeoObserver> trofeo;


    /**
     * 
     */
    private Boolean Login;

    /**
     * 
     */
    private ArrayList<Medicion> mediciones;

    /**
     * 
     */
    private String user;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private ArrayList<ITrofeoObserver> observadores;

    /**
     * @return
     */
    public void registrarMedicion() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Objetivo cambiarObjetivo() {
        // TODO implement here
        return null;
    }


    /**
     * @param Login 
     * @return
     */
    public Boolean login(Boolean Login) {
        // TODO implement here
        return null;
    }

}