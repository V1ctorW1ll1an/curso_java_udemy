package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Hotel;
import entities.User;

/**
 * App
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Scanner sc = new Scanner(System.in);
      Hotel hotel = new Hotel();
      hotel.users = new ArrayList<User>();

      System.out.print("How many rooms will be rented? ");
      int rooms = sc.nextInt();
      sc.nextLine();
      System.out.println();

      String name;
      String email;
      int room;

      for (int i = 0; i < rooms; i++) {
          System.out.println("Rent #"+ (i+1) +":");     
          System.out.print("Name: ");
          name = sc.nextLine();
          System.out.print("Email: ");
          email = sc.nextLine();
          System.out.print("Room: ");
          room = sc.nextInt();
          sc.nextLine();
          System.out.println();
          hotel.users.add(new User(name, email, room));
      }

      System.out.println();
      System.out.println("Busy rooms:");

      for (User user : hotel.users) {
        System.out.println(user.room + ": " + user.name + ", " + user.email);
      }

      sc.close();
    }
}
