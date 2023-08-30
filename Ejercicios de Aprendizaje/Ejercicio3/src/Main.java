import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            electrodomesticos.add(new Lavadora(100*i, Electrodomestico.Color.values()[i].getCOLOR(), (char) (65+i), 20*i, 10*i));
        }

        for (int i = 0; i < 4; i++) {
            electrodomesticos.add(new Televisor(100*i, Electrodomestico.Color.values()[i].getCOLOR(), (char) (65+i), 20*i, 10*i, i % 2 == 0));
        }

        double precioTotal = 0;
        for (Electrodomestico e : electrodomesticos) {
            e.precioFinal();
            System.out.println("El precio del electrodoméstico tipo " + e.getClass().getSimpleName()
                    + " es: " + e.getPrecio());
            precioTotal += e.getPrecio();
        }

        System.out.println("El precio total por los electrodomésticos es: " + precioTotal);
    }
}