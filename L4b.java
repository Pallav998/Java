//WAP to calculate factorial of a number using recursion
import java.util.Scanner;

public class L4b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,fact = 0;
		System.out.print("Enter the Number: ");
		n = s.nextInt();
		fact = f(n);
		System.out.printf("Factorial is : " + fact);
    }
    
    
    public static int f(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return n * f(n - 1);
		}
	}
}
