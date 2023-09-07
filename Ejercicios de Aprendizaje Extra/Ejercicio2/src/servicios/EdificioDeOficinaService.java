package servicios;

import entidades.Edificio;
import entidades.EdificioDeOficinas;

public class EdificioDeOficinaService extends EdificioService{

    @Override
    public double calcularSuperficie(Edificio edificio) {

        return super.calcularSuperficie(edificio) +
                edificio.getLargo()*edificio.getAncho()*
                        ((EdificioDeOficinas) edificio).getOficinasPorPiso();
    }

    public void cantidadPersonas(EdificioDeOficinas edificio) {

        int cantidadPersonas = edificio.getPersonasPorOficina()*edificio.getOficinasPorPiso();
        System.out.println("Número de persona por piso: " + cantidadPersonas);

        System.out.println("Número total de personas en el edificio: " + cantidadPersonas*edificio.getOficinasPorPiso());
    }

}
