package servicios.empleados;

import entidades.Persona;
import entidades.empleados.PersonalDeServicio;
import entidades.empleados.Profesor;
import servicios.FacultadService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public interface PersonalDeServicioService {

    default void traladosPersonalServicio(Scanner scanner, List<Persona> personasFacultad) {

        List<PersonalDeServicio> personlDeServicio = FacultadService.obtenerTipoPersona(PersonalDeServicio.class, personasFacultad);

        System.out.println("\nTRASLADO DE SECCIÓN A PERSONAL DE SERVICIO");
        System.out.print("Ingrese el DNI del empleado: ");
        int dni = scanner.nextInt();

        Optional<PersonalDeServicio> empleado = personlDeServicio.stream().filter(p -> p.getDni() == dni).findFirst();

        if (empleado.isPresent()) {
            System.out.print("Ingrese la nueva Sección: ");
            empleado.get().setSeccionAsignada(scanner.next());
            System.out.println("\nLa operación se ha registrado exitosamente...");
        } else {
            System.out.println("\nVerifique el DNI e inténtelo de nuevo.");
        }
    }
}
