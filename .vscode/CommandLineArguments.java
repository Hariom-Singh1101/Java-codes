public class CommandLineArguments {
    public static void main(String[] args) {
        // Check if there are command-line arguments
        if (args.length > 0) {
            // Assuming the first argument is a numeric value
            String numericArgument = args[0];

            try {
                // Convert the string argument to an integer
                int numericValue = Integer.parseInt(numericArgument);

                // Now you can use the numericValue in your program
                System.out.println("Numeric argument entered: " + numericValue);

                // You can perform operations with numericValue here

            } catch (NumberFormatException e) {
                // Handle the case where the argument is not a valid integer
                System.err.println("Error: Please enter a valid numeric argument.");
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}
