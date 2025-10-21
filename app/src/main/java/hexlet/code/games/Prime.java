package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String optionDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int random = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);

            String question = String.valueOf(random);
            String correctAnswer = isPrime(random) ? "yes" : "no";

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;

        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }

    public static boolean isPrime(int random) {
        if (random < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(random); i++) {
            if (random % i == 0) {
                return false;
            }
        }
        return true;
    }
}
