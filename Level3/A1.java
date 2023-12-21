//Write a Java program to check if a number is positive, negative, or zero.
package Level3;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n ;
        n = s.nextInt();
        if(n==0){
            System.out.println("The number is zero");
        }
        else if(n>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
