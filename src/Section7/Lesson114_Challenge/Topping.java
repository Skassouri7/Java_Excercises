package Section7.Lesson114_Challenge;

public class Topping {
    private String type;
    private double price;

    public Topping(String type){
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        switch (this.type) {
            case "cheese" -> this.price = 0.5;
            case "sauce" -> this.price = 1;
            case "meat" -> this.price = 1.5;
        }
        return price;
    }
}
