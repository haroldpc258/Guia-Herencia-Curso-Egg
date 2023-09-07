package entidades.extrahoteleros;

public class Camping extends AlojamientoExtrahotelero{

    private int maxCapcidadCarpas;
    private int cantidadBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, double cantidadMetros2, int maxCapcidadCarpas, int cantidadBanios, boolean restaurante) {
        super(nombre, direccion, localidad, gerente, privado, cantidadMetros2);
        this.maxCapcidadCarpas = maxCapcidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    public int getMaxCapcidadCarpas() {
        return maxCapcidadCarpas;
    }

    public void setMaxCapcidadCarpas(int maxCapcidadCarpas) {
        this.maxCapcidadCarpas = maxCapcidadCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "maxCapcidadCarpas=" + maxCapcidadCarpas +
                ", cantidadBanios=" + cantidadBanios +
                ", restaurante=" + restaurante +
                ", privado=" + privado +
                ", cantidadMetros2=" + cantidadMetros2 +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
