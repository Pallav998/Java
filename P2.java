//WAP to print a Holllow Square Pattern by using * .
public class P2 {
    public static void main(String[] args) {
        int size = 5;
        // outer loop
        for (int i = 0; i < size; i++) {
          // inner loop
          for (int j = 0; j < size; j++) {
            
            if (i == 0 || i == size - 1) {
              System.out.print(" * ");
            }
            else {
       
              if (j == 0 || j == size - 1) {
                System.out.print(" * ");
              }
              else {
                System.out.print("   ");
              }
            }
          }
          System.out.println();
        }
      }
}
