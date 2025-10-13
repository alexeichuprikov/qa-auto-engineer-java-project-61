package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void play() {
        String userName = Engine.description();
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= Engine.rounds; i++) {
            int start = (int) (Math.random() * 20) + 1;
            int step = (int) (Math.random() * 10) + 1;
            int length = 10;
            int[] sequence = addSequence(start, step, length);

            int hideIndex = (int) (Math.random() * length);
            int hideValue = sequence[hideIndex];

            System.out.print("Question: ");
            for (int j = 0; j < length; j++) {
                if (j == hideIndex) {
                    System.out.print(".. ");
                } else {
                    System.out.print(sequence[j] + " ");
                }
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == hideValue) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + hideValue + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int[] addSequence(int start, int step, int length) {
        int[] sequence = new int[length];

        for (int i = 0; i < length; i++) {
            sequence[i] = start + i * step;
        }
        return sequence;
    }
}
