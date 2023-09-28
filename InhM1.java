//Basic example of multiple inheritance.
interface A
{
    void show();
}

 interface B
 {
     void show();
 }


 class Multiple implements A, B
 {
   public void show ()
   {
    System.out.println("Interface A & B ");
   }
 }


public class InhM1 {
   public static void main(String args[])
   {
    Multiple m = new Multiple();
    m.show();
   }
}
