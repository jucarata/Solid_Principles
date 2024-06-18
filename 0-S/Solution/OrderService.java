/*
 * Simplemente hay que separar las responsabilidades, cada nueva clase se encargara de hacer una sola responsabilidad
 */

public class OrderService {

    private ICreateOrder orderCreator;
    private IProcessOrder orderProcessor;
    private IDeliverOrder orderDeliverer;

    public OrderService(ICreateOrder orderCreator, IProcessOrder orderProcessor, IDeliverOrder orderDeliverer){
        this.orderCreator = orderCreator;
        this.orderProcessor = orderProcessor;
        this.orderDeliverer = orderDeliverer;
    }

    public void serveOrder(){
        Order order = orderCreator.createOrder("Requisitos de la orden");
        orderProcessor.processOrder(order);
        orderDeliverer.deliverOrder(order);
    }

}