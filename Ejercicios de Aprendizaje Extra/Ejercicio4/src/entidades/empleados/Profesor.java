package entidades.empleados;

import entidades.empleados.Empleado;

public class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, Integer dni, String estadoCivil, int annioIncorporacion, int numeroDespacho, String departamento) {
        super(nombre, apellidos, dni, estadoCivil, annioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                ", annioIncorporacion=" + annioIncorporacion +
                ", numeroDespacho=" + numeroDespacho +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni=" + dni +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
