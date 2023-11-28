package ToyRoom;

/**
 * Represents a generic toy with a name, price, and age group.
 */
public class Toy {
    private final String name;
    private final double price;
    private final int ageGroup;

    /**
     * Constructs a ToyRoom.Toy with a name, price, and age group.
     *
     * @param name     Name of the toy.
     * @param price    Price of the toy.
     * @param ageGroup Age group for the toy.
     */
    public Toy(String name, double price, int ageGroup) {
        this.name = name;
        this.price = price;
        this.ageGroup = ageGroup;
    }

    /**
     * Gets the name of the toy.
     *
     * @return Name of the toy.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the toy.
     *
     * @return Price of the toy.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the age group for the toy.
     *
     * @return Age group for the toy.
     */
    public int getAgeGroup() {
        return ageGroup;
    }

    /**
     * Returns a string representation of the toy.
     *
     * @return String representation of the toy.
     */
    @Override
    public String toString() {
        return "ToyRoom.Toy name='" + name + "', price=" + price + ", ageGroup=" + ageGroup;
    }
}
