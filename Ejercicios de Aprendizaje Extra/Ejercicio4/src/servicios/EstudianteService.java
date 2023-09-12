package servicios;

import entidades.Estudiante;
import entidades.Persona;
import entidades.empleados.Empleado;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public interface EstudianteService {

    default void matriculacionEstudiante(Scanner scanner, List<Persona> personasFacultad) {

        List<Estudiante> estudiantes = FacultadService.obtenerTipoPersona(Estudiante.class, personasFacultad);

        System.out.println("\nMATRICULANDO ESTUDIANTE A UN NUEVO CURSO");
        System.out.print("Ingrese el DNI del Estudiante: ");
        int dni = scanner.nextInt();

        Optional<Estudiante> estudiante = estudiantes.stream().filter(e -> e.getDni() == dni).findFirst();

        if (estudiante.isPresent()) {
            System.out.print("Ingrese el nombre del Curso a Matricular: ");
            estudiante.get().setCurso(scanner.next());
            System.out.println("\nLa operación se ha registrado exitosamente...");

        } else {
            System.out.println("\nVerifique el DNI e inténtelo de nuevo.");
        }
    }
}
