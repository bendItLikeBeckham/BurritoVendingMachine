import java.util.ArrayList;

/**
 * A Class that creates the actual vending machine that the user can use. This also contains information
 * of the vending machine itself.
 */

public class VendingMachine {
    
    private ArrayList<Food> slots;
    private double moneyStock;
    private int salesNum = 0;
    private double totalCashMade = 0;
    private Money machineMoney = new Money();

    /**
     * Class Constructor
     */
    public VendingMachine () {                                        
        this.slots = new ArrayList<Food>();
        this.slots = addItems(); 
        this.moneyStock = machineMoney.getTotalAmount();
    }

    /**
     * Creates an Array List that holds all the food items that will be stored in the vending machine. 
     * This includes all information about each food item
     * 
     * @return  The Array List with all information about the food
     */
    public ArrayList<Food> addItems() {                                                                      
        ArrayList<Food> arr = new ArrayList<Food>();
        arr.add(new Food("Tortilla", 10, 237, 49)); 
        arr.add(new Food("Beef",10,250,78));
        arr.add(new Food("BlackBeans", 10, 114, 25));
        arr.add(new Food("ChilliPepper", 10, 40, 15));
        arr.add(new Food("Tomato", 10, 33, 20));
        arr.add(new Food("Lettuce", 10, 15, 10));
        arr.add(new Food("HotSauce", 10, 11,25));
        arr.add(new Food("Onion", 10, 44, 16));

        return arr;
      }

    public void displayItems() { // Displays the Food Items including all available information such as stock, calories and price

        System.out.println("Food name Stock Calories Price");

        for (Food item : this.slots) { 
            System.out.println(item.toString());
        }
    }

    /**
     * Returns the total amount of money with the denominations included in the Vending machine
     * @return this.moneyStock
     */
    public double getMoneyStock () {                               
        return this.moneyStock;
    }

    /**
     * Returns the total amount of money the vending machine has made
     * @return totalCashMade
     */
    public double getTotalCashMade() {  
        return totalCashMade;
    }

    /**
     * Updates the number of times an item was bought
     */
    public void updateSold() {
        this.salesNum = this.salesNum + 1;
    }
    
    /**
     * Displays availability of a specific Food instance
     */
    public void displayAvailability() {                                            

        for (Food item : this.slots) { 
            System.out.println(item.getAvailability());
        }
    }
    
    /**
     * Displays the menu for restocking an item and validates if restock was successful
     * @param name      Name of the Item
     * @param stock     How Much Stocks of the Item is available
     */
    public void displayRestock(String name, int stock) {  
        int found = 0;

        for (Food item : this.slots) { 

            if (name.equalsIgnoreCase(item.getName())) {
                item.restock(stock);
                item.getAvailability();
                found = 1;
            }
        }
        if (found == 0) 
            System.out.println("Item does not exist....");
    }

    /**
     * Displays the new price for an item
     * @param name      Name of the Item
     * @param price     Price of the Item
     */
    public void displayNewPrice (String name, double price) {           //
        int found = 0;

        for (Food item : this.slots) { 
            if (name.equalsIgnoreCase(item.getName())) {
                item.setPrice(price);
                System.out.println("New price of " + item.getName() + " is " + item.getPrice());
                found = 1;
            }    
        }

        if (found == 0) 
            System.out.println("Item does not exist....");

    }

     
    /**
     * Updates the vending machine after the user has bought an item. This includes the amount of money and number of stock in
     * the vending machine, as well as the number of items sold and the amount of cash the machine has made
     * <p>
     * Validates if the user has inputed valid inputs such as if the name of the item exists, 
     * if there is not enough money paid, or if there is not enough stock
     * @param name          Name of the Item
     * @param moneyPaid     Amount of Money the user has paid
     * @param customerBills Amount of Bills given by the user for each denomination
     */
    public void transaction (String name, double moneyPaid, Money customerBills) {        
        int found = 0;
        Money changeBills = new Money();

        machineMoney.addMoney(customerBills.getOneThousandPesos(), customerBills.getFiveHundredPesos(), customerBills.getTwoHundredPesos(), 
                customerBills.getHundredPesos(), customerBills.getFiftyPesos(), customerBills.getTwentyPesos(), 
                customerBills.getTenPesos(), customerBills.getFivePesos(), customerBills.getOnePeso());
                
        if(name.equalsIgnoreCase("X")) {
            System.out.println("Transaction cancelled....");
            countDenominations((int)customerBills.getTotalAmount(), changeBills);
            machineMoney.updateMachine(changeBills.getOneThousandPesos(), changeBills.getFiveHundredPesos(), changeBills.getTwoHundredPesos(), 
                changeBills.getHundredPesos(), changeBills.getFiftyPesos(), changeBills.getTwentyPesos(), 
                changeBills.getTenPesos(), changeBills.getFivePesos(), changeBills.getOnePeso());
        }

        for (Food item : this.slots) { 
            if (name.equalsIgnoreCase(item.getName()) && item.getStock() > 0 && item.getPrice() < moneyPaid) {    

                item.updateStock();
                item.addNumItems();
                updateSold();

                double change= getChange(moneyPaid, item.getPrice());
                totalCashMade = totalCashMade + item.getPrice();

                countDenominations((int)change, changeBills);
                machineMoney.updateMachine(changeBills.getOneThousandPesos(), changeBills.getFiveHundredPesos(), changeBills.getTwoHundredPesos(), 
                changeBills.getHundredPesos(), changeBills.getFiftyPesos(), changeBills.getTwentyPesos(), 
                changeBills.getTenPesos(), changeBills.getFivePesos(), changeBills.getOnePeso());
                System.out.println("Food has been dispensed....");
                System.out.println("Producing change of...." + change + " pesos");

                found = 1;
            }       
        }

        if (found == 0 && !name.equalsIgnoreCase("X")) 
            System.out.println("Item does not exist....Or check amount paid...Or check stock");
    }

    /**
     * Returns the change of the user
     * @param moneyPaid     Amount of money the user paid
     * @param price         Price of the item bought
     * @return              Change of the user
     */
    public double getChange(double moneyPaid, double price) {
        return moneyPaid - price; 
    }

    /**
     * Determines the number of bills from a specific amount
     * and updates the number of bills in the money stock 
     * @param amount        Amount to Add
     * @param moneyStock    Current Money Stock
     */
    public void countDenominations(int amount, Money moneyStock)
    {      
        int[] notes = new int[]{1000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] noteCounter = new int[9];
      
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        moneyStock.setOneThousandPesos(noteCounter[0]);
        moneyStock.setFiveHundredPesos(noteCounter[1]);
        moneyStock.setTwoHundredPesos(noteCounter[2]);
        moneyStock.setHundredPesos(noteCounter[3]);
        moneyStock.setFiftyPesos(noteCounter[4]);
        moneyStock.setTwentyPesos(noteCounter[5]);
        moneyStock.setTenPesos(noteCounter[6]);
        moneyStock.setFivePesos(noteCounter[7]);
        moneyStock.setOnePeso(noteCounter[8]);

    }

    /**
     * Displays the number of times a specific item was sold
     */
    public void displayFoodSold () {

        for (Food item : this.slots) { 
            System.out.println("Number of " + item.getName() + " sold is " + item.getNumItemSold());
        }    
    }

    /**
     * Returns the money in the vending machine
     * @return this.machineMoney
     */
    public Money getMachineMoney () {
        return this.machineMoney; 
    }

     /**
     * Gets the array list of Food slots
     * @return slots
     */
    public ArrayList<Food> getSlots() {
        return this.slots;
    }


    /**
     * Sets the total amount of money the vending machine has made
     * @param totalCashMade the total amount of cash that was made from the transaction.
     */
    public void setTotalCashMade(double totalCashMade) {  
        this.totalCashMade = totalCashMade;
    }

}
