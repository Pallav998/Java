
//WAP for basic example of 2D array of matrix 3X3.s
    public class A3 {
    public static void main(String[] args) {
        
        int[][] B = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Array Elements:");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(B[row][col] + " ");
            }
            System.out.println(); 
        }
}
}
