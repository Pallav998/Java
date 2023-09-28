//WAP to calculate the power of the length of the integer after finding the length.

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int length = getIntegerLength(number);
        System.out.println("Length of the integer: " + length);

        int power = (int) Math.pow(length, length);
        System.out.println(length + " to the power " + length + " is: " + power);
    }

    public static int getIntegerLength(int number) {
        if (number == 0) {
            return 1;
        }

        int length = 0;
        while (number != 0) {
            number = number / 10;
            length++;
        }

        return length;
    }
    
}


