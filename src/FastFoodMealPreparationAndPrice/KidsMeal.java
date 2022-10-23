package FastFoodMealPreparationAndPrice;

import java.util.ArrayList;

public class KidsMeal extends Meal{

    //Constructor
    public KidsMeal(Double basePrice, ArrayList<String> spices, ArrayList<String> sauces) {
        super(basePrice, spices, sauces);
    }

    //Methods
    @Override
    public Double calculatePrice() {
        Double fullPrice = this.basePrice + 3.0;
        System.out.println(fullPrice);
        return fullPrice;
    }
}
