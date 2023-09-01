package servicios;

import entidades.Electrodomestico;
import entidades.Televisor;

import java.util.Scanner;

public class TelevisorService extends ElectrodomesticoService{

    public Televisor crearTelevisor(Scanner scanner) {

        Televisor nuevoTelevisor = new Televisor();
        crearElectrodomestico(scanner, nuevoTelevisor);

        System.out.print("Ingrese las pulgadas de Resolución: ");
        nuevoTelevisor.setResolucion(scanner.nextDouble());

        System.out.print("Posee sintonizador TDT (s/n): ");
        nuevoTelevisor.setTDT(scanner.next().equalsIgnoreCase("s"));

        precioFinal(nuevoTelevisor);

        return nuevoTelevisor;
    }

    @Override
    public void precioFinal(Electrodomestico nuevoTelevisor) {
        super.precioFinal(nuevoTelevisor);

        if (((Televisor) nuevoTelevisor).getResolucion() > 40) {
            nuevoTelevisor.setPrecio(nuevoTelevisor.getPrecio()*1.3);
        }
        if (((Televisor) nuevoTelevisor).isTDT()) {
            nuevoTelevisor.setPrecio(nuevoTelevisor.getPrecio() + 500);
        }
    }
}
