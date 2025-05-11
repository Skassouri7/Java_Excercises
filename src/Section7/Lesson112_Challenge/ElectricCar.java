package Section7.Lesson112_Challenge;

public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("This car will drive for approximately " + avgKmPerCharge + " km per charge");
    }
}
