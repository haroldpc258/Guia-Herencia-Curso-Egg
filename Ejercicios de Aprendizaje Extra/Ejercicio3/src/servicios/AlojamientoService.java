package servicios;

import entidades.Alojamiento;
import entidades.extrahoteleros.Camping;
import entidades.extrahoteleros.Residencia;
import entidades.hoteles.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AlojamientoService {

    public void mostrarAlojamientos(List<? extends Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
    }

    /*public List<Hotel> obtenerHoteles(List<Alojamiento> alojamientos) {
        List<Hotel> hoteles = new ArrayList<>();

        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        return hoteles;
    }*/

    public List<Hotel> obtenerHoteles(List<Alojamiento> alojamientos) {
        return alojamientos.stream()
                .filter(alojamiento -> alojamiento instanceof Hotel)
                .map(hotel -> (Hotel) hotel)
                .collect(Collectors.toList());
    }

    public List<Camping> obtenerCampings(List<Alojamiento> alojamientos) {
        return alojamientos.stream()
                .filter(alojamiento -> alojamiento instanceof Camping)
                .map(camping -> (Camping) camping)
                .collect(Collectors.toList());
    }

    public List<Residencia> obtenerResidencias(List<Alojamiento> alojamientos) {
        return alojamientos.stream()
                .filter(alojamiento -> alojamiento instanceof Residencia)
                .map(residencia -> (Residencia) residencia)
                .collect(Collectors.toList());
    }

}
