//WAP to check the given number is Palindrome number .

import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter the number: "); 

        String reverse = ""; 
        String num = s.nextLine(); 

       int length = num.length(); 

      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + num.charAt(i);  
     
         if (num.equals(reverse))  
             System.out.println("The entered string " +num +" is a palindrome.");  
         else  
             System.out.println("The entered string " +num +"  isn't a palindrome.");     
  }
}
