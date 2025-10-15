package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.getRounds(); i++) {
            int firstValue = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int secondValue = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            char[] signs = {'+', '-', '*'};
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
                default:
                    System.out.println("Неизвестный оператор: " + randomSign);
                    break;
            }

            System.out.println(Engine.getQuestionText() + firstValue + " " + randomSign + " " + secondValue);
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
