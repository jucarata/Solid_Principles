/*
 * Aqui se evidencia que se crea una sola interfaz general para todas las subclases, por tanto,
 * Interface Segregation Principle dice que es mejor tener muchas interfaces especificas que una sola general
 */

public class MainI_{
    public static void main(String[] args) {
        Bird__ duck = new Duck__();
        Bird__ penguin = new Penguin__();

        duck.run();
        duck.swim();
        duck.fly();

        penguin.run();
        penguin.swim();
        penguin.fly(); // Pinguinos no pueden volar (Lanzara excepcion)
    }
}