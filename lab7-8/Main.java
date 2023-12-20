/*
 * Java 2023 labs
 *
 * Kseniia Lokhanko
 */

/**
 * The Main Class
 */
public class Main {

    public static void main(String[] args) throws MyException {
        /**
         * Initializing toys
         */
        Toy teddyBear = null;
        Toy toyCar = null;
        Toy doll = null;
        Toy actionFigure = null;
        Toy k = null;
        Toy m = null;
        /**
         * Giving value to toys and testing them on wrong input
         */
        try {
            teddyBear = new Toy("Плюшевий ведмідь", 16);
            toyCar = new Toy("Машинка", 40);
            doll = new Toy("Лялька", 25);
            actionFigure = new Toy("Герой", 16);
            k = new Toy("R", -1874545);
            m = new Toy("Pine", -1000);
        } catch (MyException e) {
            e.printStackTrace();
        }
        /**
         * Adding toys to my collection of toys
         */
        ToysCollection<Toy> toyBox = new ToysCollection();
        try {
            toyBox.add(m);
            toyBox.add(k);
            toyBox.add(teddyBear);
            toyBox.add(toyCar);
            toyBox.add(doll);
            toyBox.add(actionFigure);

        } catch (NullPointerException e) {
            System.out.println("null exception");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        /**
         * Print toy box
         */
        System.out.println("My toy box: ");
        for (Toy i : toyBox) {
            System.out.println(i);
        }

        /**
         * Find toys with size in selected range
         */
        int min_size = 10;
        int max_size = 30;
        System.out.println("\nToys with size between 10 and 30: ");
        for (Toy i : toyBox) {
            if (min_size <= i.size && max_size >= i.size) {
                System.out.println(i);
            }
        }
    }
}
