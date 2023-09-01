import entidades.Alquiler;
import entidades.barcos.BarcoAMotor;
import entidades.barcos.Velero;
import entidades.barcos.Yate;
import servicios.AlquilerService;
import servicios.barcos.BarcoAMotorService;
import servicios.barcos.VeleroService;
import servicios.barcos.YateService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        BarcoAMotorService barcoAMotorService = new BarcoAMotorService();
        VeleroService veleroService = new VeleroService();
        YateService yateService = new YateService();
        AlquilerService alquilerService = new AlquilerService();

        List<Alquiler> alquileres = new ArrayList<>();

        //BarcoAMotor barcoAMotor1 = barcoAMotorService.crear(scanner);
        Velero velero1 = veleroService.crear(scanner);
        //Yate yate1 = yateService.crear(scanner);

        alquileres.add(alquilerService.crearAlquiler(scanner, velero1));

        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
    }
}