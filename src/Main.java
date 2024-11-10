import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        System.out.println("Welcome to Vehicle Rental System");
        String str;

        do {
            System.out.println("Vehicle Rental System" +
            "\n1. Rent a Car" +
                    "\n2. Rent a Bike" +
                    "\n3. Rent a Truck" +
                    "\n4. View Rented Vehicles" +
                    "\n5. Exit");
            System.out.println("Enter your choice: ");
            str = input.nextLine();

            if(str.equals("1")) {
                System.out.println("Enter Car Model ");
                String model = input.nextLine();
                System.out.println("Enter Rental days: ");
                int rentalDays = input.nextInt();
                input.nextLine();
                Vehicle car = new Car(50, model, rentalDays);
                car.calculateRentalCosts();
                System.out.println("Rental Details: ");
                car.displayDetails();
                rentedVehicles.add(car);
                System.out.println("------------------------");
            } else if (str.equals("2")) {
                System.out.println("Enter a Bike brand: ");
                String type = input.nextLine();
                System.out.println("Enter Rental hours: ");
                int rentalHours = input.nextInt();
                input.nextLine();
                Vehicle bike = new Bike(10, type, rentalHours);
                bike.calculateRentalCosts();
                System.out.println("Rental Details: ");
                bike.displayDetails();
                rentedVehicles.add(bike);
                System.out.println("------------------------");
            } else if (str.equals("3")) {
                System.out.println("Enter a Truck type: ");
                String type = input.nextLine();
                System.out.println("Enter Rental Weeks: ");
                int rentalWeeks = input.nextInt();
                input.nextLine();
                Vehicle truck = new Truck(10, type, rentalWeeks);
                truck.calculateRentalCosts();
                System.out.println("Rental Details: ");
                truck.displayDetails();
                rentedVehicles.add(truck);
                System.out.println("------------------------");
            } else if (str.equals("4")) {
                System.out.println("List of Rented vehicles: ");
                for (Vehicle vehicle: rentedVehicles) {
                    System.out.println(vehicle.toString());
                }
                System.out.println("------------------------");
            } else if (!str.equals("5")) {
                System.out.println("Invalid choice, Please try again.");
            }

        } while (!str.equals("5"));

        System.out.println("Thank you for using the Vehicle Rental System. Goodbye!");


    }
}