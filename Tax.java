//WAP for tax calculation , where salary <=10000 no tax ,salary > 10000 b/w salary <=10000 10% tax salary>100000 20% tax.

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        int sal; double tax;
        System.out.print("Enter Salary:");
        Scanner s = new Scanner(System.in);
        sal=s.nextInt();
        if(sal<=10000)
        {
            System.out.println(sal + "No Tax");
        }
        else if(sal>10000 && sal<=10000)
        {
                tax=sal*0.10;
                System.out.println(sal + " Tax is :"  +tax);
        }
        else
        {
                tax=sal*0.20;
                System.out.println(sal + " Tax is  :" +tax);
        }
    }
}
