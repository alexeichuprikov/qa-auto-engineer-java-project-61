package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.rounds; i++) {
            int firstValue = (int) (Math.random() * 100) + 1;
            int secondValue = (int) (Math.random() * 100) + 1;
            int rightAnswer = 0;

            int tempFirstValue = firstValue;
            int tempSecondValue = secondValue;

            while (tempSecondValue != 0) {
                rightAnswer = tempSecondValue;
                tempSecondValue = tempFirstValue % tempSecondValue;
                tempFirstValue = rightAnswer;
            }

            System.out.println(Engine.answerText + firstValue + " " + secondValue);
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
}
