public class Bike implements Vehicle{

    private double hourlyRate = 10;
    private String brand;
    private int hour;

    public Bike(double hourlyRate, String brand, int hour) {
        this.hourlyRate = hourlyRate;
        this.brand = brand;
        this.hour = hour;
    }

    @Override
    public double calculateRentalCosts() {
        return (this.hourlyRate * this.hour);
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Type: " + this.brand +
                "\nDaily Rental Rate: $" + this.hourlyRate +
                "\nRental Cost: $" + this.calculateRentalCosts());
    }

    @Override
    public String toString() {
        return "Bike Brand: " + brand + ", Rental Hours: " + hour + ", Total Cost: $" + calculateRentalCosts();
    }
}
