import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import servicios.EdificioDeOficinaService;
import servicios.PolideportivoService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EdificioDeOficinaService es = new EdificioDeOficinaService();
        PolideportivoService ps = new PolideportivoService();

        List<Edificio> edificaciones = new ArrayList<>();

        edificaciones.add(new EdificioDeOficinas(50, 200, 50, 3, 4, 60));
        edificaciones.add(new EdificioDeOficinas(40, 300, 50, 4, 5, 80));
        edificaciones.add(new Polideportivo(30, 30, 5, "Principal", Polideportivo.TipoInstalacion.TECHADO));
        edificaciones.add(new Polideportivo(20, 20, 4, "Secundario", Polideportivo.TipoInstalacion.ABIERTO));

        for (Edificio edificio : edificaciones) {
            System.out.println("\n" + edificio);

            if (edificio instanceof EdificioDeOficinas) {
                es.calcularSuperficie(edificio);
                es.calcularVolumen(edificio);
                es.cantidadPersonas((EdificioDeOficinas) edificio);
            }

            if (edificio instanceof Polideportivo) {
                ps.calcularSuperficie(edificio);
                ps.calcularVolumen(edificio);
                System.out.println("El tipo de Instalación del Polideportivo es: "
                        + ((Polideportivo) edificio).getTipoInstalacion().getInstalacion());
            }
        }

    }
}