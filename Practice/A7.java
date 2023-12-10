//WAP to calculate the sum of array elements.
public class A7 {
    public static void main(String[] args) {
        int a[]={4,6,8,3,1};
        System.out.println("The array element is : ");
        for(int i :a){
            System.out.print(i+" ");
        }

        int sum = 0;
        System.out.println("\nThe sum of the array element is : ");
        
        for(int num :a)
        {
            sum+=num;
        }
        System.out.println(sum);

    }
}
