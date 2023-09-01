package entidades.barcos;

public class Velero extends Barco{

    private int numeroMastiles;

    public Velero() {
    }

    public Velero(String matricula, double espora, int anioFabricacion, int numeroMastiles) {
        super(matricula, espora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numeroMastiles=" + numeroMastiles +
                ", matricula='" + matricula + '\'' +
                ", espora=" + espora +
                '}';
    }
}
