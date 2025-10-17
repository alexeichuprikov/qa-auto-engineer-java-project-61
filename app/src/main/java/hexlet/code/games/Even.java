package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String optionDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int random = (int) (Math.random() * MAX_NUMBER) + 1;
            String question = String.valueOf(random);
            boolean isEven = random % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }
}
