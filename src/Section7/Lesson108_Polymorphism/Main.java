package Section7.Lesson108_Polymorphism;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();
//
//        Adventure adventureMovie = new Adventure("Lord of the Rings");
//        adventureMovie.watchMovie();
//
//        ScienceFiction scienceMovie = new ScienceFiction("Star Trek");
//        scienceMovie.watchMovie();
//
//        Comedy comedyMovie = new Comedy("Shrek");
//        comedyMovie.watchMovie();

//        Movie.getMovie("Comedy", "Shrek").watchMovie();
//        Scanner s = new Scanner(System.in);
//
//        while (true){
//            System.out.print("Type A for an Adventure, C for a Comedy, and S for a Science Fiction movie. Type Q to quit the program: ");
//            String type  = s.nextLine();
//
//            if ("Qq".contains(type)){
//                break;
//            }
//
//            System.out.println("What is the movie's title: ");
//            String title = s.nextLine();
//
//            Movie.getMovie(type, title).watchMovie();
//        }

        Object unkownObject = Movie.getMovie("Comedy", "Shrek");

        if (unkownObject instanceof Comedy){
            ((Comedy) unkownObject).watchComedy();
        }
    }
}
