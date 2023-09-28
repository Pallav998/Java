//WAP where vehicle is a parent class and car is a child class and use any method.
class Vehicle{
    void methodstart()
    {
      System.out.println("Vehicle is start enjoy bye bye");
    }
    void methodstop()
    {
        System.out.println("Reached so stop vehicle ");
    }
}
class Car extends Vehicle{
    void  methodaccelerate() 
    {
        System.out.println("Car is accelerating.");
    }

    void methodbrake() 
    {
        System.out.println("Car is braking.");
    }
}

public class Inh2 {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.methodstart();
        myCar.methodstop();

        myCar.methodaccelerate();
        myCar.methodbrake();
    }
}
