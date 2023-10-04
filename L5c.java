import java.util.Scanner;

    public class L5c {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int[] A = new int[5];
            
            System.out.println("Enter 5 values for array A separated by spaces:");
            for (int i = 0; i < A.length; i++) {
                A[i] = s.nextInt();
            }
            
            System.out.print("Stored Array elements are: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }
        }
    }
