package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void play() {
        String optionDescription = "What is the result of the expression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.getRounds()][2];

        for (int i = 0; i < Engine.getRounds(); i++) {
            int firstValue = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int secondValue = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            char[] signs = {'+', '-', '*'};
            char randomSign = signs[(int) (Math.random() * signs.length)];

            String question = firstValue + " " + randomSign + " " + secondValue;
            String correctAnswer = "";

            switch (randomSign) {
                case '+':
                    correctAnswer = String.valueOf(firstValue + secondValue);
                    break;
                case '-':
                    correctAnswer = String.valueOf(firstValue - secondValue);
                    break;
                case '*':
                    correctAnswer = String.valueOf(firstValue * secondValue);
                    break;
                default:
                    correctAnswer = "Неизвестный оператор: " + randomSign;
            }

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;

        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }
}
