import java.util.Locale;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    double x = 10.3584;
    System.out.println(x);
    System.out.printf("%.2f\n", x);
    System.out.printf("%.4f\n", x);
    /* Locale.setDefault(Locale.US); */
    System.out.printf("%.4f\n", x);

    String product1 = "computer";
    String product2 = "office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';
    
    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.println("\n");

    System.out.println("Products:");
    System.out.printf(product1 + " which price is $ %.2f\n", price1);
    System.out.printf(product2 + " which price is $ %.2f", price2);
    
    System.out.println("\n");
    System.out.printf("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");

    System.out.println("Measure with eight decimal places: " + measure);
    Locale.setDefault(Locale.US);    
    System.out.printf("US decimal point: %.3f\n", measure);
  }
}
