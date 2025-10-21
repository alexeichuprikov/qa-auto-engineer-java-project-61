package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String optionDescription = "What is the result of the expression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstValue = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int secondValue = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            char[] signs = {'+', '-', '*'};
            char randomSign = signs[Utils.generateNumber(0, signs.length - 1)];

            String question = firstValue + " " + randomSign + " " + secondValue;
            String correctAnswer = calculateForCorrectAnswer(firstValue, secondValue, randomSign);

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;

        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }

    public static String calculateForCorrectAnswer(int firstValue, int secondValue, char randomSign) {
        switch (randomSign) {
            case '+':
                return String.valueOf(firstValue + secondValue);
            case '-':
                return String.valueOf(firstValue - secondValue);
            case '*':
                return String.valueOf(firstValue * secondValue);
            default:
                throw new RuntimeException("Unknown randomSign " + randomSign);
        }
    }
}
