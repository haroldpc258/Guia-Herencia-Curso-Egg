package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{

    private double carga;

    public Lavadora() {
        crearLavadora();
    }

    public Lavadora(double precio, String color, Character consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        crearElectrodomestico(scanner);

        System.out.print("Ingrese la Carga: ");
        carga = scanner.nextDouble();

        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (carga > 30) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
