package entidades;

public class Polideportivo extends Edificio{

    private String nombre;
    private TipoInstalacion tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, TipoInstalacion tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(TipoInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    public enum TipoInstalacion {
        TECHADO("Techado"),
        ABIERTO("Abierto");

        private final String instalacion;

        TipoInstalacion(String instalacion) {
            this.instalacion = instalacion;
        }

        public String getInstalacion() {
            return instalacion;
        }
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "nombre='" + nombre + '\'' +
                ", tipoInstalacion=" + tipoInstalacion +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }
}
