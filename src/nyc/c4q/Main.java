package nyc.c4q;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        boolean notDone = true;
        while (notDone) {
            while (hangman.getMisses() < 5) {
                hangman.printCurrentWord();
                hangman.promptPlayer("Enter a letter: ");
                hangman.readLetter();
                hangman.checkLetter();
                if (hangman.guessedSuccessfully()) {
                    break;
                }
                System.out.println(Drawing.get(hangman.getMisses()));
                System.out.println("Misses -> " + hangman.getMisses());
            }
            if (hangman.guessedSuccessfully()) {
                System.out.println("Success");
            } else {
                System.out.println("The answer was " + hangman.getSecretWord());
            }
            System.out.println("Do you want to play again?");

        public static String readString () {
            Scanner scanner = new Scanner(System.in);
            return scanner.next();
        }


        boolean isValidInput = true;

        do {
            String userAnswer = "getInput";
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.equals("yes") || userAnswer.equals("y")) {
                notDone = true;
            } else if (userAnswer.equals("no") || userAnswer.equals("n")) {
                notDone = false;
            } else {
                System.out.println("Please select Yes or No.");
            }

        } while (!isValidInput){

            if (isValidInput == true) {

            }

        }
    }
    }
}