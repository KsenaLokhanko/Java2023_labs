package ToyRoom;

import java.util.List;

/**
 * The ToyRoom.Main class serves as the entry point for the toy room application.
 * It demonstrates the functionality of the ToyRoom.ToyRoom class by creating toys,
 * managing a toy room, and performing various operations.
 */
public class Main {
    /**
     * The main method is the entry point for the toy room application.
     * It creates toy objects, initializes a toy room, and performs operations
     * such as sorting toys by name, finding toys within a price range,
     * and checking if the budget is exceeded.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create toys for testing
        Toy smallCar1 = new SmallCar("Small Car 1", 3.0, 3);
        Toy smallCar2 = new SmallCar("Small Car 2", 10.5, 3);
        Toy policeCar1 = new PoliceCar("Police Car 1", 25.0, 5);
        Toy barbie = new Doll("Barbie", 15.0, 7);
        Toy jessica = new Doll("Jessica", 12.0, 10);
        Toy ball1 = new Ball("ToyRoom.Ball 1", 5.0, 5);

        // Create an array of toys
        Toy[] toysInRoom = {smallCar1, smallCar2, policeCar1, barbie, jessica, ball1};
        // Set the budget for the toy room
        double budget = 80.0;
        // Create a ToyRoom.ToyRoom with the array of toys and the budget
        ToyRoom toyRoom = new ToyRoom(toysInRoom, budget);

        // Display the total cost of toys and check if the budget is exceeded
        System.out.println("Total cost of toys: " + toyRoom.calculateTotalCost());
        if (toyRoom.isBudgetExceeded()) {
            System.err.println("Budget exceeded. Stopping the program.");
            System.exit(0);
        }

        // Sort and display toys by name
        System.out.println("Sorted toys by name: ");
        List<Toy> sortedToys = toyRoom.sortToysByName();
        for (Toy toy : sortedToys) {
            System.out.println(toy);
        }
        System.out.println();

        // Find and display toys within a specific price range
        System.out.println("Found toys within the price range: ");
        List<Toy> foundToy = toyRoom.findToyByPriceRange(5.0, 14.0);
        if (!foundToy.isEmpty()) {
            for (Toy toy : foundToy) {
                System.out.println(toy);
            }
        } else {
            System.out.println("No toys within the price range");
        }
    }
}
