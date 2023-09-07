package entidades.barcos;

public class Barco {

    protected String matricula;
    protected double espora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double espora, int anioFabricacion) {
        this.matricula = matricula;
        this.espora = espora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEspora() {
        return espora;
    }

    public void setEspora(double espora) {
        this.espora = espora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
