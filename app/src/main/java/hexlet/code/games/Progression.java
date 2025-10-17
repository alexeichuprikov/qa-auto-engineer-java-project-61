package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final int MAX_NUMBER = 100;
    private static final int STEP_COUNT = 10;
    private static final int VALUE_COUNT = 10;

    public static void play() {
        String optionDescription = "What number is missing in the progression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = (int) (Math.random() * MAX_NUMBER) + 1;
            int step = (int) (Math.random() * STEP_COUNT) + 1;
            int hideIndex = (int) (Math.random() * VALUE_COUNT);

            String[] sequence = addSequence(start, step, VALUE_COUNT);
            String correctAnswer = sequence[hideIndex];

            sequence[hideIndex] = "..";
            String question = String.join(" ", sequence);

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }

    public static String[] addSequence(int start, int step, int length) {
        String[] sequence = new String[length];

        for (int i = 0; i < length; i++) {
            sequence[i] = String.valueOf(start + i * step);
        }
        return sequence;
    }
}
