package Section7.Lesson77;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("Red");
        car.setDoors(4);
        car.setConvertible(true);
        car.setMake("Tesla");
        car.setModel("Model X");

        car.describeCar();

        Car modelY = new Car();

        modelY.setColor("Black");
        modelY.setDoors(4);
        modelY.setConvertible(true);
        modelY.setMake("Tesla");
        modelY.setModel("Model Y");

        modelY.describeCar();
    }
}
