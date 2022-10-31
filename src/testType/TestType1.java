package testType;

import java.util.Scanner;

public class TestType1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 1-10");

        boolean isRunning = true;

        while (isRunning) {

            int number = Integer.parseInt(scan.nextLine());

            if (number == 3) {
                isRunning = false;
            } else {
                System.out.println("Incorrect answer, try again!");
            }
        }
        System.out.println("You guessed the right number!");

    }
}
