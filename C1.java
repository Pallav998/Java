//Control Statement :
//WAP to print the number is positive or negative by using codition statement.

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n =s.nextInt();
        if(n>0)
        {
            System.out.println(n+" is a positive number .");
        }
        else
        {
            System.out.println(n+" is a negative number .");
        }
    }
}
