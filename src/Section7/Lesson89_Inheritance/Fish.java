package Section7.Lesson89_Inheritance;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("Muscles moving!");
    }

    private void moveBackFin(){
        System.out.println("Backfin moving!");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();

        if (speed == "fast"){
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                ", fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
