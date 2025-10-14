package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.rounds; i++) {
            int firstValue = (int) (Math.random() * 100) + 1;
            int secondValue = (int) (Math.random() * 100) + 1;
            char signs[] = {'+', '-', '*'};
            char randomSign = signs[(int) (Math.random() * signs.length)];
            int rightAnswer = 0;

            switch (randomSign) {
                case '+':
                    rightAnswer = firstValue + secondValue;
                    break;
                case '-':
                    rightAnswer = firstValue - secondValue;
                    break;
                case '*':
                    rightAnswer = firstValue * secondValue;
                    break;
            }

            System.out.println(Engine.questionText + firstValue + " " + randomSign + " " + secondValue);
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
