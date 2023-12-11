//WAP that checks if a user-input integer is even or odd using a method called isEven.

import java.util.Scanner;

public class M1 {

    public static boolean isEven(int a){
        return a % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter any integer : ");
        int b = s.nextInt();
        System.out.println("The integer "+b+ " is "+ (isEven(b) ? "even." : "odd."));
    }
}
