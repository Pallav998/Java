//WAP to reverse a table .

import java.util.Scanner;

public class Reverse {
    public static void main(String args)
    {
        int i ,num ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        num = s.nextInt();
        System.out.println(" Reverse Multiplication table of  "+num);
        for(i=10;i<=1;i--)
        {
         int result = num*i;
        System.out.println(num + " x " + i + " = " + result);
        }
    }
}
