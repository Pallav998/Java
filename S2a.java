//WAP for user input string .
import java.util.Scanner;

public class S2a {
     public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String Fname = s.next();

        System.out.print("Enter your Last name: ");
        String Lname = s.next();

      String Fullname = Fname + Lname;

        System.out.println("Your name is : "+Fullname);
    }
}
