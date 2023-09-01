import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import servicios.LavadoraService;
import servicios.TelevisorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        TelevisorService ts = new TelevisorService();
        LavadoraService ls = new LavadoraService();

        Electrodomestico lavadora1 = ls.crearLavadora(scanner);
        Electrodomestico televisor1 = ts.crearTelevisor(scanner);

        System.out.println(lavadora1);
        System.out.println(televisor1);
    }
}