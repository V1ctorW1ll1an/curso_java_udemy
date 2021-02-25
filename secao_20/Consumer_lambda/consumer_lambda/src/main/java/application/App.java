package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class App {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 1200.00));
        products.add(new Product("Lápis", 1.00));
        products.add(new Product("Notebook", 4000.00));
        products.add(new Product("doritos", 0.50));

        double factor = 1.1;

        // products.forEach(new ProductsConsumer());
        // products.forEach(Product::staticPriceUpdate);
        // products.forEach(Product::nonStaticPriceUpdate);
        // Consumer<Product> consumer = product -> product.setPrice(product.getPrice() *
        // factor);

        // products.forEach(consumer);
        products.forEach(product -> product.setPrice(product.getPrice() * factor));

        products.forEach(System.out::println);
    }
}
