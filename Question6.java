///Java program to take an integer as input and print it

import java.util.Scanner;

public class Question6 {
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter the integer you want to store in num : ");

        Scanner s = new Scanner(System.in);
        num = s.nextInt();
 
        System.out.println("Stored integer is: " + num);
    }
}
