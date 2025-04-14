package Section7.Lesson93_InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(){
        this("N/A", "N/A", "N/A", "N/A", 0, false);
    }

    public SalariedEmployee(String name, String birthDate, String endDate,String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        terminate("12/12/2026");
        isRetired = true;
        System.out.println("You have retired.");
    }

}

