
package ecommerce;
import java.util.*;
import ecommerce.Observer;
import ecommerce.Strategy;
import ecommerce.Singleton;
import ecommerce.Factory;
import ecommerce.Adapter;
import ecommerce.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern ===");
        Observer.main(null);

        System.out.println("\n=== Strategy Pattern ===");
        Strategy.main(null);

        System.out.println("\n=== Singleton Pattern ===");
        Singleton.main(null);

        System.out.println("\n=== Factory Pattern ===");
        Factory.main(null);

        System.out.println("\n=== Adapter Pattern ===");
        Adapter.main(null);

        System.out.println("\n=== Decorator Pattern ===");
        Decorator.main(null);
    }
}
