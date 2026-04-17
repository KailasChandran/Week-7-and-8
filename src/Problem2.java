import java.util.Scanner;

class NaturalNumberSum {

    public int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a natural number: ");
            int n = input.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input.");
                System.exit(0);
            }

            NaturalNumberSum obj = new NaturalNumberSum();

            int recursiveResult = obj.recursiveSum(n);
            int formulaResult = obj.formulaSum(n);

            System.out.println("Recursive Sum: " + recursiveResult);
            System.out.println("Formula Sum: " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both results are equal.");
            } else {
                System.out.println("Results are not equal.");
            }
        }
    }
}