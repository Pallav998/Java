//WAP to read a weekday number and print weekday name using switch statement

import java.util.Scanner;

public class Weekname {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter the  weekday number  :");
        num = s.nextInt();

        switch(num)
        {
            case 0 : 
            System.out.println("Monday");
            break;

            case 1 : 
            System.out.println("Tuesday");
            break;

            case 2 : 
            System.out.println("Wednesday");
            break;

            case 3 : 
            System.out.println("Thursday");
            break;

            case 4 : 
            System.out.println("Friday");
            break;

            case 5 : 
            System.out.println("Saturday");
            break;

            case 6 : 
            System.out.println("Sunday");
            break;

            default : 
            System.out.println("Invalid , you can choose only 0 - 6 .");
            break;
        }
    }
}
