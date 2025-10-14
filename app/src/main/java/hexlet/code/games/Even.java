package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Engine.rounds; i++) {
            int random = (int) (Math.random() * 1000) + 1; //границы случайных чисел не были обозначены сделал от 1 до 1000. требуется уточнение у аналитика :)
            System.out.println(Engine.questionText + random);
            System.out.print(Engine.answerText);
            String answer = scanner.nextLine();

            boolean isEven = random % 2 == 0;
            String rightAnswer = isEven ? "yes" : "no";


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
}
