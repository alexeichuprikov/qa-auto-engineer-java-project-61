package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= Engine.rounds; i++) {
            int start = (int) (Math.random() * 20) + 1;
            int step = (int) (Math.random() * 10) + 1;
            int length = 10;
            int[] sequence = addSequence(start, step, length);

            int hideIndex = (int) (Math.random() * length);
            int rightAnswer = sequence[hideIndex];

            System.out.print(Engine.answerText);
            for (int j = 0; j < length; j++) {
                if (j == hideIndex) {
                    System.out.print(".. ");
                } else {
                    System.out.print(sequence[j] + " ");
                }
            }
            System.out.print(Engine.answerText);
            int answer = scanner.nextInt();

            if (answer == rightAnswer) {
                System.out.println(Engine.correctAnswer);
            } else {
                System.out.printf(Engine.wrongAnswer, answer, rightAnswer);
                System.out.printf(Engine.retry, userName);
                return;
            }
        }
        System.out.printf(Engine.congratulations, userName);
    }

    public static int[] addSequence(int start, int step, int length) {
        int[] sequence = new int[length];

        for (int i = 0; i < length; i++) {
            sequence[i] = start + i * step;
        }
        return sequence;
    }
}
