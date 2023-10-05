//WAP to find the product of all elements of an array .

import java.util.Scanner;

public class L6a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of array elements :");
        int n = s.nextInt();

        int [] a = new int [n];
        int product = 1;

        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            product *= a[i];
        }
        System.out.println("Product of the array element is : " +product);

        s.close();
    }
}
