/**
 * A Class that contains every denomination of bills and coins that the user of 
 * the vending machine will use.
 */

public class Money {
    
    private int numOneThousandPesos;
    private int numFiveHundredPesos;
    private int numTwoHundredPesos;
    private int numHundredPesos;
    private int numFiftyPesos;
    private int numTwentyPesos;
    private int numTenPesos;
    private int numFivePesos;
    private int numOnePeso;

    /**
     * Class Constructor
     */
    public Money() { // Default Money for Vending Machine
        this.numOneThousandPesos = 5;
        this.numFiveHundredPesos = 5;
        this.numTwoHundredPesos = 10;
        this.numHundredPesos = 20;
        this.numFiftyPesos = 20;
        this.numTwentyPesos = 20;
        this.numTenPesos = 20;
        this.numFivePesos = 20;
        this.numOnePeso = 30;
    }

    /**
     * Class Constructor that includes all of the bills and coins
     * @param numOneThousandPesos   Number of 1000 Peso Bills
     * @param numFiveHundredPesos   Number of 500 Peso Bills
     * @param numTwoHundredPesos    Number of 200 Peso Bills
     * @param numHundredPesos       Number of 100 Peso Bills
     * @param numFiftyPesos         Number of 50 Peso Bills
     * @param numTwentyPesos        Number of 20 Peso Bills
     * @param numTenPesos           Number of 10 Peso Coins
     * @param numFivePesos          Number of 5 Peso Coins
     * @param numOnePeso            Number of 1 Peso Coins
     */
    public Money(int numOneThousandPesos, int numFiveHundredPesos, int numTwoHundredPesos, int numHundredPesos, int numFiftyPesos, 
    int numTwentyPesos, int numTenPesos, int numFivePesos, int numOnePeso) { // Stores Payment of Customer
        this.numOneThousandPesos = this.numOneThousandPesos + numOneThousandPesos;
        this.numFiveHundredPesos = this.numFiveHundredPesos + numFiveHundredPesos;
        this.numTwoHundredPesos =   this.numTwoHundredPesos + numTwoHundredPesos;
        this.numHundredPesos =  this.numHundredPesos + numHundredPesos;
        this.numFiftyPesos = this.numFiftyPesos+ numFiftyPesos;
        this.numTwentyPesos = this.numTwentyPesos+ numTwentyPesos;
        this.numTenPesos = this.numTenPesos+ numTenPesos;
        this.numFivePesos = this.numFivePesos + numFivePesos;
        this.numOnePeso =  this.numOnePeso + numOnePeso;
    }

    /**
     * Adds a number of bills to the vending machine
     * @param numOneThousandPesos   Number of 1000 Peso Bills
     * @param numFiveHundredPesos   Number of 500 Peso Bills
     * @param numTwoHundredPesos    Number of 200 Peso Bills
     * @param numHundredPesos       Number of 100 Peso Bills
     * @param numFiftyPesos         Number of 50 Peso Bills
     * @param numTwentyPesos        Number of 20 Peso Bills
     * @param numTenPesos           Number of 10 Peso Coins
     * @param numFivePesos          Number of 5 Peso Coins
     * @param numOnePeso            Number of 1 Peso Coins
     */
    public void addMoney(int numOneThousandPesos, int numFiveHundredPesos, int numTwoHundredPesos, int numHundredPesos, int numFiftyPesos, 
    int numTwentyPesos, int numTenPesos, int numFivePesos, int numOnePeso) { // Stores Payment of Customer
        this.numOneThousandPesos = this.numOneThousandPesos + numOneThousandPesos;
        this.numFiveHundredPesos = this.numFiveHundredPesos + numFiveHundredPesos;
        this.numTwoHundredPesos =   this.numTwoHundredPesos + numTwoHundredPesos;
        this.numHundredPesos =  this.numHundredPesos + numHundredPesos;
        this.numFiftyPesos = this.numFiftyPesos+ numFiftyPesos;
        this.numTwentyPesos = this.numTwentyPesos+ numTwentyPesos;
        this.numTenPesos = this.numTenPesos+ numTenPesos;
        this.numFivePesos = this.numFivePesos + numFivePesos;
        this.numOnePeso =  this.numOnePeso + numOnePeso;
    }

    /**
     * Subtracts a number of bills from the vending machine
     * @param numOneThousandPesos   Number of 1000 Peso Bills
     * @param numFiveHundredPesos   Number of 500 Peso Bills
     * @param numTwoHundredPesos    Number of 200 Peso Bills
     * @param numHundredPesos       Number of 100 Peso Bills
     * @param numFiftyPesos         Number of 50 Peso Bills
     * @param numTwentyPesos        Number of 20 Peso Bills
     * @param numTenPesos           Number of 10 Peso Coins
     * @param numFivePesos          Number of 5 Peso Coins
     * @param numOnePeso            Number of 1 Peso Coins
     */
    public void updateMachine(int numOneThousandPesos, int numFiveHundredPesos, int numTwoHundredPesos, int numHundredPesos, int numFiftyPesos, 
    int numTwentyPesos, int numTenPesos, int numFivePesos, int numOnePeso) { // Stores Payment of Customer
        this.numOneThousandPesos = this.numOneThousandPesos - numOneThousandPesos;
        this.numFiveHundredPesos = this.numFiveHundredPesos - numFiveHundredPesos;
        this.numTwoHundredPesos =   this.numTwoHundredPesos - numTwoHundredPesos;
        this.numHundredPesos =  this.numHundredPesos - numHundredPesos;
        this.numFiftyPesos = this.numFiftyPesos - numFiftyPesos;
        this.numTwentyPesos = this.numTwentyPesos - numTwentyPesos;
        this.numTenPesos = this.numTenPesos - numTenPesos;
        this.numFivePesos = this.numFivePesos - numFivePesos;
        this.numOnePeso =  this.numOnePeso - numOnePeso;
    }

    /**
     * Returns total amount of 1000 Peso Bills
     * @return this.numOneThousandPesos
     */
    public int getOneThousandPesos() {
        return this.numOneThousandPesos;
    }

    /**
     * Returns total amount of 500 Peso Bills
     * @return this.numFiveHundredPesos
     */
    public int getFiveHundredPesos() {
        return this.numFiveHundredPesos;
    }

    /**
     * Returns total amount of 200 Peso Bills
     * @return this.numTwoHundredPesos
     */
    public int getTwoHundredPesos() {
        return this.numTwoHundredPesos;
    }

    /**
     * Returns total amount of 100 Peso Bills
     * @return this.numHundredPesos
     */
    public int getHundredPesos() {
        return this.numHundredPesos;
    }

    /**
     * Returns total amount of 50 Peso Bills
     * @return this.numFiftyPesos
     */
    public int getFiftyPesos() {
        return this.numFiftyPesos;
    }

    /**
     * Returns total amount of 20 Peso Bills
     * @return this.numTwentyPesos
     */
    public int getTwentyPesos() {
        return this.numTwentyPesos;
    }

    /**
     * Returns total amount of 10 Peso Coins
     * @return this.numTenPesos
     */
    public int getTenPesos() {
        return this.numTenPesos;
    }

    /**
     * Returns total amount of 5 Peso Coins
     * @return this.numFivePesos
     */
    public int getFivePesos() {
        return this.numFivePesos;
    }

    /**
     * Returns total amount of 1 Peso Coins
     * @return this.numOnePeso
     */
    public int getOnePeso() {
        return this.numOnePeso;
    }

    /**
     * Sets 1000 Peso Bills
     * @param numOneThousandPesos
     */
    public void setOneThousandPesos(int numOneThousandPesos) {
         this.numOneThousandPesos = numOneThousandPesos;
    }

    /**
     * Sets 500 Peso Bills
     * @param numFiveHundredPesos
     */
    public void setFiveHundredPesos(int numFiveHundredPesos) {
        this.numFiveHundredPesos = numFiveHundredPesos;
    }

    /**
     * Sets 200 Peso Bills
     * @param numTwoHundredPesos
     */
    public void setTwoHundredPesos(int numTwoHundredPesos) {
        this.numTwoHundredPesos = numTwoHundredPesos;
    }

    /**
     * Sets 100 Peso Bills
     * @param numHundredPesos
     */
    public void setHundredPesos(int numHundredPesos) {
         this.numHundredPesos = numHundredPesos;
    }

    /**
     * Sets 50 Peso Bills
     * @param numFiftyPesos
     */
    public void setFiftyPesos(int numFiftyPesos) {
        this.numFiftyPesos = numFiftyPesos;
    }

    /**
     * Sets 20 Peso Bills
     * @param numTwentyPesos
     */
    public void setTwentyPesos(int numTwentyPesos) {
         this.numTwentyPesos = numTwentyPesos;
    }

    /**
     * Sets 10 Peso Coins
     * @param numTenPesos
     */
    public void setTenPesos(int numTenPesos) {
        this.numTenPesos = numTenPesos;
    }

    /**
     * Sets 5 Peso Coins
     * @param numFivePesos
     */
    public void setFivePesos(int numFivePesos) {
        this.numFivePesos = numFivePesos;
    }

    /**
     * Sets 1 Peso Coins
     * @param numOnePeso
     */
    public void setOnePeso(int numOnePeso) {
        this.numOnePeso = numOnePeso;
    }

    /**
     * Returns the total amount of money based on the current number of bills
     * @return total
     */
    public int getTotalAmount() { // Gets Total Amount of Money
        int total = 0;
        total += this.numOneThousandPesos * 1000;
        total += this.numFiveHundredPesos * 500;
        total += this.numHundredPesos * 100;
        total += this.numTwoHundredPesos * 200;
        total += this.numFiftyPesos * 50;
        total += this.numTwentyPesos * 20;
        total += this.numTenPesos * 10;
        total += this.numFivePesos * 5;
        total += this.numOnePeso * 1;

        return total;
    }

    /**
     * Displays the number of bills in the vending machine
     */
    public void getBills() {
        System.out.println("1000 pesos = " + this.numOneThousandPesos);
        System.out.println("500 pesos = " + this.numFiveHundredPesos);
        System.out.println("200 pesos = " + this.numTwoHundredPesos);
        System.out.println("100 pesos = " + this.numHundredPesos);
        System.out.println("50 pesos = " + this.numFiftyPesos);
        System.out.println("20 pesos = " + this.numTwentyPesos);
        System.out.println("10 pesos = " + this.numTenPesos);
        System.out.println("5 pesos = " + this.numFivePesos);
        System.out.println("1 pesos = " + this.numOnePeso);
    }

}
