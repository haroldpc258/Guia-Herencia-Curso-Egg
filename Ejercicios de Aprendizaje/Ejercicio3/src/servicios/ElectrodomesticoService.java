package servicios;

import entidades.Electrodomestico;

import java.util.Scanner;

public class ElectrodomesticoService {

    protected void crearElectrodomestico(Scanner scanner, Electrodomestico electrodomestico) {

        System.out.println("\nCREANDO ELECTRODOMÉSTICO: " + electrodomestico.getClass().getSimpleName().toUpperCase());

        electrodomestico.setPrecio(1000);

        System.out.print("Ingrese el Color: ");
        comprobarColor(electrodomestico, scanner.next());

        System.out.print("Ingrese el Consumo Energético: ");
        comprobarConsumoEnergetico(electrodomestico, scanner.next().charAt(0));

        System.out.print("Ingrese el Peso: ");
        electrodomestico.setPeso(scanner.nextDouble());
    }

    private void comprobarConsumoEnergetico(Electrodomestico electrodomestico, Character letra) {

        letra = Character.toUpperCase(letra);

        if (letra>='A' && letra<'F') {
            electrodomestico.setConsumoEnergetico(letra);
        } else {
            electrodomestico.setConsumoEnergetico('F');
        }
    }

    private void comprobarColor(Electrodomestico electrodomestico, String color) {

        for (Color c : Color.values()) {
            if (c.getCOLOR().equalsIgnoreCase(color)) {
                electrodomestico.setColor(c.getCOLOR());
                return;
            }
        }

        electrodomestico.setColor(Color.BLANCO.getCOLOR());
    }

    protected void precioFinal(Electrodomestico electrodomestico) {

        int incremento = 0;
        switch (electrodomestico.getConsumoEnergetico()) {
            case 'A': incremento = 1000;
                break;
            case 'B': incremento = 800;
                break;
            case 'C': incremento = 600;
                break;
            case 'D': incremento = 500;
                break;
            case 'E': incremento = 300;
                break;
            case 'F': incremento = 100;
        }


        if (electrodomestico.getPeso() > 0 && electrodomestico.getPeso() < 20) {
            incremento += 100;
        } else if (electrodomestico.getPeso() < 50) {
            incremento += 500;
        } else if (electrodomestico.getPeso() < 80) {
            incremento += 800;
        } else {
            incremento += 1000;
        }

        electrodomestico.setPrecio(electrodomestico.getPrecio() + incremento);
    }

    public enum Color {
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
}
