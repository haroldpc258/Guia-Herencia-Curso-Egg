package entidades.extrahoteleros;

public class Residencia extends AlojamientoExtrahotelero{

    private int cantidadHabitaciones;
    private boolean hacenDescuentos;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, double cantidadMetros2, int cantidadHabitaciones, boolean hacenDescuentos, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, cantidadMetros2);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.hacenDescuentos = hacenDescuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isHacenDescuentos() {
        return hacenDescuentos;
    }

    public void setHacenDescuentos(boolean hacenDescuentos) {
        this.hacenDescuentos = hacenDescuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "cantidadHabitaciones=" + cantidadHabitaciones +
                ", hacenDescuentos=" + hacenDescuentos +
                ", campoDeportivo=" + campoDeportivo +
                ", privado=" + privado +
                ", cantidadMetros2=" + cantidadMetros2 +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
