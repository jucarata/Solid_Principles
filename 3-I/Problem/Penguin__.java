public class Penguin__ implements Bird__{

    @Override
    public void run() {
        System.out.println("Penguin is running");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
    
}
