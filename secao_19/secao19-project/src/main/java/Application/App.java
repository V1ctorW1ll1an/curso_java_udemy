package Application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;
import set.LearningSet;

public class App {
    public static void main(String[] args) {

        // sets
        // Set<String> set = new HashSet<>();
        // Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();

        set.add("tv");
        set.add("tablet");
        set.add("notebook");

        set.remove("tv");
        set.removeIf(word -> word.contains("oo"));

        LearningSet hashSet = new LearningSet();
        hashSet.printSet(set);

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        // Products
        // Comparações de objetos usando hashTable
        Set<Product> product = new HashSet<>();

        product.add(new Product("tv", 2900.00));
        product.add(new Product("tablet", 1200.00));
        product.add(new Product("notebook", 4000.00));

        Product prod = new Product("notebook", 4000.00);

        System.out.println("Prod contains product: " + product.contains(prod));

        // Comparações de objetos usando TreeSet
        Set<Product> product2 = new TreeSet<>();

        product2.add(new Product("samgung", 2900.00));
        product2.add(new Product("lg", 1200.00));
        product2.add(new Product("iphone", 4000.00));

        for (Product p : product2) {
            System.out.println(p);
        }
    }
}
