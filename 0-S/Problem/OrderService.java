/*
 *  El principio no se cumple pues la clase OrderService se encarga de hacer mas de una responsabilidad.
 *  Cualquiera de esas actividades podria cambiar en el futuro y hacerse mas compleja, puede que 
 *  alguna deje de depender de una o empiece a depender de otra
 */

public class OrderService{

    public Order createOrder(String requeriments){
        // Logica para crear la orden
        return new Order();
    }

    void processOrder(Order order){
        // Logica para procesar la orden
    }

    void deliverOrder(Order order){
        // Logica para entregar la orden
    } 

}

class Order {
    private String requeriments;


    public String getRequeriments(){
        return requeriments;
    }

    public void setRequeriments(String requeriments){
        this.requeriments = requeriments;
    }
}
