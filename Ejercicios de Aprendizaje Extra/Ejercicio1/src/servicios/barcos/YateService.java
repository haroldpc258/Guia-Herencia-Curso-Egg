package servicios.barcos;

import entidades.barcos.Barco;
import entidades.barcos.BarcoAMotor;
import entidades.barcos.Yate;

import java.util.Scanner;

public class YateService extends BarcoService{

    @Override
    public Yate crear(Scanner scanner) {

        Yate nuevoYate = new Yate();
        crearBarco(scanner, nuevoYate);

        System.out.print("Ingrese los caballos de Potencia: ");
        nuevoYate.setPotencia(scanner.nextDouble());

        System.out.print("Ingrese el número de Camarotes: ");
        nuevoYate.setNumeroCamarotes(scanner.nextInt());

        System.out.println("\nSe ha creado Yate...");

        return nuevoYate;
    }
}
