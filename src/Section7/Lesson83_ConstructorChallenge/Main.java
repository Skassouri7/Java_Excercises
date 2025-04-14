package Section7.Lesson83_ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer();
        System.out.println(cus1.getName());
        System.out.println(cus1.getCreditLimit());
        System.out.println(cus1.getEmail());

        System.out.println();

        Customer cus2 = new Customer("Soufiane", "KassouriSoufaine@gmail.com");
        System.out.println(cus2.getName());
        System.out.println(cus2.getCreditLimit());
        System.out.println(cus2.getEmail());

    }
}
