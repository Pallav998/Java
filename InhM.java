
// Interface for color
interface Color {
    String getColor();
}

class Tree {
    String type;

    public Tree(String type) {
        this.type = type;
    }

    public void grow() {
        System.out.println(type + " tree is growing.");
    }
}

// Child class 1
class Grapes extends Tree implements Color {
    String color;

    public Grapes(String type, String color) {
        super(type);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void produceJuice() {
        System.out.println("Making " + color + " grapes juice.");
    }
}

// Child class 2
class Papaya extends Tree implements Color {
    String color;

    public Papaya(String type, String color) {
        super(type);
        this.color = color;
    }

    
    public String getColor() {
        return color;
    }

    public void sliceAndEat() {
        System.out.println("Slicing and eating " + color + " papaya.");
    }
}



public class InhM {
    public static void main(String[] args) {
        Grapes grapes = new Grapes("Grapes", "Purple");
        Papaya papaya = new Papaya("Papaya", "Orange");

        grapes.grow();
        System.out.println("Grapes color: " + grapes.getColor());
        grapes.produceJuice();

        papaya.grow();
        System.out.println("Papaya color: " + papaya.getColor());
        papaya.sliceAndEat();
    }
}
