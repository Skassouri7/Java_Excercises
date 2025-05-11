package Section7.Lesson112_Challenge;

public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("This engine has " + cylinders + " cylinders");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("This car will drive for approximately " + avgKmPerLitre + " Km per litre");
    }
}
