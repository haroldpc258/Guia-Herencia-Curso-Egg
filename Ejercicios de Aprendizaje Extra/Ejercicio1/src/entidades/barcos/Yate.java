package entidades.barcos;

public class Yate extends Barco{

    private double potencia;

    private int numeroCamarotes;

    public Yate() {
    }

    public Yate(String matricula, double espora, int anioFabricacion, double potencia, int numeroCamarotes) {
        super(matricula, espora, anioFabricacion);
        this.potencia = potencia;
        this.numeroCamarotes = numeroCamarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "potencia=" + potencia +
                ", numeroCamarotes=" + numeroCamarotes +
                ", matricula='" + matricula + '\'' +
                ", espora=" + espora +
                '}';
    }
}
