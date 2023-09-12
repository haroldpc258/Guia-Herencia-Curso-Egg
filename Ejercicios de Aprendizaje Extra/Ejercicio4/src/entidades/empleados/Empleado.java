package entidades.empleados;

import entidades.Persona;

public abstract class Empleado extends Persona {

    protected int annioIncorporacion;
    protected int numeroDespacho;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, Integer dni, String estadoCivil, int annioIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, dni, estadoCivil);
        this.annioIncorporacion = annioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnnioIncorporacion() {
        return annioIncorporacion;
    }

    public void setAnnioIncorporacion(int annioIncorporacion) {
        this.annioIncorporacion = annioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
}
