package servicios.barcos;


import entidades.barcos.Barco;

import java.util.Scanner;

public abstract class BarcoService {

    protected void crearBarco(Scanner scanner, Barco nuevoBarco) {

        System.out.println("\nCREANDO BARCO TIPO: " + nuevoBarco.getClass().getSimpleName());

        System.out.print("Ingrese la matrícula: ");
        nuevoBarco.setMatricula(scanner.next());

        System.out.print("Ingrese los metros de espora: ");
        nuevoBarco.setEspora(scanner.nextInt());

        System.out.print("Ingrese el año de fabricación: ");
        nuevoBarco.setAnioFabricacion(scanner.nextInt());
    }

    public abstract Barco crear(Scanner scanner);
}
