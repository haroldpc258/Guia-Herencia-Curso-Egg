package servicios.empleados;

import entidades.Persona;
import entidades.empleados.Empleado;
import servicios.FacultadService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public interface EmpleadoService{

    default void reasignarDespachoEmpleado(Scanner scanner, List<Persona> personasFacultad) {

        List<Empleado> empleados = FacultadService.obtenerTipoPersona(Empleado.class, personasFacultad);

        System.out.println("\nREASIGNANDO DESPACHO A EMPLEADO");
        System.out.print("Ingrese el DNI de la persona: ");
        int dni = scanner.nextInt();

        Optional<Empleado> empleado = empleados.stream().filter(e -> e.getDni() == dni).findFirst();

        if (empleado.isPresent()) {
            System.out.print("Ingrese el nuevo Despacho: ");
            empleado.get().setNumeroDespacho(scanner.nextInt());
        } else {
            System.out.println("\nVerifique el DNI e inténtelo de nuevo.");
        }
    }
}
