package Section7.Lesson112_Challenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " -> Engine Started.");
    }

    public void drive(){
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Engine is running.");
    }
}
