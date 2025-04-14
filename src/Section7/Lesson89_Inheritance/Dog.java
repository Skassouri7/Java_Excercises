package Section7.Lesson89_Inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("German Shepard", "Medium size", 45);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type == "wolf"){
            System.out.println("aaAWOooooooooo!");
        } else {
            bark();
            System.out.println();
        }
    }

    public void bark(){
        System.out.println("Woof!");
    }

    public void wagTail(){
        System.out.println("Tail Wagging");
    }

    public void run(){
        System.out.println("Dog Running");
    }

    public void walk(){
        System.out.println("Dog Walking");
    }

    public void move(String speed){
        super.move(speed);

        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }
}
