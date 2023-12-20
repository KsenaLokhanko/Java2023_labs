/**
 * Class Toy defines a toy with its name and size.
 * ToysCollection implements interface Set
 */
public class Toy {

    public String name = "";
    public int size = 0;

    /**
     * Constructor of an empty toy
     */
    public Toy() {
    }

    /**
     * Standard constructor of a toy
     */
    public Toy(String name, int size) throws MyException {
        if (size < 0) {
            throw new MyException();
        } else {
            this.name = name;
            this.size = size;
        }
    }

    /**
     * Method to print attributes of the toy
     *
     * @return void
     */
    public String toString() {
        return "Іграшка: " + name + "; Розмір: " + size + " см";
    }
}
