package Section7.Lesson108_Polymorphism;

public class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Pleasant Scene", "Science Scene", "Something Bad Happens");
    }

    public void watchScienceFiction() {
        System.out.println("Watching Science Fiction movie!");
    }
}
