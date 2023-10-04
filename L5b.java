//WAP to take 10 integer inputs from user and store them in an array and print it.

import java.util.Scanner;

public class L5b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int[] A = new int[10];
            for(int i = 0;i<A.length;i++)
            {
                System.out.println("Print the value of A["+i+"]");
                A[i] = s.nextInt();

            }
            for(int i = 0;i<A.length;i++){
                System.out.println("The value of A["+i+"] is "+A[i]);
            }
    }
}
