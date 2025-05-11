package Section7.Lesson114_Challenge;

public class Hamburger {
    private String type;
    private Topping topp1;
    private Topping topp2;
    private Topping topp3;
    private double price;
    private int extraToppingCount;

    public Hamburger(){
        this("Regular Burger", 6.50);
        this.extraToppingCount = 0;
    }

    public Hamburger(String name, double price) {
        this.type = name;
        this.price = price;
    }

    public void addExtraToppings(String topp){
        extraToppingCount += 1;
        if (extraToppingCount > 3){
            System.out.println("You have added the maximum amount of toppings!");
            return;
        }
        if (){

        }
        Topping topp1  = new Topping(topp);
        price += topp1.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
