package Section7.Lesson97_100;

public class Lesson100_StringBuilder {
    public static void main(String[] args) {
        String helloWorld = "Hello " + "World";
        helloWorld = helloWorld.concat(" and goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }

    public static void printInformation(String string){
        System.out.println("String: " + string);
        System.out.println("Lenght: " + string.length());
    }
    public static void printInformation(StringBuilder builder){
        System.out.println("String: " + builder);
        System.out.println("Lenght: " + builder.length());
    }

}
