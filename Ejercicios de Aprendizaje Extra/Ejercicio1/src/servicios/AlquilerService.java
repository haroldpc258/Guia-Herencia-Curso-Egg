package servicios;

import entidades.Alquiler;
import entidades.barcos.Barco;
import entidades.barcos.BarcoAMotor;
import entidades.barcos.Velero;
import entidades.barcos.Yate;

import java.time.LocalDate;
import java.util.Scanner;

public class AlquilerService {

    public Alquiler crearAlquiler(Scanner scanner, Barco barcoAlquilar) {

        Alquiler nuevoAlquiler = new Alquiler();

        System.out.println("\nCREANDO ALQUILER");

        System.out.print("Ingrese el nombre del cliente: ");
        nuevoAlquiler.setNombreCliente(scanner.next());

        System.out.print("Ingrese el número de documento: ");
        nuevoAlquiler.setDocumentoCliente(scanner.nextInt());

        System.out.print("Ingrese la posición del amarre: ");
        nuevoAlquiler.setPosicionAmarre(scanner.nextInt());

        System.out.print("Ingrese la fecha del alquiler: ");
        nuevoAlquiler.setFechaAlquiler(LocalDate.parse(scanner.next()));

        System.out.print("Ingrese la fecha de devolución: ");
        nuevoAlquiler.setFechaDevolucion(LocalDate.parse(scanner.next()));

        nuevoAlquiler.setBarcoAlquilado(barcoAlquilar);

        nuevoAlquiler.setValorAlquiler(calcularAlquiler(nuevoAlquiler));

        System.out.println("\nSe ha registrado el alquiler...");

        return nuevoAlquiler;

    }
    private double calcularAlquiler(Alquiler alquiler) {

        Barco barcoAlquilar = alquiler.getBarcoAlquilado();
        int diasOcupacion = alquiler.getFechaDevolucion().getDayOfYear() - alquiler.getFechaAlquiler().getDayOfYear();

        double modulo = barcoAlquilar.getEspora()*10;
        modulo += calcularModuloEspecial(barcoAlquilar);

        return diasOcupacion*modulo;
    }

    private double calcularModuloEspecial(Barco barcoAlquilar) {

        if (barcoAlquilar instanceof Velero)
            return ((Velero) barcoAlquilar).getNumeroMastiles();

        if (barcoAlquilar instanceof BarcoAMotor)
            return ((BarcoAMotor) barcoAlquilar).getPotencia();

        if (barcoAlquilar instanceof Yate) {
            return ((Yate) barcoAlquilar).getPotencia() + ((Yate) barcoAlquilar).getNumeroCamarotes();
        }

        return 0;
    }
}
