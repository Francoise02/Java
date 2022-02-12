// Java Program to guess a Random Number Generation

// Import Random and Scanner form java util
import java.util.Random;
import java.util.Scanner;

// Declare a class
public class Guessing_game {

    // Declare main method
    public static void main(String[] args)
    {

        // Store actual and guess number
        int answer, guess;

        // Declare maximum number which is 30
        final int maxNumber = 30;

        // Takes input using scanner
        Scanner in = new Scanner(System.in);

        // Random instance
        Random rand = new Random();

        boolean correct = false;

        // Correct answer
        answer = rand.nextInt(maxNumber) + 1;

        // Counting the number of trials
        int trials = 0;

        // loop until the guess is correct
        while (!correct) {

            // Ask the user to guess a number
            System.out.println("Enter a number between 0 and 30: ");

            // Incrementing the number of trials
            trials += 1;

            // Put user input into a variable
            guess = in.nextInt();

            // If guess is greater than actual
            if (guess > answer) {
                System.out.println("Too high, try again");
            }

            // If guess is less than actual
            else if (guess < answer) {
                System.out.println("Too low, try again");
            }

            // When guess is equal to actual number
            else {

                System.out.println("Matching");
                System.out.println("Found after " + trials + " trials");

                correct = true;
            }
        }
        System.exit(0);
    }


}
