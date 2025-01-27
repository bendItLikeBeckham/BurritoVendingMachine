import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Class that creates a special vending machine that the user can use to cook products based on the ingredients that are
 * available to the customer. This also contains information
 * of the vending machine itself.
 */

public class SpecialVendingMachine extends VendingMachine {


    /**
     * Class Constructor
     */
    public SpecialVendingMachine() {
        super();
        
    }


    /**
     * This function returns the integer array list value of the number of ingredients chosen by the user in customizing their Burrito
     * @param slots The Food array list containing the number the ingredients part of the vending machine
     */
    public ArrayList<Integer> getTotalIngredients(ArrayList<Food> slots) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        
        for (Food f : slots) {
            boolean repeat = false;
            do {                
                System.out.println("How much " + f.getName() + " would you like to avail? : ");
                int amount = sc.nextInt();
                if(amount > f.getStock() || amount < 0) {      
                    if(amount < 0)
                        System.out.println("Negative numbers aren't allowed, try again");
                    else
                        System.out.println("There aren't enough " + f.getName() + " in stock. There are " + f.getStock() + " left. Apologies!");
                    repeat = true;
                } else {
                    list.add(amount);
                    repeat = false;
                }
            } while(repeat == true);
        }
        return list;
    }


    /**
     * This computes the total price of the customizable Burrito
     * @param list is the integer ArrayList that contains the number of each ingredient availed
     * @param slots The Food array list containing the number the ingredients part of the vending machine
     * @return price 
     */
    public double computeTotalPrice(ArrayList<Integer> list, ArrayList<Food> slots) {

        double price = 0;
        for (int i = 0; i < list.size(); i++) {
            price += slots.get(i).getPrice() * list.get(i);
        }
        return price;
    }

     /**
     * This computes the total calories of the customizable Burrito
     * @param list is the integer ArrayList that contains the number of each ingredient availed
     * @param slots The Food array list containing the number the ingredients part of the vending machine
     * @return calories 
     */
    public int computeCalories(ArrayList<Integer> list, ArrayList<Food> slots) {

        int calories = 0;
        for (int i = 0; i < list.size(); i++) {
            calories += slots.get(i).getCalories() * list.get(i);
        }
        return calories;
    }

     /**
     * This updates the stocks of the ingredients that are used in the customizable Burrito
     * @param list is the integer ArrayList that contains the number of each ingredient availed
     * @param slots The Food array list containing the number the ingredients part of the vending machine
     */
    public void updateStocks (ArrayList<Integer> list, ArrayList<Food> slots) {
        int i = 0;

        for (Food f : slots) {
            f.reduceStock(list.get(i));
            i += 1;
        }

    }
    
      
    /**
     * Updates the vending machine after the user has bought the customizable burrito. This includes the amount of money and number of stock in
     * the vending machine
     * <p>
     * @param totalPrice    Total price of the customizable burrito
     * @param moneyPaid     Amount of Money the user has paid
     * @param customerBills Amount of Bills given by the user for each denomination
     */
    public void specialTransaction (double totalPrice, double moneyPaid, Money customerBills) {        
        Money changeBills = new Money();

                this.getMachineMoney().addMoney(customerBills.getOneThousandPesos(), customerBills.getFiveHundredPesos(), customerBills.getTwoHundredPesos(), 
                customerBills.getHundredPesos(), customerBills.getFiftyPesos(), customerBills.getTwentyPesos(), 
                customerBills.getTenPesos(), customerBills.getFivePesos(), customerBills.getOnePeso());
                
        
                double change= getChange(moneyPaid, totalPrice);
                this.setTotalCashMade(getTotalCashMade() + totalPrice);
                
                countDenominations((int)change, changeBills);
                this.getMachineMoney().updateMachine(changeBills.getOneThousandPesos(), changeBills.getFiveHundredPesos(), changeBills.getTwoHundredPesos(), 
                changeBills.getHundredPesos(), changeBills.getFiftyPesos(), changeBills.getTwentyPesos(), 
                changeBills.getTenPesos(), changeBills.getFivePesos(), changeBills.getOnePeso());
                System.out.println("Producing change of...." + change + " pesos");
            


          
    }
}
