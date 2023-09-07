import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import servicios.ElectrodomesticoService;
import servicios.LavadoraService;
import servicios.TelevisorService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TelevisorService ts = new TelevisorService();
        LavadoraService ls = new LavadoraService();

        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            electrodomesticos.add(new Lavadora(100*i, ElectrodomesticoService.Color.values()[i].getCOLOR(), (char) (65+i), 20*i, 10*i));
        }

        for (int i = 0; i < 4; i++) {
            electrodomesticos.add(new Televisor(100*i, ElectrodomesticoService.Color.values()[i].getCOLOR(), (char) (65+i), 20*i, 10*i, i % 2 == 0));
        }

        double precioTotal = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;

        for (Electrodomestico e : electrodomesticos) {

            if (e instanceof Lavadora) {
                ls.precioFinal(e);
                precioLavadoras += e.getPrecio();
            }

            if (e instanceof Televisor) {
                ts.precioFinal(e);
                precioTelevisores += e.getPrecio();
            }

            precioTotal += e.getPrecio();
        }

        System.out.println("El precio por las Lavadoras es: " + precioLavadoras);
        System.out.println("El precio por los Televisores es: " + precioTelevisores);
        System.out.println("El precio total por los electrodomésticos es: " + precioTotal);
    }
}