//WAP for the example of heirarchical inheritance.

class Father {
   static String name  = "Thakur";
}
class  Son1 extends Father {
    int age =19;
}
class  Son2 extends Father {
     int age =16;
}
class  Daughter extends Father {
     int age =12;
}

public class Hierch {
    public static void main(String[] args) {
        System.out.println(Father.name); 
        Son1 obj = new Son1();
        Son2 obj2 = new Son2();
        Daughter obj3 = new Daughter();

        System.out.println("Son1's age: " + obj.age);
        System.out.println("Son2's age: " + obj2.age);
        System.out.println("Daughter's age: " + obj3.age);
    }

    }

