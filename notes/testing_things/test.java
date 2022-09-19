class MultiplicationTableApp {

    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 20;

    private static final String ARGUMENT_COUNT_ERROR = "Exactly one command line argument required";
    private static final String ARGUMENT_FORMAT_ERROR = "Argument must be an integer";
    private static final String SIZE_ERROR = String.format(
            "Size must be between %d and %d", MIN_SIZE, MAX_SIZE);

    private static void printTable(int size) {
        if (size < MIN_SIZE || size > MAX_SIZE) {
            throw new IllegalArgumentException(SIZE_ERROR);
        }
        for (var i = 1; i <= size; i++) {
            for (var j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException(ARGUMENT_COUNT_ERROR);
            }
            printTable(Integer.parseInt(args[0]));
        } catch (NumberFormatException e) {
            System.err.println(ARGUMENT_FORMAT_ERROR);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}