package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String optionDescription = "What is the result of the expression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstValue = (int) (Math.random() * MAX_NUMBER) + 1;
            int secondValue = (int) (Math.random() * MAX_NUMBER) + 1;
            char[] signs = {'+', '-', '*'};
            char randomSign = signs[(int) (Math.random() * signs.length)];

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
