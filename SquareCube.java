//WAP to find the square and cube of an integer.

import java.util.Scanner;

public class SquareCube {
    public static void main(String args [])
    {
        int a, cube , square;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        a = sc.nextInt();

        cube = a*a*a;
        System.out.println("Cube of the given integer is : "+cube);
        

        square = a*a;
        System.out.println("Square of the given integer is : "+square);
    }
}
