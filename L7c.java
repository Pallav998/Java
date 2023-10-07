//WAP to find the sub of two arrays.
    import java.util.Scanner;

public class L7c{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the arrays:");
        int length = scanner.nextInt();

        int[] array1 = new int[length];
        int[] array2 = new int[length];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < length; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] subArray = new int[length];
        for (int i = 0; i < length; i++) {
            subArray[i] = array1[i] - array2[i];
        }

        System.out.println("Sub of arrays :");
        for (int value : subArray) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}



