package ecommerce;

import java.util.*;

interface Customer {
    void update(String message);
}

class ConcreteCustomer implements Customer {
    private String name;
    public ConcreteCustomer(String name) { this.name = name; }
    public void update(String message) {
        System.out.println("Hello " + name + ", " + message);
    }
}

class Product {
    private String name;
    private boolean available = false;
    private List<Customer> customers = new ArrayList<>();

    public Product(String name) { this.name = name; }
    public void subscribe(Customer c) { customers.add(c); }
    public void setAvailable(boolean status) {
        available = status;
        if (available) {
            for (Customer c : customers) {
                c.update(name + " is now available!");
            }
        }
    }
}

public class Observer {
    public static void main(String[] args) {
        Product iphone = new Product("iPhone 16");
        iphone.subscribe(new ConcreteCustomer("Alice"));
        iphone.subscribe(new ConcreteCustomer("Bob"));

        System.out.println("Stocking product...");
        iphone.setAvailable(true);
    }
}
