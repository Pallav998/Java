//WAP to find the sum  of all elements of an array.

import java.util.Scanner;

public class L6 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        int sum = 0;
       

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
           
        }

        System.out.println("Sum of the elements: " + sum);
       

        s.close();
    }
}
