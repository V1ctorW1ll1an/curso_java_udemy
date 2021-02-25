package com.victor.application;

import java.util.ArrayList;
import java.util.List;

import com.victor.entities.Product;
import com.victor.models.services.ProductService;

// Fazer um programa que, a partir de uma lista de produtos, calcule 
// a soma dos preços somente dos produtos cujo nome começa com a letra "T".

public class App {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product("Tv", 1200.00));
        productsList.add(new Product("Lápis", 1.00));
        productsList.add(new Product("Notebook", 4000.00));
        productsList.add(new Product("Tesoura", 3.50));
        // productsList.add(new Product("tesoura", 3.50)); letra minuscula
        // impacta no resultado

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(productsList, p -> p.getName().charAt(0) == 'N');

        System.out.println("Sum: " + String.format("%.2f", sum));
    }
}
