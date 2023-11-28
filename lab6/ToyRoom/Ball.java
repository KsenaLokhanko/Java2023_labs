package ToyRoom;

/**
 * Represents a ball, which is a specific type of toy.
 */
public class Ball extends Toy {
    /**
     * Constructs a ToyRoom.Ball with a name, price, and age group.
     *
     * @param name     Name of the ball.
     * @param price    Price of the ball.
     * @param ageGroup Age group for the ball.
     */
    public Ball(String name, double price, int ageGroup) {
        super(name, price, ageGroup);
    }

    /**
     * Returns a string representation of the ball.
     *
     * @return String representation of the ball.
     */
    @Override
    public String toString() {
        return "ToyRoom.Ball, name='" + getName() + "'" +
                ", price=" + getPrice() +
                ", ageGroup=" + getAgeGroup();
    }
}
