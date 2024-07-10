package sealed;

public class App {
    public static void enjoyConsumable(Consumable consumable) {
        switch (consumable) {
            case Coffee coffee -> coffee.addCream();
            case Tea tea -> tea.stir();
            default -> System.out.println("Its ready to go");
        }
        consumable.consume();
    }
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        Beverage beverage = new Beverage();

        enjoyConsumable(coffee);
        enjoyConsumable(tea);
        enjoyConsumable(beverage);
    }
}
