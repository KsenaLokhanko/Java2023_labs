package ToyRoom;

/**
 * Represents a police car, which is a specific type of toy.
 */
public class PoliceCar extends Toy {
    /**
     * Constructs a ToyRoom.PoliceCar with a name, price, and age group.
     *
     * @param name     Name of the police car.
     * @param price    Price of the police car.
     * @param ageGroup Age group for the police car.
     */
    public PoliceCar(String name, double price, int ageGroup) {
        super(name, price, ageGroup);
    }

    /**
     * Returns a string representation of the police car.
     *
     * @return String representation of the police car.
     */
    @Override
    public String toString() {
        return "ToyRoom.PoliceCar, name='" + getName() + "'" +
                ", price=" + getPrice() +
                ", ageGroup=" + getAgeGroup();
    }
}
