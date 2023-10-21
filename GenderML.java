//WAPto read gender(M/F) and print the corresponding gender using a switch statement

import java.util.Scanner;

public class GenderML {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char gen;
 
		System.out.printf("Enter the Gender(M/F) : ");
		gen = s.next().charAt(0);

        switch(gen)
        {
            case 'M':
            case 'm':
            System.out.println("Gender is male .");
            break;  

            case 'F':
            case 'f':
            System.out.println("Gender is female .");
            break; 

            default:
            System.out.println("Choose Either M Or F ");
            break; 
        }
    }
}
