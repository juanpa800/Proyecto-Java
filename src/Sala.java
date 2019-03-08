import java.util.*;
public class Sala {
    private static ArrayList<Sala> salas_ = new ArrayList<>();
    
    private int numeroDeSillas_;
    private int numeroDeLaSala_;
    private ArrayList<Funcion> funciones_ = new ArrayList<>();
    
    public Sala(int numeroDeSillas, int numeroDeLaSala){
        this.numeroDeSillas_ = numeroDeSillas;
        this.numeroDeLaSala_ = numeroDeLaSala;
        Sala.salas_.add(this);
    }
    
    public static void crearSala(int numeroDeSillas, int numeroDeLaSala){
        new Sala(numeroDeSillas, numeroDeLaSala);
    }
    
     public static ArrayList<Sala> getSalas_() {
        return salas_;
    }

    public int getNumeroDeSillas_() {
        return numeroDeSillas_;
    }

    public int getNumeroDeLaSala_() {
        return numeroDeLaSala_;
    }

    public ArrayList<Funcion> getFunciones_() {
        return funciones_;
    }
}
