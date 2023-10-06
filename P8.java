//WAP to print a pattern where in first line there shoud be 4 space in the starting row and one star 
//then star will increase upto 5 stars and space will decrease .
//after printing 5 stars then space will increase and star will decrease .
public class P8 
{
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

