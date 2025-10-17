package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String optionDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int random = (int) (Math.random() * MAX_NUMBER) + 1;

            String question = String.valueOf(random);
            String correctAnswer = logicPrime(random);

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;

        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }

    public static String logicPrime(int random) {
        if (random < 2) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(random); i++) {
            if (random % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
