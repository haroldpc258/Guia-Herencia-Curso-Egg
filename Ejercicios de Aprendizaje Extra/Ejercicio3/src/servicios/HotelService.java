package servicios;

import entidades.hoteles.Hotel;

import java.util.List;

public class HotelService {
    public List<Hotel> ordenarHotelPorPrecio(List<Hotel> hoteles) {
        hoteles.sort(Hotel.compararPorPrecio());
        return hoteles;
    }

    /*public void calcularPrecioHabitacion(Hotel4Estrellas hotel) {

        int agregadoRestaurante = calcularAgregadoRestaurante(hotel);
        int agregadoGimnasio = calcularAgregadoGimnasio(hotel);

        hotel.setPrecioHabitaciones(50 + hotel.getNumeroCamas() + agregadoRestaurante + agregadoGimnasio);
    }

    public void calcularPrecioHabitacion(Hotel5Estrellas hotel) {
        calcularPrecioHabitacion((Hotel4Estrellas) hotel);

        int agregadoLimosinas = calcularAgregadoLimosinas(hotel);
        hotel.setPrecioHabitaciones(hotel.getPrecioHabitaciones() + agregadoLimosinas);
    }

    private int calcularAgregadoRestaurante(Hotel4Estrellas hotel) {
        if (hotel.getNumeroCamas() < 30) {
            return 10;
        }
        if (hotel.getNumeroCamas() < 50) {
            return 30;
        }

        return 50;
    }

    private int calcularAgregadoGimnasio(Hotel4Estrellas hotel) {
        if (hotel.getGimnasio().equals(Hotel4Estrellas.tipoGimnasio.A)) {
            return 50;
        }

        return 30;
    }

    private int calcularAgregadoLimosinas(Hotel5Estrellas hotel) {
        return 15*(hotel).getCantidadLimosinas();
    }*/

}
