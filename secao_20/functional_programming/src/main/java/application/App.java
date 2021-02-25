package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product("Tv", 1200.00));
        productsList.add(new Product("Lápis", 1.00));
        productsList.add(new Product("Notebook", 4000.00));

        // productsList.sort(new MyComparator());
        // Comparator<Product> comparator = new Comparator<Product>() {
        // @Override
        // public int compare(Product p1, Product p2) {
        // return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // }
        // };

        // Comparator<Product> comparator = (p1, p2) ->
        // p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        productsList.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product product : productsList) {
            System.out.println(product);
        }
    }
}
