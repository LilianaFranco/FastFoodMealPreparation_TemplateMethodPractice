import java.util.ArrayList;

public class ClassicMeal extends Meal{

    //Constructor
    public ClassicMeal(Double basePrice, ArrayList<String> spices, ArrayList<String> sauces) {
        super(basePrice, spices, sauces);
    }

    //Methods
    @Override
    public Double calculatePrice() {
        Double fullPrice = this.basePrice;
        System.out.println(fullPrice);
        return fullPrice;
    }
}
