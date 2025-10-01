package ecommerce;

interface ProductItem {
    void display();
}

class Electronics implements ProductItem {
    public void display() { System.out.println("Electronics Product"); }
}

class Clothing implements ProductItem {
    public void display() { System.out.println("Clothing Product"); }
}

class ProductFactory {
    public ProductItem createProduct(String type) {
        if (type.equalsIgnoreCase("ELECTRONICS")) return new Electronics();
        else if (type.equalsIgnoreCase("CLOTHING")) return new Clothing();
        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        ProductItem p1 = factory.createProduct("Electronics");
        p1.display();
        ProductItem p2 = factory.createProduct("Clothing");
        p2.display();
    }
}

