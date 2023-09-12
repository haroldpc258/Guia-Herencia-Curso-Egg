import entidades.*;
import entidades.empleados.Empleado;
import entidades.empleados.PersonalDeServicio;
import entidades.empleados.Profesor;
import servicios.FacultadService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        FacultadService fs = new FacultadService();
        List<Persona> personasFacultad = new ArrayList<>();

        crearInstanciasEjemplo(personasFacultad);

        menu(scanner, fs, personasFacultad);
    }

    public static void menu(Scanner scanner, FacultadService fs, List<Persona> personasFacultad) {

        int opcion;
        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Cambiar Estado Civil de una Persona");
            System.out.println("2. Reasignar despacho a un empleado");
            System.out.println("3. Matricular un estudiante en un nuevo curso");
            System.out.println("4. Cambiar de departamento de un profesor");
            System.out.println("5. Trasladar de sección de un empleado del personal de servicio");
            System.out.println("6. Imprimir la información de todas las personas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    fs.cambioEstadoCivil(scanner, personasFacultad);
                }
                case 2 -> {
                    fs.reasignarDespachoEmpleado(scanner, personasFacultad);
                }
                case 3 -> {
                    fs.matriculacionEstudiante(scanner, personasFacultad);
                }
                case 4 -> {
                    fs.cambioDepartamentoProfesor(scanner, personasFacultad);
                }
                case 5 -> {
                    fs.traladosPersonalServicio(scanner, personasFacultad);
                }
                case 6 -> {
                    fs.mostrarInformacion(personasFacultad);
                }
                case 0 -> { }
                default -> {
                    System.out.println("\nLa opción no es válida. Inténtelo de nuevo.");
                }

            }


        } while (opcion != 0);
    }

    public static void crearInstanciasEjemplo(List<Persona> personasFacultad) {

        personasFacultad.add(new PersonalDeServicio("Empleado1", "Apellido1", 537563458, "Soltero", 2020, 1, "Seccion1"));
        personasFacultad.add(new PersonalDeServicio("Empleado2", "Apellido2", 245378643, "Casado", 2019, 2, "Seccion2"));
        personasFacultad.add(new PersonalDeServicio("Empleado3", "Apellido3", 456878654, "Soltero", 2021, 3, "Seccion3"));
        personasFacultad.add(new PersonalDeServicio("Empleado4", "Apellido4", 741753686, "Casado", 2018, 4, "Seccion4"));
        personasFacultad.add(new PersonalDeServicio("Empleado5", "Apellido5", 445334536, "Divorciado", 2017, 5, "Seccion5"));
        personasFacultad.add(new Profesor("Profesor1", "Apellido1", 312464545, "Soltero", 2010, 101, "Departamento1"));
        personasFacultad.add(new Profesor("Profesor2", "Apellido2", 949758464, "Casado", 2009, 102, "Departamento2"));
        personasFacultad.add(new Profesor("Profesor3", "Apellido3", 331461517, "Soltero", 2011, 103, "Departamento3"));
        personasFacultad.add(new Profesor("Profesor4", "Apellido4", 124679467, "Casado", 2008, 104, "Departamento4"));
        personasFacultad.add(new Profesor("Profesor5", "Apellido5", 246713427, "Divorciado", 2007, 105, "Departamento5"));

        personasFacultad.add(new Estudiante("Estudiante1", "Apellido1", 445761349, "Soltero", "Curso1"));
        personasFacultad.add(new Estudiante("Estudiante2", "Apellido2", 334167918, "Casado", "Curso2"));
        personasFacultad.add(new Estudiante("Estudiante3", "Apellido3", 645312464, "Soltero", "Curso3"));
        personasFacultad.add(new Estudiante("Estudiante4", "Apellido4", 997548112, "Casado", "Curso4"));
        personasFacultad.add(new Estudiante("Estudiante5", "Apellido5", 645797451, "Divorciado", "Curso5"));
    }
}