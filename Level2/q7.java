// Implement a grading system using if-else statement
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        int g;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the grade of the student :");
        g = s.nextInt();
        if(g>=90){
            System.out.println("A grade");
        }

            else if(g>=70)
            {
                System.out.println("B grade");
            }
            else{
                System.out.println("C grade");
            }
        
    }
}
