package servicios.barcos;

import entidades.barcos.Barco;
import entidades.barcos.Velero;

import java.util.Scanner;

public class VeleroService extends BarcoService{

    @Override
    public Velero crear(Scanner scanner) {

        Velero nuevoVelero = new Velero();
        crearBarco(scanner, nuevoVelero);

        System.out.print("Ingrese el número de Mástiles: ");
        nuevoVelero.setNumeroMastiles(scanner.nextInt());

        System.out.println("\nSe ha creado el Velero...");

        return nuevoVelero;
    }
}
