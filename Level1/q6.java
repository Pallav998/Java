//Calculate the area of a rectangle using user input for length and width.
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l,w,area;
        System.out.print("Length is : ");
        l=s.nextInt();
        System.out.print("Width is : ");
        w = s.nextInt();
        area = l*w;
        System.out.println("Area of the rectangle is :"+area);
    }
}
