/* Write a Java program to check if a number is positive, negative, or zero.
 * Write a Java program to print the Fibonacci series.
 * Write a Java program to find the largest among three numbers.
 * Write a Java program to generate a multiplication table.
 * 
 */

 class Day2 {

    void positiveNegativeZero(int n){
        if(n>0){
            System.out.println(+n+" is positive number");
        }
        else if(n<0){
            System.out.println(+n+" is negative number");
        }
        else{
            System.out.println(+n+" number is zero");
        }
    }
 
    void fibonacci(int n){
        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series: " + n1 + ", " + n2);

        int n3;

        for (int i = 1; i <= n - 2; i++) {
            n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }

        System.out.println();
    }

    void largestAmongThree(int a ,int b , int c){
        if(a>b && a>c)
        {
            System.out.println("a is largest number");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is the largest number");
        }
        else{
            System.out.println("c is the largest number ");
        }
    }
     void multiplicationTable(int n){
           for(int i=1;i<=10;i++)
           {
            int t =n*i;
            System.out.println(n + " x " + i + " = " + t);
           }
     }
    public static void main(String[] args) {

        Day2 obj = new Day2();
        obj.positiveNegativeZero(56);
        obj.fibonacci(7);
        obj.largestAmongThree(5,7,1);
        obj.multiplicationTable(3);
    }
}
