package Section7.Lesson93_InheritanceChallenge;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){
        this("N/A", "N/A");
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        return  2025 - Integer.parseInt(birthDate);
    }

    public double collectPay(){
        return 100;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println(name + " will be terminated by " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
