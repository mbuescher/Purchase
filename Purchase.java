
/**
 * This class represents an item to be purchased, including the item
 * name, the price, and the quantity.
 *
 * @author Michael Buescher and APCS-A
 * @version (2018-09)
 */
public class Purchase
{
    private String itemName;
    private int quantity;
    private double price;
    private double totalCost;
    
    /**
     * Constructor for the class Purchase
     * @param name          The name of the item
     * @param theQuantity   How many of the item to purchase
     * @param thePrice      The price of the item
     */
    public Purchase (String name, int theQuantity, double thePrice)
    {
        itemName = name;
        quantity = theQuantity;
        price = thePrice;
        totalCost = quantity * price;
    }
    
    // ---------------------- Accessor Methods --------------------------
    /**
     * Returns the name of the item purchased
     * @return The name of the item purchased
     */
    public String getItemName()
    {
        return itemName;
    }
    
    /**
     * Returns the quantity of the item purchased
     * @return The quantity of the item purchased
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Returns the price of the item purchased
     * @return The price of the item purchased
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Returns the total cost of the Purchase
     * @return The total cost of the Purchase
     */
    public double getTotalCost()
    {
        return totalCost;
    }
    
    // -------------------- Mutator Methods ------------------------
    /**
     * Change the quantity of the item purchased
     * @param  n  The new quantity purchased
     */
    public void setQuantity (int n)
    {
        quantity = n;
        totalCost = quantity * price;
    }
    
    /**
     * Change the name of the item purchased
     * @param  str  The new name of the item purchased
     */
        public void setItemName (String str)
    {
        itemName = str;
    }
    
    /**
     * Change the price of the item purchased
     * @param  p  The new price of the item purchased
     */
        public void setPrice (double p)
    {
        price = p;
        totalCost = quantity * price;
    }
    
    // -------------------------- Other Methods ------------------------------
    /**
     * Returns a String representing the Purchase.
     * Example: "5 avocados @ $0.99 = $4.95"
     * @return a String representing the Purchase.
     */
    public String toString ()
    {
        String ans = quantity + " " + itemName + " @ $" + price + 
                        " = $" + (quantity * price);
        return ans;
    }
}




