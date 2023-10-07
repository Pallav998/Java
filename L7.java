//Write a program to check if elements of an array are same or not it read from front or back

import java.util.Scanner;

public class L7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = s.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        boolean isSame = true;

        for (int i = 0; i < n / 2; i++) 
        {
            if (a[i] != a[n - i - 1])
             {
                isSame = false;
                break; 
            }
        }

        if (isSame) 
        {
            System.out.println("The elements of the array are same .");
        } else 
        
        {
            System.out.println("The elements of the array are not same .");
        }
    }
}
