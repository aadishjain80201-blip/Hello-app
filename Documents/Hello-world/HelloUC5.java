public class HelloUC5 {
    public static void main(String[] args) {

        // If no command-line arguments, print default message
        if (args.length == 0) {
            System.out.println("Hello");
        } else {
            // Use enhanced for loop to print Hello with each argument
            for (String arg : args) {
                System.out.println("Hello " + arg);
            }
        }
    }
}
