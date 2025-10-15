package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.getRounds(); i++) {
            int num = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            String rightAnswer = logicPrime(num);

            System.out.println(Engine.getQuestionText() + num);
            System.out.print(Engine.getAnswerText());
            String answer = scanner.next();

            if (answer.equals(rightAnswer)) {
                System.out.println(Engine.getCorrectAnswer());
            } else {
                System.out.printf(Engine.getWrongAnswer(), answer, rightAnswer);
                System.out.printf(Engine.getRetry(), userName);
                return;
            }
        }
        System.out.printf(Engine.getCongratulations(), userName);
    }


    public static String logicPrime(int num) {
        if (num < 2) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
