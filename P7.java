//WAP to print a pattern where in first line there shoud be 4 star then in second line one space and 3 star and this will decrease and so on.
public class P7 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("   ");
            }

            for(int k =4 ;k>=i;k--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
