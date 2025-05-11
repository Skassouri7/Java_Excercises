package Section7.Lesson114_Challenge;

public class Extra {
    private String name;
    private double price;

    public Extra(){
        this("Fries", 4.50);
    }

    public Extra(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
