package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.PredicateProduct;

public class App {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 1200.00));
        products.add(new Product("Lápis", 1.00));
        products.add(new Product("Notebook", 4000.00));
        products.add(new Product("doritos", 0.50));

        // products.removeIf(product -> product.getPrice() >= 100.00);
        // products.removeIf(new PredicateProduct());
        // :: method reference
        // products.removeIf(Product::staticProductPredicate);
        // products.removeIf(Product::nonStaticProductPredicate);

        double min = 100.00;
        Predicate<Product> pred = (p) -> p.getPrice() >= min;

        products.removeIf(pred);

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
