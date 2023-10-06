//WAP to print a pattern where in first line there shoud be 4 space and 1 * then space will decrease and star will increase upto 5 stars.
public class P6 {
  public static void main(String[] args)
   {

    for(int i = 1;i<=5;i++)
    {
        for(int j =4;j>=i;j--)
        {
            System.out.print("   ");
        }

        for(int k =1;k<=i;k++)
        {
            System.out.print(" * ");
        }
        System.out.println();
    }
    
  }  
}
