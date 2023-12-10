//Write a Java program to reverse the elements of an array.
public class A6 {
    public static void main(String[] args) {
        int a[] ={7,2,6,3,5};
        System.out.println("The array elements :");
        for(int i :a){
            System.out.print(i+" ");
        }
        System.out.println("\nReverse elements : ");
        for(int r = a.length-1;r>=0;r--)
        {
            System.out.print(a[r]+" ");
        }
    }
}
