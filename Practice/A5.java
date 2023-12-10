//Write a Java program to find and print the maximum element in an array.

public class A5 {
  public static void main(String[] args) {
    int a[] = {2,8,21,14,65};

    System.out.println("The array element is : ");
    for(int i : a){
        System.out.print(i+" ");
    }

    int max = a[0];

    for(int m = 0 ; m < a.length; m++){
        if(a[m] > max){
             max = a[m];
        }
    }
    System.out.println("\nThe maximum element of the array is : "+max);
  }
}

