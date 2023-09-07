package servicios;

import entidades.Edificio;
import entidades.Polideportivo;

public class PolideportivoService extends EdificioService{
    @Override
    public double calcularSuperficie(Edificio polideportivo) {
        if (isTechado(polideportivo)) {
            return super.calcularSuperficie(polideportivo) +
                    polideportivo.getAncho()*polideportivo.getLargo();
        }
        return super.calcularSuperficie(polideportivo);
    }


    private boolean isTechado(Edificio polideportivo) {
        return ((Polideportivo) polideportivo).getTipoInstalacion().equals(Polideportivo.TipoInstalacion.TECHADO);
    }
}
