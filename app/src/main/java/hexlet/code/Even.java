package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 1; i <= 3; i++) {
            int random = (int) (Math.random() * 1000) + 1; //границы случайных чисел не были обозначены сделал от 1 до 1000. требуется уточнение у аналитика :)
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = random % 2 == 0;
            String rightAnswer = isEven ? "yes" : "no";


            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer + "'.\nLet's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");

    }
}
