package Section7.Lesson97_100;

public class Lesson97_StringManipulation {
    public static void main(String[] args) {
        String bulletIn = "Print a bulleted list:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIn);

        System.out.println();

        String textBlock = """
                Print a bulleted list:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

        int age = 23;
        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f%n%n", (float)age);

        for (int i = 1; i < 100000; i *= 10){
            System.out.printf("Printing %6d%n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your birth year is %d".formatted(yearOfBirth);
        System.out.println(formattedString);
    }
}
