import entidades.Alojamiento;
import entidades.extrahoteleros.Camping;
import entidades.extrahoteleros.Residencia;
import entidades.hoteles.Hotel;
import entidades.hoteles.Hotel4Estrellas;
import entidades.hoteles.Hotel5Estrellas;
import servicios.AlojamientoService;
import servicios.ExtrahoteleroService;
import servicios.HotelService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        AlojamientoService as = new AlojamientoService();
        HotelService hs = new HotelService();
        ExtrahoteleroService es = new ExtrahoteleroService();

        List<Alojamiento> alojamientos = new ArrayList<>();
        agregarAlojamientoEjemplo(alojamientos);
        menu(scanner, alojamientos, as, hs, es);
    }

    public static void menu(Scanner scanner, List<Alojamiento> alojamientos, AlojamientoService as, HotelService hs, ExtrahoteleroService es) {
        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Consultar todos los Alojamientos");
            System.out.println("2. Consultar Hoteles por precio");
            System.out.println("3. Consultar Campings con restaurante.");
            System.out.println("4. Consultar Residencia con descuento.");
            System.out.println("0. Salir");
            System.out.print("Seleccione un opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nLISTA DE ALOJAMIENTOS");
                    as.mostrarAlojamientos(alojamientos);
                }
                case 2 -> {
                    System.out.println("\nLISTA DE HOTELES POR PRECIO");
                    as.mostrarAlojamientos(hs.ordenarHotelPorPrecio(as.obtenerAlojamientosDeTipo(Hotel.class, alojamientos)));
                }
                case 3 -> {
                    System.out.println("\nLISTA DE CAMPINGS CON RESTAURANTE");
                    as.mostrarAlojamientos(es.campingsConRestaurante(as.obtenerAlojamientosDeTipo(Camping.class, alojamientos)));
                }
                case 4 -> {
                    System.out.println("\nLISTA DE RESIDENCIAS CON DESCUENTO");
                    as.mostrarAlojamientos(es.residenciasConDescuento(as.obtenerAlojamientosDeTipo(Residencia.class, alojamientos)));
                }
                case 0 -> { }
                default -> {
                    System.out.println("\nLa opción no está disponible...");
                }
            }
        } while (opcion != 0);

        System.out.println("\nHasta Luego...");
    }

    public static void agregarAlojamientoEjemplo(List<Alojamiento> alojamientos) {
        Hotel4Estrellas hotel1 = new Hotel4Estrellas("Hotel Uno", "Dirección Uno", "Localidad Uno", "Gerente Uno", 100, 200, 10, Hotel4Estrellas.tipoGimnasio.A, "Restaurante Uno", 50);
        alojamientos.add(hotel1);

        Hotel4Estrellas hotel2 = new Hotel4Estrellas("Hotel Dos", "Dirección Dos", "Localidad Dos", "Gerente Dos", 120, 220, 12, Hotel4Estrellas.tipoGimnasio.B, "Restaurante Dos", 60);
        alojamientos.add(hotel2);

        Hotel4Estrellas hotel3 = new Hotel4Estrellas("Hotel Tres", "Dirección Tres", "Localidad Tres", "Gerente Tres", 80, 150, 8, Hotel4Estrellas.tipoGimnasio.A, "Restaurante Tres", 40);
        alojamientos.add(hotel3);

        Hotel4Estrellas hotel4 = new Hotel4Estrellas("Hotel Cuatro", "Dirección Cuatro", "Localidad Cuatro", "Gerente Cuatro", 150, 300, 15, Hotel4Estrellas.tipoGimnasio.B, "Restaurante Cuatro", 70);
        alojamientos.add(hotel4);

        Hotel4Estrellas hotel5 = new Hotel4Estrellas("Hotel Cinco", "Dirección Cinco", "Localidad Cinco", "Gerente Cinco", 90, 180, 9, Hotel4Estrellas.tipoGimnasio.A, "Restaurante Cinco", 45);
        alojamientos.add(hotel5);

        Hotel5Estrellas hotel6 = new Hotel5Estrellas("Hotel Seis", "Dirección Seis", "Localidad Seis", "Gerente Seis", 200, 400, 20, Hotel4Estrellas.tipoGimnasio.A, "Restaurante Seis", 80, 5, 10, 3);
        alojamientos.add(hotel6);

        Hotel5Estrellas hotel7 = new Hotel5Estrellas("Hotel Siete", "Dirección Siete", "Localidad Siete", "Gerente Siete", 180, 350, 18, Hotel4Estrellas.tipoGimnasio.B, "Restaurante Siete", 70, 4, 8, 2);
        alojamientos.add(hotel7);

        Hotel5Estrellas hotel8 = new Hotel5Estrellas("Hotel Ocho", "Dirección Ocho", "Localidad Ocho", "Gerente Ocho", 250, 500, 25, Hotel4Estrellas.tipoGimnasio.A, "Restaurante Ocho", 100, 6, 12, 4);
        alojamientos.add(hotel8);

        Hotel5Estrellas hotel9 = new Hotel5Estrellas("Hotel Nueve", "Dirección Nueve", "Localidad Nueve", "Gerente Nueve", 220, 450, 22, Hotel4Estrellas.tipoGimnasio.B, "Restaurante Nueve", 90, 5, 11, 3);
        alojamientos.add(hotel9);

        Hotel5Estrellas hotel10 = new Hotel5Estrellas("Hotel Diez", "Dirección Diez", "Localidad Diez", "Gerente Diez", 280, 550, 28, Hotel4Estrellas.tipoGimnasio.A, "Restaurante Diez", 120, 7, 14, 5);
        alojamientos.add(hotel10);

        Camping camping1 = new Camping("Camping Uno", "Dirección Uno", "Localidad Uno", "Gerente Uno", true, 5000.0, 200, 20, true);
        alojamientos.add(camping1);

        Camping camping2 = new Camping("Camping Dos", "Dirección Dos", "Localidad Dos", "Gerente Dos", false, 3000.0, 150, 15, false);
        alojamientos.add(camping2);

        Camping camping3 = new Camping("Camping Tres", "Dirección Tres", "Localidad Tres", "Gerente Tres", true, 6000.0, 250, 25, true);
        alojamientos.add(camping3);

        Camping camping4 = new Camping("Camping Cuatro", "Dirección Cuatro", "Localidad Cuatro", "Gerente Cuatro", false, 4000.0, 180, 18, false);
        alojamientos.add(camping4);

        Camping camping5 = new Camping("Camping Cinco", "Dirección Cinco", "Localidad Cinco", "Gerente Cinco", true, 5500.0, 220, 22, true);
        alojamientos.add(camping5);

        Residencia residencia1 = new Residencia("Residencia Uno", "Dirección Uno", "Localidad Uno", "Gerente Uno", true, 8000.0, 30, true, true);
        alojamientos.add(residencia1);

        Residencia residencia2 = new Residencia("Residencia Dos", "Dirección Dos", "Localidad Dos", "Gerente Dos", false, 6000.0, 25, false, false);
        alojamientos.add(residencia2);

        Residencia residencia3 = new Residencia("Residencia Tres", "Dirección Tres", "Localidad Tres", "Gerente Tres", true, 9000.0, 35, true, false);
        alojamientos.add(residencia3);

        Residencia residencia4 = new Residencia("Residencia Cuatro", "Dirección Cuatro", "Localidad Cuatro", "Gerente Cuatro", false, 7500.0, 28, false, true);
        alojamientos.add(residencia4);

        Residencia residencia5 = new Residencia("Residencia Cinco", "Dirección Cinco", "Localidad Cinco", "Gerente Cinco", true, 8500.0, 32, true, true);
        alojamientos.add(residencia5);
    }
}