//WAP to find the distance .

import java.util.Scanner;

public class L3d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter Speed in Km/h : ");
            int S = s.nextInt();

            System.out.println("Enter  Time in hour : ");
            int T = s.nextInt();

            int  D = S*T;
            System.out.println(D+" KM is the Distance . ");
    }
}
