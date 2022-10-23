package FastFoodMealPreparationAndPrice;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertTrue;

public class VeggieMealTest {

    @Test
    public void calculatePrice_VeggieMealIncreasePrice(){

        //Given
        ArrayList<String> spices = new ArrayList<>();
        spices.add("Salt");
        spices.add("Pepper");
        ArrayList <String> sauces = new ArrayList<>();
        sauces.add("Mayo");
        sauces.add("Ketchup");
        VeggieMeal veggieMeal= new VeggieMeal(2.0, spices, sauces);

        //When
        Double price = veggieMeal.calculatePrice();

        //Then
        assertTrue(veggieMeal.basePrice < price);
    }
}
