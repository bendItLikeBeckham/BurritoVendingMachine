import java.util.ArrayList;
import java.util.Scanner;

public class Burrito {
    private ArrayList<Food> ingredients = new ArrayList<Food>();
    private int calories;
    private ArrayList<Integer> list;


    /**
     * Class Constructor
     */
    public Burrito(ArrayList<Integer> list, int calories, ArrayList<Food> ingredients) {
        this.list = list;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    /**
     * Prints the methods in cooking the ingredients
     */
    public void printCookingDisplay() {
        for(Food f : this.ingredients) {
            printIngredientMsg(f.getName(), this.list);
        }
    }

    /**
     * Checks the name of the string and assign a specific cooking string per ingredient while also validating if the number of ingredients is more than 0
     * @param name is the name of the food
     * @param list is the integer ArrayList that contains the quantity of each ingredient
     */
    public void printIngredientMsg(String name, ArrayList<Integer> list) {
        if (name == "Tortilla" && this.list.get(0) > 0) {
            System.out.println("Heating each side of the tortilla.....");
        }
        else if (name == "Beef" && this.list.get(1) > 0) {
            System.out.println("Cooking the beef to well done.....");
        }
        else if (name == "BlackBeans" && this.list.get(2) > 0) {
            System.out.println("Baking the black beans.....");
        }
        else if (name == "ChilliPepper" && this.list.get(3) > 0) {
            System.out.println("Mincing the chilli peppers.....");
        }
        else if (name == "Tomato" && this.list.get(4) > 0) {
            System.out.println("Cutting the tomatos.....");
        }
        else if (name == "Lettuce" && this.list.get(5) > 0) {
            System.out.println("Chopping the lettuce.....");
        }
        else if (name == "HotSauce" && this.list.get(6) > 0) {
            System.out.println("Pouring the hot sauce.....");
        }
        else if (name == "Onion" && this.list.get(7) > 0) {
            System.out.println("Chopping the onions.....");
        }
    }

     /**
     * Gets ingredients
     */
    public ArrayList<Food> getIngredients() {
        return this.ingredients;
    }

     /**
     * Gets calories 
     */
    public int getCalories() {
        return this.calories;
    }

     /**
     * Asks the user if they want the optional free sauce on their burrito
     */
    public String getAdditionalSauce () {

        Scanner sc = new Scanner(System.in);   
        String sauce;

        do {
            System.out.println("What sauce would you like : Chipotle, Ranch, ThousandIsland, or None (input X).....");
            sauce = sc.next(); 
        } while (!sauce.equalsIgnoreCase("Chipotle") && !sauce.equalsIgnoreCase("Ranch") && !sauce.equalsIgnoreCase("ThousandIsland")  && !sauce.equalsIgnoreCase("X"));

        return sauce; 
    }

    public void serveBurrito () {
        if (!getAdditionalSauce().equalsIgnoreCase("X"))
            System.out.println("Your customizable burrito with a side of " + getAdditionalSauce() + " sauce on the side is now ready! Enjoy!");
        else 
            System.out.println("Your customizable burrito with no sauce on the side is now ready! Enjoy!");

    }

}