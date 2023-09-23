//WAP to take input and print table of any number .

import java.util.Scanner;

public class Question9 {
    public static void main(String args [])
    {
        int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any integer : ");
        num = sc.nextInt();
    System.out.println("Multiplication otable of  "+num);
    for(int i=1;i<=10;i++)
    {
    
        int result = num*i;
        System.out.println(num + " x " + i + " = " + result);
    }
    }
}
