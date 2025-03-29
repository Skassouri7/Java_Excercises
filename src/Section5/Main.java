package Section5;

public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.608344);

        int highScore = 50;
        int health = 100;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        if (highScore < 25 && highScore > 1000) {
            highScore = highScore - 1000;
        }
    }


}
