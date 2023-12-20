//Calculate the area of a circle using a constant for PI.
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r;
        double area;
        double Pi = 3.14;
        System.out.println("Enter the radius of the circle :");
        r = s.nextInt();
        area = Pi *r *r;
        System.out.println("Area of the Circle is :"+area);
    }
}
