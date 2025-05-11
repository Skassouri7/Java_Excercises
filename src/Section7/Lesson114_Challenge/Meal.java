package Section7.Lesson114_Challenge;

public class Meal {
    private Hamburger hamburger;
    private Drink drink;
    private Extra extra;
    private double totalPricing;

    public Meal(){
        this(new Drink(), new Hamburger(), new Extra());
    }

    public Meal(Drink drink, Hamburger hamburger, Extra extra) {
        this.drink =  drink;
        this.hamburger = hamburger;
        this.extra = extra;
        totalPricing += drink.getPrice() + hamburger.getPrice() + extra.getPrice();
    }

    public double getTotalpricing() {
        return totalPricing;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "hamburger=" + hamburger.getType() + ", price: " + hamburger.getPrice() +
                ", drink=" + drink.getName() + ", " + drink.getSize() + ", price: " + drink.getPrice() +
                ", extra=" + extra.getName() + ", price: " + extra.getPrice() +
                ", Totalpricing=" + totalPricing +
                '}';
    }
}
