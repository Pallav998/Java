//Basic example of multiple inheritance.
interface A
{
    void Show();
}

 interface B
 {
     void Display();
 }


 class Multiple implements A, B
 {
   public void Show()
   {
    System.out.println("Interface A is here ");
   }
   public void Display()
   {
    System.out.println("Interface  B is here");
   }
   
}
   public class Inhm2
   {
    public static void main(String args[])
    {
    Multiple m = new Multiple();
    m.Show(); 
    m.Display();
    }
}



