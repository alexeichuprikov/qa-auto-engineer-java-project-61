package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String optionDescription = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstValue = (int) (Math.random() * MAX_NUMBER) + 1;
            int secondValue = (int) (Math.random() * MAX_NUMBER) + 1;

            String question = firstValue + " " + secondValue;
            String correctAnswer = String.valueOf(calculateForCorrectAnswer(firstValue, secondValue));

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }

    public static int calculateForCorrectAnswer(int firstValue, int secondValue) {
        while (secondValue != 0) {
            int tempAnswer = secondValue;
            secondValue = firstValue % secondValue;
            firstValue = tempAnswer;
        }
        return firstValue;
    }
}

