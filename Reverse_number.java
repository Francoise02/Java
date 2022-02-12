// Import Scanner from java util
import java.util.Scanner;

// Declare a class
public class Reverse_number {

    // Create main method
    public static void main(String[] args){

        int actualNumber = 0;
        int reverseNumber = 0;

        // Ask user to input a number they would like to reverse
        System.out.print("Enter a number you want to reverse: ");

        // Adding an inputted number into a variable
        Scanner in = new Scanner(System.in);
        actualNumber = in.nextInt();


        // Create while Loop to reverse entered number
        while( actualNumber != 0 ){
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + actualNumber % 10;
            actualNumber = actualNumber / 10;
        }

        // Print the reversed number
        System.out.println("The reversed version of your number is: " + reverseNumber);
    }

}
