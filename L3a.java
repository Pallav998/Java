//WAP to check the given character is vowel or consonent .

import java.util.Scanner;

public class L3a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.print("Enter any character : ");
         char ch = s.next().charAt(0);

         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
         {
            System.out.println(ch+" is a vowel .");
         }
         else
         {
            System.out.println(ch+" is a constant .");
         }
    }
}
