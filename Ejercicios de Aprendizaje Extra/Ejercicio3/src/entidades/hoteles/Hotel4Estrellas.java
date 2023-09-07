package entidades.hoteles;

public class Hotel4Estrellas extends Hotel{

    protected tipoGimnasio gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurane;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, tipoGimnasio gimnasio, String nombreRestaurante, int capacidadRestaurane) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurane = capacidadRestaurane;
        calcularPrecioHabitacion();
    }

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, tipoGimnasio gimnasio, String nombreRestaurante, int capacidadRestaurane) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurane = capacidadRestaurane;
    }

    public tipoGimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(tipoGimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurane() {
        return capacidadRestaurane;
    }

    public void setCapacidadRestaurane(int capacidadRestaurane) {
        this.capacidadRestaurane = capacidadRestaurane;
    }

    public enum tipoGimnasio {
        A,
        B
    }

    public void calcularPrecioHabitacion() {
        int agregadoRestaurante = calcularAgregadoRestaurante();
        int agregadoGimnasio = calcularAgregadoGimnasio();

        precioHabitaciones = 50 + numeroCamas + agregadoRestaurante + agregadoGimnasio;
    }

    private int calcularAgregadoRestaurante() {
        if (capacidadRestaurane < 30) {
            return 10;
        }
        if (capacidadRestaurane <= 50) {
            return 30;
        }

        return 50;
    }

    private int calcularAgregadoGimnasio() {
        if (gimnasio.equals(tipoGimnasio.A)) {
            return 50;
        }

        return 30;
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" +
                "Gimnasio=" + gimnasio +
                ", nombreRestaurante='" + nombreRestaurante + '\'' +
                ", capacidadRestaurane=" + capacidadRestaurane +
                ", cantidadHabitaciones=" + cantidadHabitaciones +
                ", numeroCamas=" + numeroCamas +
                ", cantidadPisos=" + cantidadPisos +
                ", precioHabitaciones=" + precioHabitaciones +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
