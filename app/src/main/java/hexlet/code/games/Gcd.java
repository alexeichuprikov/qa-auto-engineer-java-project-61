package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void play() {
        String userName = Engine.description();
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

            System.out.println("Question: " + firstValue + " " + secondValue);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == rightAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
