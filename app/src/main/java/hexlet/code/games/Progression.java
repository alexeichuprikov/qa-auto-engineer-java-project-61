package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    private static final int STEP_COUNT = 10;
    private static final int VALUE_COUNT = 10;

    public static void play() {
        String userName = Cli.greet();
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= Engine.getRounds(); i++) {
            int start = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int step = (int) (Math.random() * STEP_COUNT) + 1;
            int[] sequence = addSequence(start, step, VALUE_COUNT);

            int hideIndex = (int) (Math.random() * VALUE_COUNT);
            int rightAnswer = sequence[hideIndex];

            System.out.print(Engine.getQuestionText());
            for (int j = 0; j < VALUE_COUNT; j++) {
                if (j == hideIndex) {
                    System.out.print(".. ");
                } else {
                    System.out.print(sequence[j] + " ");
                }
            }
            System.out.print(Engine.getAnswerText());
            int answer = scanner.nextInt();

            if (answer == rightAnswer) {
                System.out.println(Engine.getCorrectAnswer());
            } else {
                System.out.printf(Engine.getWrongAnswer(), answer, rightAnswer);
                System.out.printf(Engine.getRetry(), userName);
                return;
            }
        }
        System.out.printf(Engine.getCongratulations(), userName);
    }

    public static int[] addSequence(int start, int step, int length) {
        int[] sequence = new int[length];

        for (int i = 0; i < length; i++) {
            sequence[i] = start + i * step;
        }
        return sequence;
    }
}
