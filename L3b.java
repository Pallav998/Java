//WAP to find the simple interest.

import java.util.Scanner;

public class L3b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter the value of P : ");
            int P = s.nextInt();

            System.out.println("Enter the  Rate of interest : ");
            int R = s.nextInt();

            System.out.println("Enter  Time in year : ");
            int T = s.nextInt();

            int SI = (P * R * T) / 100;
            System.out.println(SI+   " is ");
    }
}
