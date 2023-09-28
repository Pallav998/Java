//WAP to find the power of any iteger .

import java.util.Scanner;

public class Test2 {
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int e = sc.nextInt();

        int result = 1;
        for (int a = 0; a< e; a++) {
            result *= i;
        }
        System.out.println(i+ " to the power " + e + " is: " + result);

    }
    }

    
    
    

