interface IProcessOrder{
    void processOrder(Order order);
}

public class ProcessOrder implements IProcessOrder{

    @Override
    public void processOrder(Order order) {
        // Logica para procesar la orden
    }
    
}
