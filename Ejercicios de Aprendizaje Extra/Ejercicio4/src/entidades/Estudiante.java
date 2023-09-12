package entidades;

public class Estudiante extends Persona{

    private String Curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, Integer dni, String estadoCivil, String curso) {
        super(nombre, apellidos, dni, estadoCivil);
        Curso = curso;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Curso='" + Curso + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni=" + dni +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
