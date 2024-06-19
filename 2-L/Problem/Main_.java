public class Main_ {
    /*
     * Imaginemos este caso:
     *   Tenemos una clase abstracta llamada Bird (Que implementa acciones como fly, swim, run, etc)
     *      Si creamos una clase derivada de esta llamada Duck (Tendra todos esas acciones: fly, swim, run, etc)
     *      Si creamos una clase derivada de esta llamda Penguin (No podra implementar fly, 
     *      porque los pinguinos no vuelan y por tanto, se incumple el Liskov Substitution Principle)
     */
    public static void main(String[] args) {
        Bird_ duck = new Duck_();
        Bird_ penguin = new Penguin_();


        duck.run();
        duck.swim();
        duck.fly();

        penguin.run();
        penguin.swim();
        penguin.fly(); // Daria error, los pinguinos no vuelan
    }
}
