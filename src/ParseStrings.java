public class ParseStrings {

    public static void main(String[] args) {
        String numberStr = args[0]; // Get the first command line argument
        int number = Integer.parseInt(numberStr);
        System.out.println("Parsed number: " + number);

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("Argument " + i + ": " + arg);
        }
    }
}
