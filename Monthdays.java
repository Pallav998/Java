//WAP to Find the number of days in a month using a switch statement

import java.util.Scanner;

public class Monthdays {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int mon =0;
    System.out.println("Enter nonth number : ");
    mon = s.nextInt();

    switch(mon)
    {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        System.out.println(" The number of days is 31 .");
        break;

        case 2:
        System.out.println("The number of days is either 28 or 29 .");
        break;

        case 4:
        case 6:
        case 9:
        case 11:
        System.out.println("The number of days is 30 .");
        break;

        default:
        System.out.println("Invalid");
    }
   } 
}
