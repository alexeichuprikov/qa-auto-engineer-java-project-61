package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String optionDescription = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstValue = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int secondValue = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);

            String question = firstValue + " " + secondValue;
            String correctAnswer = String.valueOf(gcd(firstValue, secondValue));

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }

    public static int gcd(int firstValue, int secondValue) {
        while (secondValue != 0) {
            int tempAnswer = secondValue;
            secondValue = firstValue % secondValue;
            firstValue = tempAnswer;
        }
        return firstValue;
    }
}

