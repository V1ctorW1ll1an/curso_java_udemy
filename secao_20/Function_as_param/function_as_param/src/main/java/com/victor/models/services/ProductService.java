package com.victor.models.services;

import java.util.List;
import java.util.function.Predicate;

import com.victor.entities.Product;

public class ProductService {

  public double filteredSum(List<Product> list, Predicate<Product> predicate) {
    double sum = 0.0;

    for (Product product : list) {
      // a ideia é receber a condição por parametro
      if (predicate.test(product)) {
        sum += product.getPrice();
      }
    }

    return sum;
  }

}
