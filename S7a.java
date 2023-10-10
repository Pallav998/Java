//WAP for comparision of two strings by user input.

import java.util.Scanner;

public class S7a {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter first string : ");
        String A = s.next();

        System.out.print("Enter Second string : ");
        String B = s.next();  

        if(A.compareTo(B)==0)
        {
            System.out.println(" Strings are equal .");
        }
        else{
            System.out.println("Strings are not equal ");
        }
    }
   
}