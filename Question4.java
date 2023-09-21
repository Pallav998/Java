//WAP to  multiply two numbers .

import java.util.Scanner;

public class Question4{
    public static void main(String args[])
    {
        int a ,b , mult;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter value of a : ");
        a = sc.nextInt();
		
		System.out.print("Enter value of b : ");
		b = sc.nextInt();

        mult = a*b;
		System.out.println(" Multiplication of given number is : "+mult);
    }
}