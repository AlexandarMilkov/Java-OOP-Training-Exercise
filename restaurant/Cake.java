package restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert  {
    final static private double CAKE_GRAMS = 250;
    final static private double CAKE_CALORIES = 1000;

    public Cake(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams, calories);
        super.setCalories(this.CAKE_CALORIES);
        super.setGrams(this.CAKE_GRAMS);
    }
}
