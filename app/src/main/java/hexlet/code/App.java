package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice : ");
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.evenGame();
                break;

        }
        scanner.close();
    }

}