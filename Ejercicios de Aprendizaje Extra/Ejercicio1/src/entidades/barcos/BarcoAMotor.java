package entidades.barcos;

public class BarcoAMotor extends Barco{

    private double potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(String matricula, double espora, int anioFabricacion, double potencia) {
        super(matricula, espora, anioFabricacion);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" +
                "potencia=" + potencia +
                ", matricula='" + matricula + '\'' +
                ", espora=" + espora +
                '}';
    }
}
