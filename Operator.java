import java.util.Scanner;

/**
 * A Class that mainly contains actions that the operator can do when doing
 * maintenance on the vending machine
 */

public class Operator {
    
    /**
     * Restock an item
     * @param machine   Created Vending Machine
     * @param name      Food Name
     * @param stock     Food Stock
     */
    public void restock(VendingMachine machine, String name, int stock) {
            machine.displayRestock(name, stock);
    }

    /**
     * Changes the Price of a food
     * @param machine   Created Vending Machine
     * @param name      Food Name
     * @param newPrice  New Price for the Food
     */
    public void changePrice(VendingMachine machine, String name, double newPrice) {
            machine.displayNewPrice(name, newPrice);
    }
    
    /**
     * Displays the summary of Starting and Current Stock
     * @param machine           Created Vending Machine
     * @param startingStock     Starting Stock
     */
    public void displaySummary(VendingMachine machine, VendingMachine startingStock) {

        System.out.println("Current Stock");
        machine.displayItems();
        System.out.println("---------------------------------------------");
        System.out.println("Starting Stock");
        startingStock.displayItems();
        System.out.println("---------------------------------------------");
        machine.displayFoodSold();
    }

    /**
     * Collects the Cash in the Vending Machine
     * @param machine   Created Vending Machine
     */
    public void collectCash(VendingMachine machine) {
        System.out.println("Collecting cash.....");
        System.out.println("Cash collected is " + machine.getTotalCashMade() + " pesos");
    }
    
    /**
     * Replenishes the Money in the Machine
     * @param machine   Created Vending Machine
     */
    public void getReplenishedMoney (VendingMachine machine) {

        System.out.println("Current Bill counter");
        machine.getMachineMoney().getBills(); 
        System.out.println("-------------------------------");
        Money replenishedMoney = new Money(replenish1000(),replenish500(),replenish200(),replenish100(),replenish50(),replenish20(),replenish10(),replenish5(),replenish1());
        machine.getMachineMoney().addMoney(replenishedMoney.getOneThousandPesos(), replenishedMoney.getFiveHundredPesos(), 
        replenishedMoney.getTwoHundredPesos(), replenishedMoney.getHundredPesos(), 
        replenishedMoney.getFiftyPesos(), replenishedMoney.getTwentyPesos(), 
        replenishedMoney.getTenPesos(), replenishedMoney.getFivePesos(), replenishedMoney.getOnePeso());
        System.out.println("-------------------------------");
        System.out.println("New Bill counter");
        machine.getMachineMoney().getBills(); 


    }

    /**
     * Returns Number of 1000 Peso Bills Replenished
     * @return payment
     */
    public int replenish1000() {
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
     * Returns Number of 500 Peso Bills Replenished
     * @return payment
     */
    public int replenish500() {
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
     * Returns Number of 200 Peso Bills Replenished
     * @return payment
     */
    public int replenish200() {
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
     * Returns Number of 100 Peso Bills Replenished
     * @return payment
     */
    public int replenish100() {
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
     * Returns Number of 50 Peso Bills Replenished
     * @return payment
     */
    public int replenish50() {
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
     * Returns Number of 20 Peso Bills Replenished
     * @return payment
     */
    public int replenish20() {
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
     * Returns Number of 10 Peso Coins Replenished
     * @return payment
     */
    public int replenish10() {
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
     * Returns Number of 5 Peso Coins Replenished
     * @return payment
     */
    public int replenish5() {
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
     * Returns Number of 1 Peso Coins Replenished
     * @return payment
     */
    public int replenish1() {
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



}
