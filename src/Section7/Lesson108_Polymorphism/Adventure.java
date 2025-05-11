package Section7.Lesson108_Polymorphism;

public class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        System.out.println("Watching Adventure watching!");
    }
}
