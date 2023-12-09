//Take 10 integer inputs from user and print the following: 
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0s.

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[6];
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("The value of a[" + i + "] :");
            a[i] = s.nextInt();

            if (a[i] > 0) {
                pos++;
            } else if (a[i] < 0) {
                neg++;
            } else {
                zero++;
            }

            if (a[i] != 0 && a[i] % 2 == 0) {
                even++;
            } else if (a[i] != 0) {
                odd++;
            }
        }

        System.out.println("Positive : " + pos + "\nNegative : " + neg + "\nZero : " + zero + "\nOdd : " + odd + "\nEven : " + even);
    }
}

