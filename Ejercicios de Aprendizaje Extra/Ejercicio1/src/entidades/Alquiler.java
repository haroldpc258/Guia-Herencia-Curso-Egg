package entidades;

import entidades.barcos.Barco;

import java.time.LocalDate;

public class Alquiler {

    private String nombreCliente;
    private int documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private double valorAlquiler;
    private Barco barcoAlquilado;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, double valorAlquiler, Barco barcoAlquilado) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.valorAlquiler = valorAlquiler;
        this.barcoAlquilado = barcoAlquilado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public Barco getBarcoAlquilado() {
        return barcoAlquilado;
    }

    public void setBarcoAlquilado(Barco barcoAlquilado) {
        this.barcoAlquilado = barcoAlquilado;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", documentoCliente=" + documentoCliente +
                ", fechaAlquiler=" + fechaAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                ", posicionAmarre=" + posicionAmarre +
                ", valorAlquiler=" + valorAlquiler +
                ", barcoAlquilado=" + barcoAlquilado +
                '}';
    }
}
