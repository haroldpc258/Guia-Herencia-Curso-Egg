import entidades.Circulo;
import entidades.Rectangulo;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(Math.random()*20 + 1);
        Rectangulo rectangulo = new Rectangulo(Math.random()*20 + 1, Math.random()*20 + 1);

        System.out.println("El área del círculo es: " + circulo.area() + ", su perímetro es: " + circulo.perimetro());
        System.out.println("El área del Rectángulo es: " + rectangulo.area() + ", su perímetro es: " + rectangulo.perimetro());

    }
}