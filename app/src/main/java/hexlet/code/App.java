package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice : ");
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.play();
                break;
            case "3":
                Calc.play();
                break;
            case "4":
                Gcd.play();
                break;
        }
        scanner.close();
    }

}