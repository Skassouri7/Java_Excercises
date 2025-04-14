package Section5;

public class Main {
    /*
        Building A Decimal Comparator To Practice Floating-Point Comparisons In Java
        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

        The method should return boolean, and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

        EXAMPLES OF INPUT/OUTPUT:

        areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

        areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

        areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

        areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

        TIP: Use paper and pencil.

        TIP: Use casting.

        NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
        NOTE: Do not add a  main method to solution code.
     */
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        System.out.println("double number1: " + num1);
        System.out.println("double number2: " + num2);

        int newNum1 = (int) num1;
        int newNum2 = (int) num2;

        System.out.println("int number1: " + newNum1);
        System.out.println("int number2: " + newNum2);

        float remainderNum1 = (float)(num1 % 1.0);
        float remainderNum2 = (float)(num2 % 1.0);

        System.out.println("double number1 decimal place number1: " + remainderNum1);
        System.out.println("double number2 decimal place number2: " + remainderNum2);

        int threeDigitNum1 = (int)(remainderNum1 * 1000);
        int threeDigitNum2 = (int)(remainderNum2 * 1000);

        System.out.println("threeDigitNumber1: " + threeDigitNum1);
        System.out.println("threeDigitNumber2: " + threeDigitNum2);
        System.out.println("Completed");

        return threeDigitNum1 == threeDigitNum2 && newNum1 == newNum2;
    }
}
