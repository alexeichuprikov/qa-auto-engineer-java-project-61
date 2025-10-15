package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.getRounds(); i++) {
            int random = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            System.out.println(Engine.getQuestionText() + random);
            System.out.print(Engine.getAnswerText());
            String answer = scanner.nextLine();

            boolean isEven = random % 2 == 0;
            String rightAnswer = isEven ? "yes" : "no";


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
}
