package hierarchy;

public class Motorcycle extends Vehicle {
    protected static final double DEFAULT_FUEL_CONSUMPTION = 8;
    public Motorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(this.DEFAULT_FUEL_CONSUMPTION);
    }
}
