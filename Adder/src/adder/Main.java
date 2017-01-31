package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Please ensure only numeric arguments are passed");
        } catch (Exception e) {
            System.err.println("Please provide any number of integers to add");
        }
    }

    private static int addArguments(String... args) throws Exception {
        int sum = 0;

        if(args.length == 0) {
            throw new Exception("No arguments passed");
        }
        else if(args[0].equals("-")) {
            args[0] = "0"; //Prevents exception being thrown in following loop

            for(String arg : args) {
                sum -= Integer.valueOf(arg);
            }
        }
        else {
            for(String arg : args) {
                sum += Integer.valueOf(arg);
            }
        }

        return sum;
    }
}
