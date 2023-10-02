package lab4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This is the main class of the program.
 * This class demonstrates printing an array of objects of the `Cosmetic` class and sorting it.
 * @author Lokhanko Kseniia, IO-11
 * @version 1.0 02.10.2023
 */
public class Main {

    /**
     * The main method of this program
     */
    public static void main(String[] args) {
        // Defining the task variant
        int N = 1117;
        System.out.printf("C11=%d;\n", N % 11);
        System.out.println("Визначити клас косметика, який складається як мінімум з 5-и полів.");

        // Create an array of Cosmetic objects
        Cosmetic[] cosmeticProducts = new Cosmetic[]{
                new Cosmetic("Lipstick", "LANCOME", "Red", 8.99, false),
                new Cosmetic("Foundation", "GlamBee", "Beige", 19.99, true),
                new Cosmetic("Mascara", "MAYBELLINE", "Black", 10.59, true),
                new Cosmetic("Eyeshadow", "LANCOME", "Blue", 14.99, false)
        };

        // Check for exceptions
        for (Cosmetic object : cosmeticProducts) {
            if (object.getPrice() < 0) {
                System.err.format("%.2f$ - prise for %s %s is negative, it must be at least more than zero.",
                        object.getPrice(),
                        object.getProductType(),
                        object.getBrand());
                return;
            }
        }
        System.out.println("\nNot sorted:");
        printArr(cosmeticProducts);
        // Sort by ascending price (using Comparator)
        Arrays.sort(cosmeticProducts, Comparator.comparingDouble(Cosmetic::getPrice));
        System.out.println("\nSorted by prise:");
        printArr(cosmeticProducts);
        // Sort by name in reverse (using Comparator)
        Arrays.sort(cosmeticProducts, Comparator.comparing(Cosmetic::getProductType).reversed());
        System.out.println("\nSorted by abc revers:");
        printArr(cosmeticProducts);
    }

    /**
     * Method for outputting an array.
     * The output text is formatted.
     *
     * @param array an array to be printed.
     */
    private static void printArr(Cosmetic[] array) {
        for (Cosmetic object : array) {
            System.out.format("%s %s, %s, prise: %.2f$, is hypoallergenic: %b\n",
                    object.getProductType(),
                    object.getBrand(),
                    object.getShade(),
                    object.getPrice(),
                    object.getIsHypoallergenic());
        }
    }
}
