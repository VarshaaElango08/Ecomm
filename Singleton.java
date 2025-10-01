package ecommerce;

import java.util.*;

class ShoppingCart {
    private static ShoppingCart instance;
    private List<String> items = new ArrayList<>();

    private ShoppingCart() {}
    public static ShoppingCart getInstance() {
        if (instance == null) instance = new ShoppingCart();
        return instance;
    }
    public void addItem(String item) { items.add(item); }
    public void showCart() {
        System.out.println("Cart Items: " + items);
    }
}

public class Singleton {
    public static void main(String[] args) {
        ShoppingCart cart1 = ShoppingCart.getInstance();
        ShoppingCart cart2 = ShoppingCart.getInstance();
        cart1.addItem("Laptop");
        cart2.addItem("Headphones");

        cart1.showCart();
        System.out.println("Are both carts same? " + (cart1 == cart2));
    }
}

