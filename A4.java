//WAP for basic example of 2D array of matrix 2X2.
    public class A4 {
    public static void main(String[] args) {
        
        int[][] B = {
            {1, 2},
            {4, 5},
        };

        System.out.println("Array Elements:");

         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(B[row][col] + " ");
            }
           System.out.println(); 
         }
}
}