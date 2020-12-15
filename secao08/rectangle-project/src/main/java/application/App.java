package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MyRectangle;

public class App{

  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    MyRectangle rectangle = new MyRectangle();

    System.out.println("Enter rectangle width and height: ");
    rectangle.setWidth(sc.nextDouble());
    rectangle.setHeight(sc.nextDouble());

    System.out.println(rectangle.toString());
    sc.close();
  }
}

