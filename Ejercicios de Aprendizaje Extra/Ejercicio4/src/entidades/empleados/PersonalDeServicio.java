package entidades.empleados;

import entidades.empleados.Empleado;

public class PersonalDeServicio extends Empleado {

    private String seccionAsignada;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String nombre, String apellidos, Integer dni, String estadoCivil, int annioIncorporacion, int numeroDespacho, String seccionAsignada) {
        super(nombre, apellidos, dni, estadoCivil, annioIncorporacion, numeroDespacho);
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" +
                "seccionAsignada='" + seccionAsignada + '\'' +
                ", annioIncorporacion=" + annioIncorporacion +
                ", numeroDespacho=" + numeroDespacho +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni=" + dni +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
