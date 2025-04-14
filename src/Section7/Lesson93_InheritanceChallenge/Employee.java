package Section7.Lesson93_InheritanceChallenge;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static long id = 1;

    public Employee(){
        this.employeeId = Employee.id++;
        this.hireDate = "N/A";
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        employeeId = Employee.id++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
