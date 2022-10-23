package FastFoodMealPreparationAndPrice;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertTrue;

public class ClassicMealTest {

    @Test
    public void calculatePrice_basicMeal(){

        //Given
        ArrayList <String> spices = new ArrayList<>();
        spices.add("Salt");
        spices.add("Pepper");
        ArrayList <String> sauces = new ArrayList<>();
        sauces.add("Mayo");
        sauces.add("Ketchup");
        ClassicMeal classicBurguer = new ClassicMeal(4.0, spices, sauces);

        //When
        Double price = classicBurguer.calculatePrice();

        //Then
        assertTrue(classicBurguer.basePrice == price);
    }


}
