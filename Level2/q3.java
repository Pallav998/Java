//Demonstrate the use of `Scanner` for user input of different data types.

import java.util.Scanner;

public class q3 {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n;
    System.out.println("Enter the integer value :");
    n =s.nextInt();
    System.out.println("Integer value is : "+n);

    char c;
    System.out.println("Enter the char value :");
    c=s.next().charAt(0);
    System.out.println("Character value is : "+c);

    float b;
    System.out.println("Enter the float value :");
    b = s.nextFloat();
    System.out.println("Float value is : "+b);

   } 
}
