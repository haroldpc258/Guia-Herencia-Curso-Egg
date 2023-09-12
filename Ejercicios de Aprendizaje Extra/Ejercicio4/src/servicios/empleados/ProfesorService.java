package servicios.empleados;

import entidades.Persona;
import entidades.empleados.Profesor;
import servicios.FacultadService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public interface ProfesorService {

    default void cambioDepartamentoProfesor(Scanner scanner, List<Persona> personasFacultad) {

        List<Profesor> profesores = FacultadService.obtenerTipoPersona(Profesor.class, personasFacultad);

        System.out.println("\nCAMBIO DE DEPARTAMENTO A PROFESOR");
        System.out.print("Ingrese el DNI del Profesor: ");
        int dni = scanner.nextInt();

        Optional<Profesor> profesor = profesores.stream().filter(p -> p.getDni() == dni).findFirst();

        if (profesor.isPresent()) {
            System.out.print("Ingrese el nuevo Departamento: ");
            profesor.get().setDepartamento(scanner.next());
            System.out.println("\nLa operación se ha registrado exitosamente...");
        } else {
            System.out.println("\nVerifique el DNI e inténtelo de nuevo.");
        }
    }
}
