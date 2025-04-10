package Section7.Lesson80_BankChallenge;

public class BankAccount {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(54324, 100, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty Constructor");
    }

    public BankAccount(int number, double balance, String name, String email, String phoneNumber){
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
    }

    public BankAccount(String email, String name, String phoneNumber) {
        this(99999, 0, name, email, phoneNumber);
    }

    public void withdrawAmount(double amount){
        if(amount > balance || amount < 0){
            return;
        }
        balance -= amount;
    }

    public void depositAmount(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
