package entidades;

public class EdificioDeOficinas extends Edificio{

    private int oficinasPorPiso;
    private int personasPorOficina;
    private int numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int oficinasPorPiso, int personasPorOficina, int numeroPisos) {
        super(ancho, alto, largo);
        this.oficinasPorPiso = oficinasPorPiso;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getOficinasPorPiso() {
        return oficinasPorPiso;
    }

    public void setOficinasPorPiso(int oficinasPorPiso) {
        this.oficinasPorPiso = oficinasPorPiso;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" +
                "numeroOficinas=" + oficinasPorPiso +
                ", personasPorOficina=" + personasPorOficina +
                ", numeroPisos=" + numeroPisos +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }
}
