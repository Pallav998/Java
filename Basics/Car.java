public class Car {
    String make;
    String model;
    int year;

    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("A new car is created: " + year + " " + make + " " + model);
    }

    public static void main(String[] args) {
    
        Car myCar = new Car("Toyota", "Camry", 2022);

        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
    }
}
