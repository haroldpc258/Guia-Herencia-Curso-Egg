package servicios;

import entidades.Persona;
import servicios.empleados.EmpleadoService;
import servicios.empleados.PersonalDeServicioService;
import servicios.empleados.ProfesorService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FacultadService implements EstudianteService, EmpleadoService, ProfesorService, PersonalDeServicioService {

    public void cambioEstadoCivil(Scanner scanner, List<Persona> personasFacultad) {

        System.out.println("\nCAMBIO DE ESTADO CIVIL");
        System.out.print("Ingrese el DNI de la persona: ");
        int dni = scanner.nextInt();

        Optional<Persona> persona = personasFacultad.stream().filter(p -> p.getDni() == dni).findFirst();

        if (persona.isPresent()) {
            System.out.print("Ingrese el nuevo Estado Civil: ");
            persona.get().setEstadoCivil(scanner.next());
            System.out.println("\nLa operación se ha registrado exitosamente...");
        } else {
            System.out.println("\nVerifique el DNI e inténtelo de nuevo.");
        }
    }

    public static <T extends Persona> List<T> obtenerTipoPersona(Class<T> tipo, List<Persona> personasFacultad) {
        return personasFacultad.stream()
                .filter(tipo::isInstance)
                .map(tipo::cast)
                .collect(Collectors.toList());
    }

    public void mostrarInformacion(List<Persona> personasFacultad) {

        System.out.println("\nINFORMACIÓN PERSONAS");
        personasFacultad.forEach(System.out::println);
    }
}
