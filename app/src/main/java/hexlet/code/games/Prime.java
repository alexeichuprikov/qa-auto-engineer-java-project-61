package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void play() {
        String userName = Engine.description();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.rounds; i++) {
            int num = (int) (Math.random() * 100) + 1;
            String rightAnswer = Prime(num);

            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }


    public static String Prime(int num) {
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
