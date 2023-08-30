import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();

        //Declaración del objeto Perro
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        animales.add(perro1);

        //Declaración de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        animales.add(perro2);

        //Declaración del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        animales.add(gato1);

        //Declaración del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        animales.add(caballo1);

        for (Animal animal : animales) {
            animal.alimentarse();
        }
    }
}