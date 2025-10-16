package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int STEP_COUNT = 10;
    private static final int VALUE_COUNT = 10;

    public static void play() {
        String optionDescription = "What number is missing in the progression?";
        String[][] questionsAndCorrectAnswers = new String[Engine.getRounds()][2];

        for (int i = 0; i < Engine.getRounds(); i++) {
            int start = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int step = (int) (Math.random() * STEP_COUNT) + 1;
            int hideIndex = (int) (Math.random() * VALUE_COUNT);
            int[] sequence = addSequence(start, step, VALUE_COUNT);

            String question = createQuestion(sequence, hideIndex);
            String correctAnswer = String.valueOf(sequence[hideIndex]);

            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(optionDescription, questionsAndCorrectAnswers);
    }

    public static int[] addSequence(int start, int step, int length) {
        int[] sequence = new int[length];

        for (int i = 0; i < length; i++) {
            sequence[i] = start + i * step;
        }
        return sequence;
    }

    public static String createQuestion(int[] sequence, int hideIndex) {
        String question = "";
        for (int i = 0; i < VALUE_COUNT; i++) {
            if (i == hideIndex) {
                question += ".. ";
            } else {
                question += sequence[i] + " ";
            }
        }
        return question;
    }
}
