//WAP to from 1 to 100 if num is divisible by 3 print hii , if num is divisible by 5 print hello or if num is divisible by 3 and 5 print hiihello.
public class Question3
{
    public static void main(String args [])
    {
        for(int num =0; num<=15;num++){

        if(num % 3==0 && num % 5==0 ){

            System.out.println("hiihello");
        }
        else if(num % 3==0 )
        {
            System.out.println(" hii ");
        }
        else if (num % 5==0)
        {
            System.out.println("hello ");
        }
        else
        {
            System.out.println(num);
        }
        }
    }
}