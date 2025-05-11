package Section7.Lesson114_Challenge;

public class Drink {
    private String name;
    private double price;
    private String size;

    public Drink(){
        this("Coke", 2.50, "regular");
    }

    public Drink(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        switch (size){
            case "small" -> price = 1.50;
            case "regular" -> price = 2.5;
            case "large" -> price = 3;
        }

        return price;
    }

    public String getName() {
        return name;
    }

    public String getSize(){
        return size;
    }
}
