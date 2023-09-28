import java.util.Scanner;

public class Test3 {
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        

        int result = 1;
        for (int a = 0; a<i; a++) {
            result *= i;
        }
        System.out.println(i+ " to the power " + i + " is: " + result);

    }
}
