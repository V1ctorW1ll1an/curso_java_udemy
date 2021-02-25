package com.victor.utils;

import java.util.function.Function;

import com.victor.entities.Product;

public class MyFunction implements Function<Product, String> {

  @Override
  public String apply(Product p) {
    return p.getName().toUpperCase();
  }

}
