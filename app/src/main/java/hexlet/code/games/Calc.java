package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void play() {
        String userName = Engine.description();
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

            System.out.println("Question: " + firstValue + " " + randomSign + " " + secondValue);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == rightAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'." );
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
