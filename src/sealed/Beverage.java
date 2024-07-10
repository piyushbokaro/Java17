package sealed;

public sealed class Beverage implements Consumable permits Coffee, Tea {
    private double temperature;

    @Override
    public void consume() {
        System.out.println("Consume Beverage");
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void heatUp() {
        this.temperature = 200.5;
    }
}
