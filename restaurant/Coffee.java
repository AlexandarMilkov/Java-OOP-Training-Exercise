package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    final static private double COFFEE_MILLILITERS = 50;
    final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private double caffeine;

    public double getCaffeine() {
        return caffeine;
    }

    public Coffee(String name, BigDecimal price, double milliliters, double caffeine) {
        super(name, price, milliliters);
        super.setMilliliters(COFFEE_MILLILITERS);
        super.setPrice(COFFEE_PRICE);
    }
}
