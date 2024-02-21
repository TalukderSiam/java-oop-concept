import java.util.Scanner;

public class siam {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter some data
        System.out.print("Please enter some data: ");
        
        // Read the user input
        String inputData = scanner.nextLine();
        
        // Output the data entered by the user
        System.out.println("You entered: " + inputData);
        
        // Close the scanner to release resources
        scanner.close();
    }
}
