//WAP for hierarchical inheritance
class Father {
    void earn() {
        System.out.println("Father is earning.");
    }
}
class  Son extends Father {
    void money() {
        System.out.println("Son wants money.");
    }
}
class  Daughter extends Father {
    void gift() {
        System.out.println("Daughter wants gift.");
    }
}

public class Hierarchical2 {
    public static void main(String[] args) {
        Son theSon = new Son();
        Daughter theDaughter = new Daughter();

        theSon.earn();
        theDaughter.earn();

        theSon.money();
        theDaughter.gift();
}
    
}
