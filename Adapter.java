package ecommerce;

interface PaymentProcessor {
    void processPayment(String details);
}

class OurPaymentSystem implements PaymentProcessor {
    public void processPayment(String details) {
        System.out.println("Processing payment in OUR system: " + details);
    }
}

class ThirdPartyGateway {
    public void makePayment(String info) {
        System.out.println("Third-party Gateway: " + info);
    }
}

class PaymentAdapter implements PaymentProcessor {
    private ThirdPartyGateway gateway;
    public PaymentAdapter(ThirdPartyGateway gateway) {
        this.gateway = gateway;
    }
    public void processPayment(String details) {
        gateway.makePayment(details);
    }
}

public class Adapter{
    public static void main(String[] args) {
        PaymentProcessor ourSystem = new OurPaymentSystem();
        ourSystem.processPayment("Order#123 $500");

        PaymentProcessor adapter = new PaymentAdapter(new ThirdPartyGateway());
        adapter.processPayment("Order#124 $1000");
    }
}

