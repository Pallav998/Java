//WAP to read gender and print the corresponding gender using switch statement

import java.util.Scanner;
public class L4a {
    public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		char gen;
 
		System.out.printf("Enter the Gender(M/F) type: ");
		gen = s.next().charAt(0);
 
		switch (gen)
		{
		case 'M':
		case 'm':
			System.out.printf("Male");
			break;
		case 'F':
		case 'f':
			System.out.printf("Female");
			break;
		default:
			System.out.printf("Unspecified Gender.");
			break;
		}
	}
}
