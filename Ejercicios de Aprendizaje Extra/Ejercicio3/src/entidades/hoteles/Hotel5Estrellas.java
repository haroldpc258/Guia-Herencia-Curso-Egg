package entidades.hoteles;

public final class Hotel5Estrellas extends Hotel4Estrellas{

    private int cantidadSalones;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, tipoGimnasio gimnasio, String nombreRestaurante, int capacidadRestaurane, int cantidadSalones, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, gimnasio, nombreRestaurante, capacidadRestaurane);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
        calcularPrecioHabitacion();
    }

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, tipoGimnasio gimnasio, String nombreRestaurante, int capacidadRestaurane, int cantidadSalones, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, gimnasio, nombreRestaurante, capacidadRestaurane);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(int cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public void calcularPrecioHabitacion() {
        super.calcularPrecioHabitacion();

        int agregadoLimosinas = calcularAgregadoLimosinas();
        precioHabitaciones = precioHabitaciones + agregadoLimosinas;
    }

    private int calcularAgregadoLimosinas() {
        return 15*cantidadLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" +
                "cantidadSalones=" + cantidadSalones +
                ", cantidadSuites=" + cantidadSuites +
                ", cantidadLimosinas=" + cantidadLimosinas +
                ", Gimnasio=" + gimnasio +
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
