package Section5;

public class Lesson52 {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6, 0));
    }

    // conversion formula from inches to centimeters is 1 inch = 2.54cm.
    // one foot = 12 inches
    public static double convertToCentimeters(int height){
        return height * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches){
        return convertToCentimeters(heightInFeet * 12 + heightInInches);
    }
}
