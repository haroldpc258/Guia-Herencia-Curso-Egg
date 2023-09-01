package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;

import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService{

    public Lavadora crearLavadora(Scanner scanner) {

        Lavadora nuevaLavadora = new Lavadora();

        crearElectrodomestico(scanner, nuevaLavadora);

        System.out.print("Ingrese la Carga: ");
        nuevaLavadora.setCarga(scanner.nextDouble());

        precioFinal(nuevaLavadora);

        return nuevaLavadora;
    }

    @Override
    public void precioFinal(Electrodomestico nuevaLavadora) {
        super.precioFinal(nuevaLavadora);

        if (((Lavadora) nuevaLavadora).getCarga() > 30) {
            nuevaLavadora.setPrecio(nuevaLavadora.getPrecio() + 500);
        }
    }
}
