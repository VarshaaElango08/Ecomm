package ecommerce;

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCard implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Credit Card.");
    }
}

class PayPal implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}

class UPI implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via UPI.");
    }
}

class Order {
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void checkout(double amount) {
        strategy.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        Order order = new Order();
        order.setPaymentStrategy(new CreditCard());
        order.checkout(2500);

        order.setPaymentStrategy(new UPI());
        order.checkout(1000);
    }
}

