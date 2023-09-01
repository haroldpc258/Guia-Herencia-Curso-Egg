package servicios.barcos;

import entidades.barcos.Barco;
import entidades.barcos.BarcoAMotor;
import entidades.barcos.Velero;

import java.util.Scanner;

public class BarcoAMotorService extends BarcoService{

    @Override
    public BarcoAMotor crear(Scanner scanner) {

        BarcoAMotor nuevoBarcoAMotor = new BarcoAMotor();
        crearBarco(scanner, nuevoBarcoAMotor);

        System.out.print("Ingrese los caballos de Potencia: ");
        nuevoBarcoAMotor.setPotencia(scanner.nextDouble());

        System.out.println("\nSe ha creado el Barco a Motor...");

        return nuevoBarcoAMotor;
    }
}
