public class Penguin_ extends Bird_{
    @Override
    public void fly(){throw new UnsupportedOperationException("Penguin can't fly");}
    @Override
    public void run(){System.out.println("Penguin is Running");}
    @Override
    public void swim(){System.out.println("Penguin is Swimming");}
}
