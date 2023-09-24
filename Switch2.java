//Write a Java program that uses a switch statement to determine whether a given character is a vowel or a consonant.

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        char ch; 

        System.out.print("Enter a character: ");
        String input = scanner.nextLine(); 

        if (input.length() == 1) {
            ch = input.charAt(0); 

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a single character.");
        }
    }
}

