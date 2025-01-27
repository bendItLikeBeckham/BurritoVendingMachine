import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Class that focuses on transactions made by the user to 
 * purchase products from the vending machine
 */
public class Customer {

    /**
     * Displays the menu for when the user is going to pay for an item, including what items are available
     * @param machine   Vending Machine created by the user
     * @param option    Option for the user to choose to either display items or make a purchase or to create a burrito from the Special Vending Machine
     */
    public void customerMenu (VendingMachine machine, int option) {
        if (option == 1) {
            System.out.println("Displaying items....");
            machine.displayItems();
        }
        else if(option == 2) {
                
                Money paidMoney = new Money(pay1000(),pay500(),pay200(),pay100(),pay50(),pay20(),pay10(),pay5(),pay1());
                System.out.println("paying machine....");
                machine.displayItems();
                System.out.println("Amount paid is...." + paidMoney.getTotalAmount() + " pesos");
                String choice = productChoice(); 
                System.out.println("Dispensing Item....");
                machine.transaction(choice, paidMoney.getTotalAmount(), paidMoney);

            }
        else if (option == 3) {

            if (machine instanceof SpecialVendingMachine) {
                System.out.println("Creating burrito...Choose how much do you want of each ingredient....");

                // List of Amount Chosen for Ingredients
                ArrayList<Integer> listOfIngredients = ((SpecialVendingMachine) machine).getTotalIngredients(machine.getSlots());
                System.out.println(listOfIngredients);

                // Gets total price of all ingredient
                double totalPrice = ((SpecialVendingMachine) machine).computeTotalPrice(listOfIngredients, machine.getSlots());
                System.out.println("Total Price: " + totalPrice);

                
                int totalCalories = ((SpecialVendingMachine) machine).computeCalories(listOfIngredients, machine.getSlots());

                Money paidMoney = new Money(pay1000(),pay500(),pay200(),pay100(),pay50(),pay20(),pay10(),pay5(),pay1());
                System.out.println("paying machine....");
                System.out.println("Amount paid is...." + paidMoney.getTotalAmount() + " pesos");
            
                if (totalPrice <= paidMoney.getTotalAmount()) {
                    ((SpecialVendingMachine) machine).specialTransaction(totalPrice, paidMoney.getTotalAmount(), paidMoney);
                    ((SpecialVendingMachine) machine).updateStocks(listOfIngredients, machine.getSlots());

                    Burrito burrito = new Burrito(listOfIngredients, totalCalories, machine.getSlots()); 
                    burrito.printCookingDisplay();


                    System.out.println("Total Calories of your order is: " + burrito.getCalories());
                    burrito.serveBurrito();

                }
                else 
                    System.out.println("Not enough money inserted....");


  
            } else {
                System.out.println("This feature is only for special vending machine....");
            }
        }
    }

    /**
     * Returns the amount of 1000 Peso Bills the user has given to the vending machine
     * @return payment
     */
    public int pay1000() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 1000 Peso Bills: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed...");
        } while (payment < 0);

        return payment;
    }

    /**
     * Returns the amount of 500 Peso Bills the user has given to the vending machine
     * @return payment
     */
    public int pay500() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 500 Peso Bills: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed...");
        } while (payment < 0);

        return payment;
    }

    /**
     * Returns the amount of 200 Peso Bills the user has given to the vending machine
     * @return payment
     */
    public int pay200() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 200 Peso Bills: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed..."); 
        } while (payment < 0);

        return payment;
    }

    /**
     * Returns the amount of 100 Peso Bills the user has given to the vending machine
     * @return payment
     */
    public int pay100() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 100 Peso Bills: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed...");
        } while (payment < 0);

        return payment;
    }

    /**
     * Returns the amount of 50 Peso Bills the user has given to the vending machine
     * @return payment
     */
    public int pay50() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 50 Peso Bills: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed...");
        } while (payment < 0);
 
        return payment;
    }

    /**
     * Returns the amount of 20 Peso Bills the user has given to the vending machine
     * @return payment
     */
    public int pay20() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 20 Peso Bills: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed...");
        } while (payment < 0);

        return payment;
    }

    /**
     * Returns the amount of 10 Peso Coins the user has given to the vending machine
     * @return payment
     */
    public int pay10() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 10 Peso Coins: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed...");
        } while (payment < 0);

        return payment;
    }

    /**
     * Returns the amount of 5 Peso Coins the user has given to the vending machine
     * @return payment
     */
    public int pay5() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 5 Peso Coins: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed..."); 
        } while (payment < 0);
        return payment;
    }

    /**
     * Returns the amount of 1 Peso Coins the user has given to the vending machine
     * @return payment
     */
    public int pay1() {
        Scanner sc = new Scanner(System.in);
        int payment;
        do {
            System.out.print("How Many 1 Peso Coins: ");
            payment = sc.nextInt();
            if (payment < 0)
                System.out.print("Negative inputs are not allowed...");
        } while (payment < 0);
        return payment;
    }

    /**
     * Returns the item that the user wants to purchase from the machine
     * @return item
     */
    public String productChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("which item would you like to purchase[Input X if you want to cancel]: ");
        String item = sc.next();
        return item;
    }

}
