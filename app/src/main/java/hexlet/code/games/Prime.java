package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.rounds; i++) {
            int num = (int) (Math.random() * 100) + 1;
            String rightAnswer = logicPrime(num);

            System.out.println(Engine.answerText + num);
            System.out.print(Engine.answerText);
            String answer = scanner.next();

            if (answer.equals(rightAnswer)) {
                System.out.println(Engine.correctAnswer);
            } else {
                System.out.printf(Engine.wrongAnswer, answer, rightAnswer);
                System.out.printf(Engine.retry, userName);
                return;
            }
        }
        System.out.printf(Engine.congratulations, userName);
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
