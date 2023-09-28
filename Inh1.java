//Single inheritance example.
class Parent {
    void parentMethod() {
        System.out.println("This is the parent method.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is the child method.");
    }
}

public class Inh1 {
    public static void main(String[] args) {
        Child childObj = new Child();

        childObj.parentMethod();

        childObj.childMethod();
    }
}