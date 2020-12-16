package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

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
      Employee employee = new Employee();

      // get name
      System.out.print("Name: ");
      employee.setName(sc.nextLine());

      // salario bruto
      System.out.print("Gross salary: ");
      employee.setGrossSalary(sc.nextDouble());

      // taxa
      System.out.print("Tax: ");
      employee.setTax(sc.nextDouble());

      // exibir nome e salario liquido
      System.out.printf("Employee: " + employee.getName() + ",", "$ %.2f\n", employee.netSalary());

      // porcentagem do salario
      System.out.print("Which percentage to increase salary? ");
      employee.increaseSalary(sc.nextDouble());

      // dados atualizados
      System.out.println("Update data: " + employee.getName() + ", $ " + String.format("%.2f", employee.getGrossSalary()));

      sc.close();
    }
}
