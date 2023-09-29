//Hybrid example
interface Interface1 {
    void method1();
}


interface Interface2 {
    void method2();
}
class Parent {
    void CMethod()
     {
        System.out.println("C method in Parent class");
    }
}
class Child extends Parent implements Interface1 {
   
    public void method1() {
        System.out.println("Method 1 implementation in Child class");
    }
}
class AnotherChild extends Parent implements Interface2{
    
    public void method2() {
        System.out.println("Method 2 implementation in AnotherChild class");
    }
}
public class Hybrid1 {
    public static void main(String[] args) {
        Child child = new Child();
        AnotherChild anotherChild = new AnotherChild();

       
        child.CMethod();
        child.method1();

        anotherChild.CMethod();
        anotherChild.method2();
    }
}
