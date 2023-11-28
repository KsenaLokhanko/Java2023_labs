package ToyRoom;

/**
 * Represents a doll, which is a specific type of toy.
 */
public class Doll extends Toy {
    /**
     * Constructs a ToyRoom.Doll with a name, price, and age group.
     *
     * @param name     Name of the doll.
     * @param price    Price of the doll.
     * @param ageGroup Age group for the doll.
     */
    public Doll(String name, double price, int ageGroup) {
        super(name, price, ageGroup);
    }

    /**
     * Returns a string representation of the doll.
     *
     * @return String representation of the doll.
     */
    @Override
    public String toString() {
        return "ToyRoom.Doll, name='" + getName() + "'" +
                ", price=" + getPrice() +
                ", ageGroup=" + getAgeGroup();
    }
}
