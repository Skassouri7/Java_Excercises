package Section5;

public class Lesson48 {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Abdul", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Yacoub", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("Soufiane", highScorePosition);
    }

    public static void displayHighScorePosition(String name, int positionOnList) {

        System.out.println(name + " managed to get into position " + positionOnList + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
