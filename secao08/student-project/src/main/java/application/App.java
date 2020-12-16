package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

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
      Student student = new Student();

      student.setName(sc.nextLine());
      student.setNota1(sc.nextDouble());
      student.setNota2(sc.nextDouble());
      student.setNota3(sc.nextDouble());

      System.out.printf("Final Grade: %.2f\n", student.finalGrade());

      if (student.finalGrade() > 60) {
        System.out.println("Pass");
      }else{
        System.out.println("Failed");
        System.out.println("Missing " + String.format("%.2f", student.missing()) + " points");
      }

      sc.close();
    }
}
