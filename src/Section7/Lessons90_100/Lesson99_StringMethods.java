package Section7.Lessons90_100;

public class Lesson99_StringMethods {
    public static void main(String[] args) {
        String birthDate = "06/10/1982";
        int startingIndex = 6;
        System.out.println("StartingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "06", "10", "2002");
        System.out.println("New Date: " + newDate);

        System.out.println(newDate.replace('/', '_'));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("     ABC\n".repeat(3).indent(-4));
        System.out.println("-".repeat(20));
    }
}
