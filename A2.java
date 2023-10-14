//WAP to reverse the array by user input.

import java.util.Scanner;

public class A2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        reverse(arr);

        System.out.println("Reversed Array:");
        printArray(arr);
    }
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) { // Use '<' instead of '<='
            // Swap
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;

            start++;
            end--;
        }
    }

    
}
