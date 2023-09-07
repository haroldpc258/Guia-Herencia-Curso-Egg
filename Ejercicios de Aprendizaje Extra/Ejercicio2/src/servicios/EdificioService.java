package servicios;

import entidades.Edificio;

public class EdificioService {

    protected double calcularSuperficie(Edificio edificio) {
        return 2*(edificio.getAlto()*edificio.getLargo() +
                edificio.getAlto()*edificio.getAncho() +
                0.5*edificio.getAncho()*edificio.getLargo());
    }

    public double calcularVolumen(Edificio edificio) {
        return edificio.getAncho()*edificio.getAlto()* edificio.getLargo();
    }
}
