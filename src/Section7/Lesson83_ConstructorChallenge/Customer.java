package Section7.Lesson83_ConstructorChallenge;

public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(){
        this("Default Name", "Default Email");
        System.out.println("Constructor with no args called.");
    }

    public Customer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

        System.out.println("Constructor with all args called");
    }

    public Customer(String name, String email){
        this(name, 0, email);
        System.out.println("Constructor with name and email args called");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
