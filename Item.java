
// ***************************************************************
// Item.java
//
// Represents an item in a shopping cart.
// ***************************************************************
import java.text.NumberFormat;

/**
 * To create a shopping item.
 * @author Hugh
 * @version 1
 */
public class Item {
    private String name;
    private double price;
    private int quantity;

    // ----------------------------------------------------- --
    // Create a new item with the given attributes.
    // ----------------------------------------------------- --
    /**
     * Constructor
     * @param itemName name
     * @param itemPrice price
     * @param numPurchased how many
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    // ----------------------------------------------------- --
    // Return a string with the information about the item
    // ----------------------------------------------------- --
    /**
     * Return a layout
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t\t" + quantity + "\t\t" + fmt.format(price * quantity));
    }

    // -----------------------------------------------
    // Returns the unit price of the item
    // -----------------------------------------------
    /**
     * get item's price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    // -----------------------------------------------
    // Returns the name of the item
    // -----------------------------------------------
    /**
     * get item's name
     * @return name
     */
    public String getName() {
        return name;
    }

    // -----------------------------------------------
    // Returns the quantity of the item
    // -----------------------------------------------
    /**
     * to know item's quantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }
}
