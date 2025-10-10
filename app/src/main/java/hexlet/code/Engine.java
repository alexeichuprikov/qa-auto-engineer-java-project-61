package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String description() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }

    public static int rounds = 3;
}
