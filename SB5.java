//WAP to delete a char in the  string  .
public class SB5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dhoni");
        System.out.println(sb);
    
        sb.delete(1,3);
        System.out.println(sb);
       } 
}