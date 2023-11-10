/* Write a Java program to swap two numbers without using a temporary variable.
 * Write a Java program to check if a given year is a leap year or not.
 * Write a Java program to check if a number is even or odd.
 * Write a Java program to find the sum of natural numbers up to a given number.
 */
 class Day1 {
    
        void swapWithoutThirdVar(int a ,int b){

               System.out.println("Befor swapping  a is "+a+ " and b is "+b);

                a = a+b;
                b = a-b;
                a = a-b;

                System.out.println("After swapping  a is "+a+ " and b is "+b);
        }

        void leapYear(int y){
            if(y%4==0 && y%100!=0 || y%400 == 0){
                System.out.println(+y+" is a leap year.");
            }
            else{
                System.out.println(+y+" is not a leap year");
            }
        }

        void checkEvenOdd(int num){
            if(num%2==0){
                System.out.println("The number is even.");
            }
            else{
                System.out.println("The number is odd.");
            }
        }

        void naturalNumberSum(int n){
            int sum = 0;
            for(int i =1;i<=n;i++)
            {
                sum = sum +i;
            }
            System.out.println("The num of " +n+ " natural number is "+sum);
        }

    public static void main(String[] args) {

        Day1 obj = new Day1();

        obj.swapWithoutThirdVar(2,5);
        obj.checkEvenOdd(67);
        obj.naturalNumberSum(4);
        obj.leapYear(1998);
    }
}
