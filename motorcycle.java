
package javaapplication216;

public class motorcycle extends viechle {

    private int engineCapacity;

    public motorcycle(String brand, String model, int year,
                      int engineCapacity) {

        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }
    public double calculateRentalPrice(int days) {
        return days * 80;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " +engineCapacity + " cc");
    }
    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity + " cc";
    }
}

    

