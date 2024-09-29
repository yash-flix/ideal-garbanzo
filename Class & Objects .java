import java.io.*;
class Car {   
    String brand;
    String color;    
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}

public class Mclaren{
    public static void main(String args[]) {   
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
 
        car1.brand = "Scorpio";
        car1.color = "Black";
       
        car2.brand = "BMW";
        car2.color = "Black";

        car3.brand = "Ferrari";
        car3.color = "Red";         
        System.out.println("Car 1 Information:");
        car1.displayInfo();

        System.out.println("\nCar 2 Information:");
        car2.displayInfo();
 
        System.out.println("\nCar 3 Information:");
        car3.displayInfo();

    }
}
