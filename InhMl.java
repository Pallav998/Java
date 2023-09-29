class A {
    int a, b, c;

    void add() {
        a = 12;
        b = 8;
        c = a + b;
        System.out.println(" Sum of two numbers is: " + c);
    }

    void sub() {
        a = 12;
        b = 8;
        c = a - b;
        System.out.println(" Subtraction of two numbers is: " + c);
    }
}

class B extends A {
    void multy() {
        a = 12;
        b = 8;
        c = a * b;
        System.out.println(" Multiplication of two numbers is: " + c);
    }

    void div() {
        a = 12;
        b = 8;
        c = a / b;
        System.out.println(" Division of two numbers is: " + c);
    }
}

class C extends B {
    void rem() {
        a = 12;
        b = 8;
        c = a % b;
        System.out.println(" Remainder of two numbers is: " + c);
    }
}

public class Inhml {
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.multy();
        r.div();
        r.rem();
    }
}
