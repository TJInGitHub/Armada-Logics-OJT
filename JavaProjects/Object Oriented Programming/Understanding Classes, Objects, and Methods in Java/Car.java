// Car class template to create Car objects with brand (string) and year (int) attributes
public class Car {
    String brand;
    int year;

    // Constructor to initialize Car objects when they are created
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display the Car objects info which include brand and year
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    // main method for creation of Car objects
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020); // Creating a Car object
        car1.displayInfo(); // Calling the displayInfo method
    }
}

/* 
Output:
Brand: Toyota
Year: 2020
*/