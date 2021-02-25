package com.victor.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.victor.entities.Product;
import com.victor.utils.MyFunction;

// Fazer um programa para alterar o nome dos produtos para uppercase

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 1200.00));
        products.add(new Product("Lápis", 1.00));
        products.add(new Product("Notebook", 4000.00));
        products.add(new Product("doritos", 0.50));

        // List<String> uppercaseProductNameList = products.stream().map(new
        // MyFunction()).collect(Collectors.toList());
        // List<String> uppercaseProductNameList =
        // products.stream().map(Product::staticUppercaseName)
        // .collect(Collectors.toList());
        // List<String> uppercaseProductNameList = products.stream().map(new
        // MyFunction()).collect(Collectors.toList());

        // List<String> uppercaseProductNameList =
        // products.stream().map(Product::nonStaticUppercaseName)
        // .collect(Collectors.toList());

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> uppercaseProductNameList = products.stream().map(func).collect(Collectors.toList());

        uppercaseProductNameList.forEach(System.out::println);
    }
}
