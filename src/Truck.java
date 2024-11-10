public class Truck implements Vehicle{

    private double weeklyRate = 500;
    private String type;
    private int week;

    public Truck(double weeklyRate, String type, int week) {
        this.weeklyRate = weeklyRate;
        this.type = type;
        this.week = week;
    }

    @Override
    public double calculateRentalCosts() {
        return (this.weeklyRate * this.week);
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + this.type +
                "\nDaily Rental Rate: $" + this.weeklyRate +
                "\nRental Cost: $" + this.calculateRentalCosts());
    }

    @Override
    public String toString() {
        return "Truck Type: " + type + ", Rental Weeks: " + week + ", Total Cost: $" + calculateRentalCosts();
    }

}
