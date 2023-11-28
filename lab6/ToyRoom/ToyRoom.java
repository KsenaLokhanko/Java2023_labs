package ToyRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * The ToyRoom.ToyRoom class represents a room containing an array of toys.
 */
public class ToyRoom {
    private Toy[] toys;
    private double budget;

    /**
     * Constructs a ToyRoom.ToyRoom with an array of toys and a budget.
     *
     * @param toys   The array of toys in the room.
     * @param budget The allocated budget for the toys in the room.
     */
    public ToyRoom(Toy[] toys, double budget) {
        this.toys = toys;
        this.budget = budget;
    }

    /**
     * Sorts the toys in the room by name and returns the sorted list.
     *
     * @return The list of toys sorted by name.
     */
    public List<Toy> sortToysByName() {
        List<Toy> sortedToys = Arrays.asList(toys);
        sortedToys.sort(Comparator.comparing(Toy::getName));
        return sortedToys;
    }

    /**
     * Finds and returns a list of toys within the specified price range.
     *
     * @param minPrice The minimum price of the toys to be included.
     * @param maxPrice The maximum price of the toys to be included.
     * @return The list of toys within the specified price range.
     */
    public List<Toy> findToyByPriceRange(double minPrice, double maxPrice) {
        List<Toy> matchingToys = new ArrayList<>();
        for (Toy toy : toys) {
            if (toy.getPrice() >= minPrice && toy.getPrice() <= maxPrice) {
                matchingToys.add(toy);
            }
        }
        return matchingToys;

    }

    /**
     * Calculates and returns the total cost of all toys in the room.
     *
     * @return The total cost of all toys in the room.
     */
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Toy toy : toys) {
            totalCost += toy.getPrice();
        }
        return totalCost;
    }

    /**
     * Checks if the total cost of toys in the room exceeds the allocated budget.
     *
     * @return True if the budget is exceeded, false otherwise.
     */
    public boolean isBudgetExceeded() {
        return calculateTotalCost() > budget;
    }
}
