package servicios;

import entidades.Alojamiento;
import entidades.extrahoteleros.Camping;
import entidades.extrahoteleros.Residencia;

import java.util.List;
import java.util.stream.Collectors;

public class ExtrahoteleroService {

    public List<Camping> campingsConRestaurante(List<Camping> campings) {
        return campings.stream()
                .filter(camping -> camping.isRestaurante())
                .collect(Collectors.toList());
    }

    public List<Residencia> residenciasConDescuento(List<Residencia> residencias) {
        return residencias.stream()
                .filter(residencia -> residencia.isHacenDescuentos())
                .collect(Collectors.toList());
    }
}
