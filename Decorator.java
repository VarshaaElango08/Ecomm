package ecommerce;

interface OrderBase {
    String getDescription();
    double getCost();
}

class BasicOrder implements OrderBase {
    public String getDescription() { return "Basic Order"; }
    public double getCost() { return 100.0; }
}

abstract class OrderDecorator implements OrderBase {
    protected OrderBase order;
    public OrderDecorator(OrderBase order) { this.order = order; }
    public String getDescription() { return order.getDescription(); }
    public double getCost() { return order.getCost(); }
}

class GiftWrap extends OrderDecorator {
    public GiftWrap(OrderBase order) { super(order); }
    public String getDescription() { return super.getDescription() + ", Gift Wrapped"; }
    public double getCost() { return super.getCost() + 20.0; }
}

class ExpressDelivery extends OrderDecorator {
    public ExpressDelivery(OrderBase order) { super(order); }
    public String getDescription() { return super.getDescription() + ", Express Delivery"; }
    public double getCost() { return super.getCost() + 50.0; }
}

public class Decorator {
    public static void main(String[] args) {
        OrderBase order = new BasicOrder();
        System.out.println(order.getDescription() + " $" + order.getCost());

        order = new GiftWrap(order);
        order = new ExpressDelivery(order);
        System.out.println(order.getDescription() + " $" + order.getCost());
    }
}

