package entidades.extrahoteleros;

import entidades.Alojamiento;

public abstract class AlojamientoExtrahotelero extends Alojamiento {

    protected boolean privado;
    protected double cantidadMetros2;

    public AlojamientoExtrahotelero() {
    }

    public AlojamientoExtrahotelero(String nombre, String direccion, String localidad, String gerente, boolean privado, double cantidadMetros2) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantidadMetros2 = cantidadMetros2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getCantidadMetros2() {
        return cantidadMetros2;
    }

    public void setCantidadMetros2(double cantidadMetros2) {
        this.cantidadMetros2 = cantidadMetros2;
    }
}
