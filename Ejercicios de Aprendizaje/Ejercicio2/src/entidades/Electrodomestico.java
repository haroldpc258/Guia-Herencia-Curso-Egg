package entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, Character consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(Character letra) {

        letra = Character.toUpperCase(letra);

        if (letra>='A' && letra<'F') {
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {

        for (Color c : Color.values()) {
            if (c.getCOLOR().equalsIgnoreCase(color)) {
                this.color = c.getCOLOR();
                return;
            }
        }

        this.color = Color.BLANCO.getCOLOR();
    }

    public void crearElectrodomestico(Scanner scanner) {

        System.out.println("\nCREANDO ELECTRODOMÉSTICO: " + this.getClass().getSimpleName().toUpperCase());

        precio = 1000;

        System.out.print("Ingrese el Color: ");
        comprobarColor(scanner.next());

        System.out.print("Ingrese el Consumo Energético: ");
        comprobarConsumoEnergetico(scanner.next().charAt(0));

        System.out.print("Ingrese el Peso: ");
        peso = scanner.nextDouble();
    }

    public void precioFinal() {

        switch (consumoEnergetico) {
            case 'A': precio += 1000;
            break;
            case 'B': precio += 800;
            break;
            case 'C': precio += 600;
            break;
            case 'D': precio += 500;
            break;
            case 'E': precio += 300;
            break;
            case 'F': precio += 100;
        }

        if (peso > 0 && peso < 20) {
            precio += 100;
        } else if (peso < 50) {
            precio += 500;
        } else if (peso < 80) {
            precio += 800;
        } else {
            precio += 1000;
        }
    }

    private enum Color {
        BLANCO("Blanco"),
        NEGRO("Negro"),
        ROJO("Rojo"),
        AZUL("Azul"),
        GRIS("Gris");

        private final String COLOR;
        Color(String COLOR) {
            this.COLOR = COLOR;
        }

        public String getCOLOR() {
            return COLOR;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
