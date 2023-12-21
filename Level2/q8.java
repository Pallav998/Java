//Create a program using a switch statement to display the day of the week.
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int day;
        System.out.println("Enter the date number between(1-7):");
        day = s.nextInt();

        String d;
        switch (day){
            case 1:
            d = "Monday";
            break;
        case 2:
            d = "Tuesday";
            break;
            
        case 3:
            d = "Wednesday";
            break;

        case 4:
        d = "Thursday";
        break;
        case 5:
        d = "Friday";
        break;
        case 6:
        d = "Saturday";
        break;
        case 7:
        d = "Sunday";
        break;

        default:
        d = "Invalid Number";
        break;

        }
        System.out.println("The day is :"+d);
    }
}
