//Take two numbers as input and print their sum.
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Enter the value of a :");
        a = s.nextInt();
        System.out.println("Enter the value of b :");
        b = s.nextInt();
        sum = a+b;
        System.out.println("Sum of a and b is :"+sum);
    }
}
