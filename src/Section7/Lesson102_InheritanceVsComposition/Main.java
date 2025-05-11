package Section7.Lesson102_InheritanceVsComposition;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 24,  "2560p x 1440p");
        Motherboard theMotherboard = new Motherboard("B650m - S Wifi Pro", "MSI", 4, 6, "v1.94");

        PersonalComputer thePersonalComputer = new PersonalComputer("2208", "Dell", theMonitor, theMotherboard, theCase);
//        thePersonalComputer.getMonitor().printPixelAt(10, 10, "Red");
//        thePersonalComputer.getMotherboard().loadProgram("WindowOS");
//        thePersonalComputer.getComputerCase().pressPowerButton();
        thePersonalComputer.powerUp();
    }
}
