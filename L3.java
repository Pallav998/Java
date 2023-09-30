//WAP to check the given year is leap year or not .

import java.util.Scanner;

public class L3 {
    public static void main(String args[])
    {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter year that you want to check : ");
            int y = s.nextInt();

            if(y %4 == 0   &   y % 100 != 0  || y % 400 == 0) 
            {
                System.out.println(y+"is a leap year .");
            }
            else{
                System.out.println(y+" is not a leap year .");
            }
    }
}
