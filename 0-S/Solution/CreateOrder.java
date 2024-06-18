interface ICreateOrder{
    Order createOrder(String requeriments);
}


public class CreateOrder implements ICreateOrder {

    @Override
    public Order createOrder(String requeriments) {
        // Logica para crear la orden
        return new Order();
    }
    
}
