//WAP to find the time speed and distance >

import java.util.Scanner;

public class L3f {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter Distance in KM : ");
            double D = s.nextDouble();

            System.out.println("Enter  Speed in KM/h: ");
            double S = s.nextDouble();

            System.out.println("Enter  Time in hour : ");
            double T = s.nextDouble();

            double calculatedSpeed = D / T;
            System.out.println(calculatedSpeed+ " KM/H is the Speed . ");

            double calculatedTime = D / S; 
            System.out.println(calculatedTime +" H is the Time . ");

            double calculatedDistance = S * T; 
            System.out.println( calculatedDistance+ " KM is the Distance . ");
}
}
