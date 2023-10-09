//Control Statement :
//WAP to print  by using Switch statement.
import java.util.Scanner;
public class C3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=s.nextInt();

        switch(n){

            case 2:
            System.out.println("Given Number is 2");
            break;

            case 4:
            System.out.println("Given number is 4");
            break;

            case 5:
            System.out.println("Given number is 5");
            break;

            case 10:
            System.out.println("Given number is 10");
            break;

            default:
            System.out.println("Bye Bye");


        }
        
    }
}
