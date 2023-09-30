//WAP to find the time .

import java.util.Scanner;

public class L3e {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter Distance in KM : ");
            int D = s.nextInt();

            System.out.println("Enter  Speed in KM/h: ");
            int S = s.nextInt();

            int  T = D/S;
            System.out.println(T+" H is the Time . ");
    }
}
