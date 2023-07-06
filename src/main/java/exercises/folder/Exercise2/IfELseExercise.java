package exercises.folder.Exercise2;

class MethodsChallenge  {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Dan", highScorePosition);

        highScorePosition = calculateHighScorePosition(3000);
        displayHighScorePosition("BugDan", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Thomas", highScorePosition);

        highScorePosition = calculateHighScorePosition(70);
        displayHighScorePosition("Freddy", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int highsScorePosition)
    {
        System.out.printf("%s managed to get into %d position on the highscore list", playerName, highsScorePosition);
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }


    }
}