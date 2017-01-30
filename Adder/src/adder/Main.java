package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide any number of integers to add");
        }
    }

    private static int addArguments(String... args) throws Exception {
        if(args.length == 0)
            throw new Exception("No arguments passed");

        int sum = 0;
        for(String arg : args) {
            sum += Integer.valueOf(arg);
        }
        return sum;
    }
}
