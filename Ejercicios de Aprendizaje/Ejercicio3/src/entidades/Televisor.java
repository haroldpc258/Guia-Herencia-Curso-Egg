package entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{

    private double resolucion;
    private boolean TDT;

    public Televisor() {
        crearTelevisor();
    }

    public Televisor(double precio, String color, Character consumoEnergetico, double peso, double resolucion, boolean TDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        crearElectrodomestico(scanner);

        System.out.print("Ingrese las pulgadas de Resolución: ");
        resolucion = scanner.nextDouble();

        System.out.print("Posee sintonizador TDT (s/n): ");
        TDT = scanner.next().equalsIgnoreCase("s");

        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (resolucion > 40) {
            precio *= 1.30;
        }
        if (TDT) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", TDT=" + TDT +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
