public class HelloApp {
    public static void main(String[] args) {

        // Check if command-line arguments are provided
        if (args.length > 0) {
            System.out.print("Hello ");
            
            // Print all arguments
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
            }
        } else {
            // Default message if no arguments
            System.out.println("Hello World");
        }
    }
}