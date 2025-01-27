/**
 * A Class that contains all the information about the food items that will
 * be sold by the vending machine
 */

public class Food {

    private String name;
    private int stock;
    private int calories; 
    private double price; 
    private int numItemSold = 0; 

    /**
     * Class Constructor that includes information of the food
     * @param name      name of the food
     * @param stock     Amount of stock of the food in the vending machine
     * @param calories  Calories in the food
     * @param price     Price of the food
     */
    public Food (String name, int stock, int calories, double price) {
        this.name = name;
        this.stock = stock;
        this.calories = calories;
        this.price = price;
    }

    /**
     * Returns Number of items sold
     * @return this.numItemSold
     */
    public int getNumItemSold() {
        return this.numItemSold;
    }

    /**
     * Adds the certain number of items
     */
    public void addNumItems () {
        this.numItemSold = this.numItemSold + 0;
    }

    /**
     * Returns name of the food
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the amount of stock of a food
     * @return this.stock
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Returns the amount of calories of a food
     * @return this.calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * Returns the price of a food
     * @return this.price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets Price
     * @param price
     */
    public void setPrice(double price) {
        this.price = price; 
    }

    /**
     * Restocks a food item
     * @param stock Number of Stock to add
     */
    public void restock(int stock) {
        this.stock = this.stock + stock; 
    } 

    /**
     * Displays information about the food
     */
    public String toString() {
        return this.name + " " + this.stock + " " + this.calories + " " + this.price; 
    }

    /**
     * Displays the availability of an item
     * @return this.name + " has " + this.stock + " in stock"
     */
     public String getAvailability() {
        return this.name + " has " + this.stock + " in stock"; 
    }

    /**
     * Updates the stock when a user buys an item
     */
    public void updateStock() {

        this.stock = this.stock - 1;
        this.numItemSold = this.numItemSold + 1;
    }

    /**
     * Decreases the stock during a special vending machine purchase
     * @param amount The value of how much you want to decrease the stock
     */
    public void reduceStock (int amount) {
        this.stock = this.stock - amount;
        this.numItemSold = this.numItemSold + amount;
    }

}