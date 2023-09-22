//WAP to check the number is even or odd .

import java.util.Scanner;
public class Question5
{
 public static void main(String args[])
 {
    int a;
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        a = sc.nextInt();
        if(a % 2 == 0 )
        {
        	System.out.println("The given number is even . ");
        }
        else
        {
        	System.out.println("The given number is odd .");
        }
 }
}