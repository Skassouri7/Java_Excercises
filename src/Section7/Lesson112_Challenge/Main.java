package Section7.Lesson112_Challenge;

public class Main {

    public static void main(String[] args) {
//        Car car1 = new Car("Tesla, Electric");
//        car1.startEngine();
//        car1.drive();

        Car car2 = new GasPoweredCar("Audi a5 2011", 400f, 4);
        car2.startEngine();
        car2.drive();
    }
}
