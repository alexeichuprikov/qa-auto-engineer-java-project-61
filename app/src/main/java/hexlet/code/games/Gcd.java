package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void play() {
        String optionDescription = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndCorrectAnswers = new String[Engine.getRounds()][2];

        for (int i = 0; i < Engine.getRounds(); i++) {
            int firstValue = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int secondValue = (int) (Math.random() * Engine.getMaxNumber()) + 1;

            int tempFirstValue = firstValue;
            int tempSecondValue = secondValue;
            int tempAnswer = 0;

            while (tempSecondValue != 0) {
                tempAnswer = tempSecondValue;
                tempSecondValue = tempFirstValue % tempSecondValue;
                tempFirstValue = tempAnswer;
            }

            String question = firstValue + " " + secondValue;
            String correctAnswer = String.valueOf(tempAnswer);

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }
}

