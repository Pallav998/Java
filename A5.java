//WAP to print 4X4 matrix of 2D array
public class A5 {
    public static void main(String[] args) {
        
        int [][] B = {
            {14,21,36,48},
            {12,13,14,15},
            {22,23,23,21},
            {41,42,45,46}
        };

        System.out.println("Array Elements:");
        for(int i =0;i<4;i++)
        {
            for(int j =0;j<4;j++)
            {
                System.out.print(B[i][j]+ "  ");
            }
             System.out.println();
        }
       
    }
}
