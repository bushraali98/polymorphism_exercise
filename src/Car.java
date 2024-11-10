public class Car implements Vehicle{

    private double dailyRate;
    private String model;
    private double days;

    public Car(double dailyRate, String model, int days) {
        this.dailyRate = dailyRate;
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCosts() {
        return (this.dailyRate * this.days);
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + this.model +
                "\nDaily Rental Rate: $" + this.dailyRate +
                "\nRental Cost: $" + this.calculateRentalCosts());

    }

    @Override
    public String toString() {
        return "Car Model: " + model + ", Rental Days: " + days + ", Total Cost: $" + calculateRentalCosts();
    }
}
