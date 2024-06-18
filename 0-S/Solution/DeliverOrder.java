interface IDeliverOrder{
    void deliverOrder(Order order);
}

public class DeliverOrder implements IDeliverOrder{

    @Override
    public void deliverOrder(Order order) {
        // Logica para entregar la orden
    }
    
}
