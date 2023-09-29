//WAP for hierarchical inheritance
class Bird {
    void fly() {
        System.out.println("Birds are flying.");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("Peacock is danceing.");
    }
}

class Parrot extends Bird {
    void tell() {
        System.out.println("Parrot is telling Mitthu Mitthu.");
    }
}
class  Nightangle extends Bird {
    void sing() {
        System.out.println("Nightangle is singing .");
    }
}

public class Hier1 {
    public static void main(String[] args) {
        Peacock thePeacock = new Peacock();
        Parrot theParrot = new Parrot();
        Nightangle theNightangle = new Nightangle();

        
        thePeacock.fly();
        theParrot.fly();
        theNightangle.fly();

        
        thePeacock.dance();
        theParrot.tell();
        theNightangle.sing();
    }
}



