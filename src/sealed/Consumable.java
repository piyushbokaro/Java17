package sealed;

public sealed interface Consumable permits Beverage {
    public void consume();
}
