import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertTrue;

public class KidsMealTest {

    @Test
    public void calculatePrice_kidsMealIncreasePrice(){

        //Given
        ArrayList<String> spices = new ArrayList<>();
        spices.add("Salt");
        spices.add("Pepper");
        ArrayList <String> sauces = new ArrayList<>();
        sauces.add("Mayo");
        sauces.add("Ketchup");
        KidsMeal kidsBurguer = new KidsMeal (3.0, spices, sauces);

        //When
        Double price = kidsBurguer.calculatePrice();

        //Then
        assertTrue(kidsBurguer.basePrice < price);
    }

}
