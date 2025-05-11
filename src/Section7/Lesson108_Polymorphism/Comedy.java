package Section7.Lesson108_Polymorphism;

public class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Pleasant Scene", "Funny Scene", "Something Happy Happens");
    }

    public void watchComedy() {
        System.out.println("Watching Comedy movie!");
    }
}
