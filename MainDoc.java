import java.util.Scanner;

/**
 * Main class to calculate and display the sum of squares of the first N Luke numbers.
 * <p>
 * This class prompts the user for input, creates an array of LukeNumber objects,
 * calculates the sum of squares of the first N Luke numbers, and displays the results.
 * </p>
 */
public class MainDoc {

    /**
     * Main method to execute the program.
     *
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = scanner.nextInt();

        // Create an array of LukeNumber objects
        LukeNumberDoc[] lukeNumbers = new LukeNumberDoc[n];
        long sumOfSquares = 0;

        for (int i = 1; i <= n; i++) {
            lukeNumbers[i - 1] = new LukeNumberDoc(i);
            sumOfSquares += lukeNumbers[i - 1].getSquare();
        }

        // Display the results
        System.out.println("The sum of squares of first " + n + " Luke numbers is: " + sumOfSquares);

        // Close the scanner object
        scanner.close();
    }
}