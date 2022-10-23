import java.util.ArrayList;

public class VeggieMeal extends Meal{

    //Constructor
    public VeggieMeal(Double basePrice, ArrayList<String> spices, ArrayList<String> sauces) {
        super(basePrice, spices, sauces);
    }

    //Methods
    @Override
    public Double calculatePrice() {
        Double speciesPrice = spices.size() * 0.01;
        Double saucesPrice = sauces.size() * 2.0;
        Double fullPrice = this.basePrice + speciesPrice + saucesPrice;
        System.out.println(fullPrice);
        return fullPrice;
    }
}
