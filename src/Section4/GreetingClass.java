package Day1;

public class GreetingClass {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("Hello Soufiane!");
//
//        boolean isAlien = false;
//
//        if (!isAlien) {
//            System.out.println("It is not an Alien.");
//            System.out.println("I'm scared of Aliens !.");
//        }
//
//        int topScore = 99;
//
//        if(topScore > 80){
//            System.out.println("You got the highest score !");
//        }
//
//        int secondTopScore = 60;
//
//        if (topScore > secondTopScore && topScore < 100){
//            System.out.println("Greater than second top score and less than 100");
//        }

        String makeOfCar = "Volkswagen";

        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println("This is domestic to our country.");
        }

        int age = 20;

        String ageOfClient = (age >= 18) ? "Over Eighteen" : "Still a kid.";
        System.out.println(ageOfClient);

    }
}
