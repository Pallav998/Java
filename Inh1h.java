//WAP for hierarchical inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class Inh1h {
    public static void main(String[] args) {
        Dog theDog = new Dog();
        Cat theCat = new Cat();

        
        theDog.eat();
        theCat.eat();

        
        theDog.bark();
        theCat.meow();
    }
}
