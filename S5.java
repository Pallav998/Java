//WAP to print each character of the given string first it will print the length of the string.

public class S5 {
    public static void main(String[] args)
   {
    
    String F_name = "Pallavi";
    String L_name = "Thakur";
    String Full_name = F_name + " "+ L_name;
    System.out.println("COncatenate String is : "+Full_name);

    System.out.println(" Length of the string is : "+Full_name.length());
        for(int i=0;i<Full_name.length();i++)
        {
            System.out.println(Full_name.charAt(i));
        }
  }  
}
