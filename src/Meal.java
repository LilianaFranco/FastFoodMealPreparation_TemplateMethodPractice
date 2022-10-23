import java.util.ArrayList;

public abstract class Meal {

    //Properties
    Double basePrice;
    ArrayList <String> spices;
    ArrayList <String> sauces;

    //Constructor
    public Meal(Double basePrice, ArrayList<String> spices, ArrayList<String> sauces) {
        this.basePrice = basePrice;
        this.spices = spices;
        this.sauces = sauces;
    }

    //Getters and Setters

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public ArrayList<String> getSpices() {
        return spices;
    }

    public void setSpices(ArrayList<String> spices) {
        this.spices = spices;
    }

    public ArrayList<String> getSauces() {
        return sauces;
    }

    public void setSauces(ArrayList<String> sauces) {
        this.sauces = sauces;
    }

    //Method
    final void prepareMeal(){
        cookMeal();
        calculatePrice();
    }

    public void cookMeal(){
        System.out.println("Prepare this menu including:!" + this.spices + " and " + this.sauces);
    }

    public abstract Double calculatePrice();
}
