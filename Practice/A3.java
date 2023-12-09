//WAP to ake 10 integer inputs from user and store them in an array and print it.
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the value of a[" + i + "] :");
            a[i] = s.nextInt();
        }

        System.out.println("The array elements are:");

        for (int i = 0; i < a.length; i++) {
            System.out.println("The value of a[" + i + "] is : " + a[i]);
        }
    }
}

