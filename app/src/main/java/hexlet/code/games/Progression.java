package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    private static final int STEP_COUNT = 10;
    private static final int VALUE_COUNT = 10;

    public static void play() {
        String optionDescription = "What number is missing in the progression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int step = Utils.generateNumber(MIN_NUMBER, STEP_COUNT);
            int hideIndex = Utils.generateNumber(0, VALUE_COUNT - 1);

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
