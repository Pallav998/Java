//Take 5 integer inputs from user and print the following:
//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers
//number of 0s.

import java.util.Scanner;

public class L5d {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int[] A = new int[5];
        int p =0;
        int n =0;
        int o =0;
        int e =0;
        int z =0;
        
         System.out.println("Enter 5 values for array A :");
         for (int i = 0; i < A.length; i++) 
         {
            A[i] = s.nextInt();
        
        
         if(A[i]>0)
         {
            p++;
         }
         else if(A[i]<0)
         {
            n++;
          }
          else{
            z++;
          }
          if(A[i]%2==0)
          {
            e++;
          }
          else
          {
            o++;
          }
    }
    System.out.println("Positive : "+p+"\nNegative : "+n+"\nZero : "+z+"\nodd : "+o+"\neven : "+e);
  }
}

