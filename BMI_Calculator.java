// Importing scanner class from the util package
import java.util.Scanner;

// Declaring the java class
public class BMI_Calculator {

    // Create main method
    public static void main(String[] args) {

        // Declare System.in as a standard input stream from scanner
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");

        // Greetings
        System.out.println("Hello ✋\nYou're welcome to bmi calculator \uD83D\uDC83 ");

        // Leave space for better presentation
        System.out.println(" ");


        // Ask user to input their names
        System.out.print("Please enter your name: ");

        // Reading user input(name) as a string
        String name= sc.nextLine();

        // Print message to welcome the user
        System.out.println(" ");
        System.out.println("Alright " + name + " \uD83D\uDE0A");
        System.out.println("Let's get started :)");

        // Ask user to input their weight in kilograms
        System.out.println(" ");
        System.out.print("Enter your weight in kilogram: ");

        // Reading user input(weight) as double data type
        double weight = sc.nextDouble();

        // Ask users to input their height
        System.out.print("Enter your height in meters: ");

        // Reading user input as double data type
        double height = sc.nextDouble();

        // Calculating the BMI
        double bmi = weight / (height * height);

        // Printing user's BMI
        System.out.println(" ");
        System.out.println("Your Body Mass Index is " + String.format("%.2f", bmi) + " kg/m2");

        // Closing message
        System.out.println("Thank you for using the bmi calculator " + name + " :)");
    }
}

