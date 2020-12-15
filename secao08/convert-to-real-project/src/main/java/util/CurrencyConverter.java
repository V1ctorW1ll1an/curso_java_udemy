package util;

public class CurrencyConverter{
  public CurrencyConverter() {
    super();
  }

  private static final double IOF = 00.6;

  public static double convertDollarToReal(double dollarPrice, double dollarQuantity){
     double dollar = dollarPrice * dollarQuantity;
     double dollarWithIof = dollar * IOF;
     return dollarWithIof + dollar;
  } 
}
