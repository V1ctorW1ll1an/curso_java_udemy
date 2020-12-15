package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

/**
 * App!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.print("What is the dollar price? ");
      double dollarPrice = sc.nextDouble();
      
      System.out.print("How many dollars will be bought? ");
      double dollarQuantity = sc.nextDouble();

      double real = CurrencyConverter.convertDollarToReal(dollarPrice, dollarQuantity);

      System.out.printf("Amount to be paind in reais = %.2f\n", real);

      sc.close();
    }
}
