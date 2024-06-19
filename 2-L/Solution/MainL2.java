public class MainL2 {
    public static void main(String[] args) {
        FlyingBird duck = new Duck();
        Bird penguin = new Penguin();


        duck.run();
        duck.swim();
        duck.fly();

        penguin.run();
        penguin.swim();
        //No existe el metodo fly para los pinguinos
    }
}
