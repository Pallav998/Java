//Find largest and smallest elements of an array.

import java.util.Scanner;
public class L5e {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] A = new int[5];
        int L =A[0];
        int S =A[0];

        System.out.println("Enter 5 values for array A :");
         for (int i = 0; i < A.length; i++) 
         {
            A[i] = s.nextInt();
         }
         for(int i = 0;i<A.length;i++){
            if(A[i]>L)
              L = A[i];
            if(A[i]<S)
              S = A[i];
         }
         System.out.println("Largest is "+L+" and smallest is "+S);
    }
}
