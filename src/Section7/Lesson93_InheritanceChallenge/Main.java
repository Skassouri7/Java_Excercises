package Section7.Lesson93_InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee soufiane = new SalariedEmployee("Soufiane", "2002", "2025", "02/05/2024", 30500, false);
        System.out.println(soufiane);
        System.out.println(soufiane.getAge());
        System.out.println(soufiane.collectPay());
        soufiane.terminate("2027");
        soufiane.retire();

        SalariedEmployee jack = new SalariedEmployee("Jack", "2002", "2025", "02/05/2024", 30500, false);
        System.out.println(jack);

        SalariedEmployee Sarah = new SalariedEmployee("Sarah", "2002", "2025", "02/05/2024", 30500, false);
        System.out.println(Sarah);
    }
}
