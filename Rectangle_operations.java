// Importing scanner class from the util package
import java.util.*;

// Declaring the java class
class Rectangle_operations
{
    // Creating main method
    public static void main(String[] args)
    {
        // Declare System.in as a standard input stream from scanner
        Scanner sc= new Scanner(System.in);

        // Greetings
        System.out.println(" ");
        System.out.println("Hello ✋\nWith this app you will be able to find perimeter and surface area of rectangle \uD83D\uDC83 ");
        System.out.println("Let's get started :)");
        System.out.println(" ");

        // Ask user to input the length of rectangle
        System.out.print("Enter the length of your rectangle: ");


        // Declaring user input(length) as double data type
        double length_double = sc.nextDouble();

        // Ask user to input the width of rectangle
        System.out.print("Enter the width of your rectangle: ");

        // Declaring user input(width) as double datatype
        double width_double = sc.nextDouble();


        // Calculating perimeter of the rectangle in double data type
        double perimeter_double = 2 * (length_double + width_double);

        // Converting perimeter of the rectangle from double data type to integer
        int perimeter_int = (int) perimeter_double;

        // Converting perimeter of the rectangle from double data type to short
        short perimeter_short = (short) perimeter_double;

        // Converting perimeter of the rectangle from double data type to long
        long perimeter_long = (long) perimeter_double;

        // Calculating surface area of the rectangle in double data type
        double surfaceArea_double = length_double * width_double;

        // Converting surface area of the rectangle from double data type to integer
        int surfaceArea_int = (int) surfaceArea_double;

        // Converting surface area of the rectangle from double data type to short
        short surfaceArea_short = (short) surfaceArea_double;

        // Converting surface area of the rectangle from double data type to long
        long surfaceArea_long = (long) surfaceArea_double;

        // Leave space for better presentaion
        System.out.println(" ");

        // Printing value of perimeter of the rectangle in each data type
        System.out.println("The perimeter of rectangle in double data type is: " + String.format("%.4f", perimeter_double));
        System.out.println("The perimeter of rectangle in integer data type is: " + perimeter_int);
        System.out.println("The perimeter of rectangle in short data type is: " + perimeter_short);
        System.out.println("The perimeter of rectangle in long data type is: " + perimeter_long);

        // Leave space for better presentation
        System.out.println(" ");

        // Printing the surface area of the rectangle in each data type
        System.out.println("The surface area of rectangle in double data type is: " + String.format("%.4f", surfaceArea_double));
        System.out.println("The surface area of rectangle in integer data type is: " + surfaceArea_int);
        System.out.println("The surface area of rectangle in short data type is: " + surfaceArea_short);
        System.out.println("The surface area of rectangle in long data type is: " + surfaceArea_long);

        // Closing message
        System.out.println("Thank you for using calculator :)");

    }
}



