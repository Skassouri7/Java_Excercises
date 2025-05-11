package Section7.Lesson112_Challenge;

public class HybridCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("This engine has " + cylinders + " cylinders");
        System.out.println("Battery Size: " + batterySize);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("This car will drive for approximately " + avgKmPerLitre + " km per litre");
    }
}
