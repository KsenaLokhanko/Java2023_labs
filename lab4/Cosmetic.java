package lab4;

/**
 * The `Cosmetic` class represents a cosmetic product with properties like product type, brand, shade, price,
 * and whether it is hypoallergenic.
 */
public class Cosmetic {
/**
     * The type or category of the cosmetic product.
     */
    private String productType;

    /**
     * The brand of the cosmetic product.
     */
    private String brand;

    /**
     * The shade or color of the cosmetic product.
     */
    private String shade;

    /**
     * The price of the cosmetic product.
     */
    private double price;

    /**
     * Indicates whether the cosmetic product is hypoallergenic or not.
     */
    private boolean isHypoallergenic;
    
    /**
     * Constructs a new `Cosmetic` object with the specified properties.
     *
     * @param productType     The type of cosmetic product (e.g., lipstick, foundation).
     * @param brand           The brand of the cosmetic product.
     * @param shade           The shade or color of the cosmetic product.
     * @param price           The price of the cosmetic product.
     * @param isHypoallergenic Whether the cosmetic product is hypoallergenic or not.
     */
    public Cosmetic(String productType, String brand, String shade, double price, boolean isHypoallergenic) {
        this.productType = productType;
        this.brand = brand;
        this.shade = shade;
        this.price = price;
        this.isHypoallergenic = isHypoallergenic;
    }

    /**
     * Gets the product type of the cosmetic.
     *
     * @return The product type.
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Gets the brand of the cosmetic.
     *
     * @return The brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Gets the shade or color of the cosmetic.
     *
     * @return The shade.
     */
    public String getShade() {
        return shade;
    }

    /**
     * Gets the price of the cosmetic.
     *
     * @return The price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Checks whether the cosmetic is hypoallergenic or not.
     *
     * @return True if the cosmetic is hypoallergenic, false otherwise.
     */
    public boolean getIsHypoallergenic() {
        return isHypoallergenic;
    }
}

