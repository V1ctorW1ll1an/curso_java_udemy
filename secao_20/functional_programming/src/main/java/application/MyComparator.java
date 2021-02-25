package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

  /**
   * Returns 1 if p1 > p2 / Returns -1 if p1 < p2 / Returns 0 if p1 = p2
   */
  @Override
  public int compare(Product p1, Product p2) {
    return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
  }

}
