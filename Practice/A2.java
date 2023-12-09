//Create an array of 5 floats and calculate their sum.

public class A2 {
    public static void main(String[] args) {
        float a[] = {1.2f,4.2f,5.1f,3.1f,8.3f};

        float sum =0;

        for(int i = 0 ; i<a.length;i++)
        {
            sum = sum +a[i];
        }
        System.out.println("The sum of 5 float number is : " +sum);
    }
}
