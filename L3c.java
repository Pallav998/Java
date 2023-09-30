//WAP to find the speed .

import java.util.Scanner;

public class L3c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter Distance in KM : ");
            int D = s.nextInt();

            System.out.println("Enter  Time in hour : ");
            int T = s.nextInt();

            int  S = D/T;
            System.out.println(S+" KM/H is the Speed . ");
    }
}
