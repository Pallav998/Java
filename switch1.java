//Create a Java program that uses a switch statement to determine whether a given number is even or odd.

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args)
     {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        number = sc.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }
}
