public class Basics {

    static void sumOfTwoNum(int a , int b){
         int sum = a +b;
         System.out.println(sum);
    }

    static void checkNumEvenOrOdd(int n){
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("It is odd number ");
        }
       
    }

    static void findFactorial(int n){
        int f = 1;
        for(int i =1;i<=n;i++){
            f = f*i;
        }
        System.out.println("Factorial of the given is :"+f);
    }

    public static void main(String[] args) {
     sumOfTwoNum(5, 4);
     checkNumEvenOrOdd(9);
     findFactorial(7);
    }
}

