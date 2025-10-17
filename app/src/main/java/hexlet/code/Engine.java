package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    //границы случайных чисел не были обозначены сделал от 1 до 100. требуется уточнение у аналитика

    public static void startGame(String optionDescription, String[][] questionsAndCorrectAnswers) {
        String userName = Cli.greet();
        System.out.println(optionDescription);
        Scanner scanner = new Scanner(System.in);

        for (String[] element : questionsAndCorrectAnswers) {
            String question = element[0];
            String correctAnswer = element[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

