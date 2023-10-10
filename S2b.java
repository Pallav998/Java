//WAP for user input string where user will print more than one word.
import java.util.Scanner;

public class S2b {
     public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter your  name : ");
        String name = s.nextLine();//by the help of nextLine() we can print more than a single token
        System.out.println("Your name is : "+name);
    }
}
