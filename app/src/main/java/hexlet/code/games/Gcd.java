package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.getRounds(); i++) {
            int firstValue = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int secondValue = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int rightAnswer = 0;

            int tempFirstValue = firstValue;
            int tempSecondValue = secondValue;

            while (tempSecondValue != 0) {
                rightAnswer = tempSecondValue;
                tempSecondValue = tempFirstValue % tempSecondValue;
                tempFirstValue = rightAnswer;
            }

            System.out.println(Engine.getQuestionText() + firstValue + " " + secondValue);
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
}
