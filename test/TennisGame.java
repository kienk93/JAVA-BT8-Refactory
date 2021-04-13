package test;

public class TennisGame {

    public static final String Zero = "Love-All";
    public static final String FIFTEEN = "Fifteen-All";
    public static final String THIRTY = "Thirty-All";
    public static final String FORTY = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN1 = "Fifteen";
    public static final String THIRTY1 = "Thirty";
    public static final String FORTY1 = "Forty";

    public static String getScore(String firstPlayer, String secondPlayer, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String score1 = "";
        int score2 = 0;
        boolean isScoreEquals = scoreOfFirstPlayer == scoreOfSecondPlayer;
        if (isScoreEquals) {
            switch (scoreOfFirstPlayer) {
                case 0:
                    score1 = Zero;
                    break;
                case 1:
                    score1 = FIFTEEN;
                    break;
                case 2:
                    score1 = THIRTY;
                    break;
                case 3:
                    score1 = FORTY;
                    break;
                default:
                    score1 = DEUCE;
                    break;

            }
        } else if (scoreOfFirstPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            int MinusTwoScore = scoreOfFirstPlayer - scoreOfSecondPlayer;
            int minusResult = MinusTwoScore;
            if (minusResult == 1) score1 = "Advantage player1";
            else if (minusResult == -1) score1 = "Advantage player2";
            else if (minusResult >= 2) score1 = "Win for player1";
            else score1 = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) score2 = scoreOfFirstPlayer;
                else {
                    score1 += "-";
                    score2 = scoreOfSecondPlayer;
                }
                switch (score2) {
                    case 0:
                        score1 += LOVE;
                        break;
                    case 1:
                        score1 += FIFTEEN1;
                        break;
                    case 2:
                        score1 += THIRTY1;
                        break;
                    case 3:
                        score1 += FORTY1;
                        break;
                }
            }
        }
        return score1;
    }
}
