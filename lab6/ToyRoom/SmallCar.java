package ToyRoom;

/**
 * Represents a small car, which is a specific type of toy.
 */
public class SmallCar extends Toy {
    /**
     * Constructs a ToyRoom.SmallCar with a name, price, and age group.
     *
     * @param name     Name of the small car.
     * @param price    Price of the small car.
     * @param ageGroup Age group for the small car.
     */
    public SmallCar(String name, double price, int ageGroup) {
        super(name, price, ageGroup);
    }

    /**
     * Returns a string representation of the small car.
     *
     * @return String representation of the small car.
     */
    @Override
    public String toString() {
        return "ToyRoom.SmallCar, name='" + getName() + "'" +
                ", price=" + getPrice() +
                ", ageGroup=" + getAgeGroup();
    }
}
