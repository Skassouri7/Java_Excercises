package Section6;

import java.util.Scanner;

public class Lesson71_Parsing {
    public static void main(String[] args) {

        int currentYear  = 2025;
        String usersDateOfBirth = "2002";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWtihPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWtihPartialYear);

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }


    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, what's your name: ");
        System.out.println("Hi " + name + ", Thanks for taking this course!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, what's your name: ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking this course!");

        boolean validDOB = false;
        int age = 0;

        do {

            System.out.println("What year were you born?");

            try {
                age = checkData(currentYear, sc.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException e){
                System.out.println("Try again. Invalid Input!");
            }
        }while (!validDOB);


        return "So you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);

        int minBirthYear = currentYear - 125;

        if (dob > minBirthYear && dob < currentYear){
            return currentYear - dob;
        }

        return -1;
    }
}
